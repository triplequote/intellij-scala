credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
resolvers += Resolver.url("Hydra Artifactory", url("https://repo.triplequote.com/artifactory/sbt-plugins-staging/"))(Resolver.ivyStylePatterns)
//addSbtPlugin("com.triplequote" % "sbt-hydra" % sys.props("sbt-hydra.version"))
addSbtPlugin("com.triplequote" % "sbt-hydra-legacy" % "2.3.0-a05")
