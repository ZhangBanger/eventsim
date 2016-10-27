package io.bigfast.eventsim

import java.io.OutputStream

class GRPCOutputStream(val grpcChannel: String, val topic: String) extends OutputStream {

  // Take channel and set a stream


  override def write(i: Int) = {
    // stream.onNext()
  }

  override def flush() = {}

  override def close(): Unit = {
    // Close grpc bidirectional stream
  }

}
