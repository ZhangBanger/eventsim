name := "eventsim"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.5"

libraryDependencies += "de.jollyday" % "jollyday" % "0.5.1"

libraryDependencies += "org.rogach" %% "scallop" % "0.9.5"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.6.1"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.1"

libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % "0.5.42"

libraryDependencies += "io.grpc" %% "grpc-netty" % "1.0.1"


PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)
