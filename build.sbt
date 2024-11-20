// Variables
val org: String = "com.outr"
val projectName: String = "halodb-revive"
val githubOrg: String = "outr"
val email: String = "matt@matthicks.com"
val developerId: String = "darkfrog"
val developerName: String = "Matt Hicks"
val developerURL: String = "https://matthicks.com"

name := projectName

// Pure Java
crossPaths := false
autoScalaLibrary := false

ThisBuild / organization := org
ThisBuild / version := "0.5.7"
ThisBuild / scalacOptions ++= Seq("-unchecked", "-deprecation")

ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
ThisBuild / publishTo := sonatypePublishToBundle.value
ThisBuild / sonatypeProfileName := org
ThisBuild / licenses := Seq("MIT" -> url(s"https://github.com/$githubOrg/$projectName/blob/master/LICENSE"))
ThisBuild / sonatypeProjectHosting := Some(xerial.sbt.Sonatype.GitHubHosting(githubOrg, projectName, email))
ThisBuild / homepage := Some(url(s"https://github.com/$githubOrg/$projectName"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url(s"https://github.com/$githubOrg/$projectName"),
    s"scm:git@github.com:$githubOrg/$projectName.git"
  )
)
ThisBuild / developers := List(
  Developer(id=developerId, name=developerName, email=email, url=url(developerURL))
)

ThisBuild / resolvers += Resolver.mavenLocal

ThisBuild / outputStrategy := Some(StdoutOutput)

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