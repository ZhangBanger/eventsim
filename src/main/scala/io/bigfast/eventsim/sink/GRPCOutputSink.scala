package io.bigfast.eventsim.sink

class GRPCOutputSink[T](val grpcChannel: String, val topic: String) extends OutputSink[T] {

  // Take channel and set a stream
  override def open(): Unit = {
    println(s"Opening GRPC bidirectional stream")
  }

  override def write(item: T) = {
    // stream.onNext()
  }

  override def close(): Unit = {
    // Close grpc bidirectional stream
  }

}
