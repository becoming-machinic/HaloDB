name := "halodb"
organization := "com.outr"
version := "0.5.7-SNAPSHOT"

scalaVersion := "2.13.15"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.12",
  "com.google.guava" % "guava" % "18.0",
  "net.java.dev.jna" % "jna" % "4.1.0",
  "net.jpountz.lz4" % "lz4" % "1.3",
  "org.hamcrest" % "hamcrest-all" % "1.3" % Test,
  "org.apache.logging.log4j" % "log4j-core" % "2.3" % Test,
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.3" % Test,
  "org.testng" % "testng" % "6.9.10" % Test,
  "org.jmockit" % "jmockit" % "1.38" % Test,
  "org.assertj" % "assertj-core" % "3.8.0" % Test
)