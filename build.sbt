name := "play-bootstrap-angular-reactivemongo-slick-seed"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  jdbc, cache,
  reactiveMongo, playReactiveMongo,
  slick, playSlick,
  webjars,
  bootstrap, angularjs
) ++ bouncyCastle

play.Project.playScalaSettings

EclipseKeys.withSource := true

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases"
