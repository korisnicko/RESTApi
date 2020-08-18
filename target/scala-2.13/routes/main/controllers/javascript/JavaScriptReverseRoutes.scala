// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Marko/Desktop/adverts/adverts/conf/routes
// @DATE:Tue Aug 18 14:48:12 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:10
  class ReverseAdvertController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def getSingleAdvert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdvertController.getSingleAdvert",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "car/adverts/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:14
    def deleteAdvert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdvertController.deleteAdvert",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "car/adverts/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def createAdvert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdvertController.createAdvert",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "car/adverts"})
        }
      """
    )
  
    // @LINE:13
    def modifyAdvert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdvertController.modifyAdvert",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "car/adverts/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:10
    def getAllAdverts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdvertController.getAllAdverts",
      """
        function(sortby0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "car/adverts" + _qS([(sortby0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortby", sortby0))])})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
