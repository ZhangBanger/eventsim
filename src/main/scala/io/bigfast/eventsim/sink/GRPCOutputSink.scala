package io.bigfast.eventsim.sink

import com.google.protobuf.empty.Empty
import io.bigfast.tracking.{Event, TrackingGrpc}
import io.grpc.ManagedChannelBuilder
import io.grpc.stub.StreamObserver

class GRPCOutputSink(val grpcChannel: String, val topic: String) extends OutputSink[Event] {

  var streamObserver: StreamObserver[Event] = _

  // Take channel and set a stream
  override def open(): Unit = {
    val host = "tracking.bigfast.io"
    val port = 8443
    val channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build
    val stub = TrackingGrpc.stub(channel)
    streamObserver = stub.track(new StreamObserver[Empty] {
      override def onError(t: Throwable): Unit = println(t.printStackTrace())

      override def onCompleted(): Unit = println("onCompleted()")

      override def onNext(value: Empty): Unit = println(s"onNext(Empty)")
    })
    println(s"Opening GRPC bidirectional stream")
  }

  override def write(event: Event) = {
    streamObserver.onNext(event)
  }

  override def close(): Unit = {
    streamObserver.onCompleted()
  }

}
