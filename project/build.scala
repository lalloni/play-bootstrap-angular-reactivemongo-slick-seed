import sbt._
import sbt.Keys._

object build extends Build {

  val reactiveMongo = "org.reactivemongo" %% "reactivemongo" % "0.10.0"

  val playReactiveMongo = "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2"

  val slick = "com.typesafe.slick" %% "slick" % "2.0.1-RC1"

  val playSlick = "com.typesafe.play" %% "play-slick" % "0.6.0.1"

  val webjars = "org.webjars" %% "webjars-play" % "2.2.1-2"

  // ~~~~
  // WebJars
  // ~~~~

  val bootstrap = "org.webjars" % "bootstrap" % "3.1.0"

  val angularjs = "org.webjars" % "angularjs" % "1.2.14"

}
