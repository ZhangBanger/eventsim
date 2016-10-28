package io.bigfast.eventsim.sink

/**
  * Created by andy on 10/27/16.
  */
class HTTPOutputSink[T](hostname: String, val topic: String) extends OutputSink[T] {
  override def open(): Unit = {
    println(s"Getting session token or whatever setup calls needed")
  }

  override def write(entry: T): Unit = {
    println(s"Making some HTTP JSON POST requests")
  }

  override def close(): Unit = {
    println(s"Nothing really to do here")
  }
}
