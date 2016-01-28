name := "api"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

enablePlugins(JavaAppPackaging)
maintainer in Docker := "yamaza520"
dockerBaseImage in Docker := "dockerfile/java:oracle-java8"
dockerExposedPorts in Docker := Seq(9000, 9443)
