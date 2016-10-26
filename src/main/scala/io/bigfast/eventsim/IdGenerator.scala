package io.bigfast.eventsim

object IdGenerator {
  def nextSessionId = java.util.UUID.randomUUID.toString

  def nextUserId = java.util.UUID.randomUUID.toString
}