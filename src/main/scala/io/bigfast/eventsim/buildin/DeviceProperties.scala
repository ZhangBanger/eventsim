package io.bigfast.eventsim.buildin

object DeviceProperties {

  def randomProps =
    Map[String,Any](
      "location" -> RandomLocationGenerator.randomThing,
      "userAgent" -> RandomUserAgentGenerator.randomThing._1
    )

}
