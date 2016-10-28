package io.bigfast.eventsim.sink

/**
  * OutputSink trait for
  */
trait OutputSink[T] {
  def open(): Unit

  def write(entry: T): Unit

  def close(): Unit
}
