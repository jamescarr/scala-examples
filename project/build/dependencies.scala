import sbt._

class ProjectDependencies(info: ProjectInfo) extends DefaultProject(info)
{
  override def mainClass = Some("org.aboutus.s3q.Retrieve")
  val specs = "org.scala-tools.testing" % "specs" % "1.5.0"
  val junit = "junit" % "junit" % "4.4"
  val httpclient = "org.mortbay.jetty" % "jetty-client" % "6.1.20"
  var codec = "commons-codec" % "commons-codec" % "1.3"
}

