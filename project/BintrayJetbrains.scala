import sbt._

object BintrayJetbrains {

  def jbBintrayResolver(name: String, repo: String, patterns: Patterns): URLRepository =
    Resolver.url(name, url(s"http://dl.bintray.com/jetbrains/$repo"))(patterns)

  def jbSbtResolver(name: String, patterns: Patterns): URLRepository =
    jbBintrayResolver(name, "sbt-plugins", patterns)

  object Resolvers {
    val mavenPatched  = "jb-maven-patched" at "http://dl.bintray.com/jetbrains/maven-patched/"
    val scalaTestFindersPatched  = jbBintrayResolver("scalatest-finders-patched", "scalatest", Resolver.ivyStylePatterns)
    val scalaPluginDeps  = jbBintrayResolver("scala-plugin-deps", "scala-plugin-deps", Resolver.ivyStylePatterns)
    val sonatypeReleases = Resolver.sonatypeRepo("releases")
    val metaBintray = Resolver.url("scalameta-bintray", url("https://dl.bintray.com/scalameta/maven"))(Resolver.ivyStylePatterns)
    val macrosMaven = Resolver.bintrayRepo("scalamacros", "maven")
    val jbSbtPlugins = jbSbtResolver("jetbrains-sbt", Resolver.ivyStylePatterns)
  }

  val allResolvers = Seq(Resolvers.mavenPatched, Resolvers.metaBintray, Resolvers.jbSbtPlugins,
                         Resolvers.scalaTestFindersPatched, Resolvers.scalaPluginDeps, Resolvers.sonatypeReleases,
                         Resolvers.macrosMaven)
}
