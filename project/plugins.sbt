resolvers += Resolver.url("jetbrains-sbt", url(s"https://dl.bintray.com/jetbrains/sbt-plugins"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "1.0.0")
addSbtPlugin("org.jetbrains" % "sbt-idea-plugin" % "1.0.1")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.27")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7")

// FIXME coursier as a plugin currently breaks tests
//addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC3")
