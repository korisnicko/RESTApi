// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Marko/Desktop/adverts/adverts/conf/routes
// @DATE:Tue Aug 18 14:48:12 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
