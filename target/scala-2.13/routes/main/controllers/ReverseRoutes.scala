// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Marko/Desktop/adverts/adverts/conf/routes
// @DATE:Tue Aug 18 14:48:12 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:10
  class ReverseAdvertController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def getSingleAdvert(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "car/adverts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:14
    def deleteAdvert(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "car/adverts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:12
    def createAdvert(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "car/adverts")
    }
  
    // @LINE:13
    def modifyAdvert(id:Int): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "car/adverts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:10
    def getAllAdverts(sortby:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "car/adverts" + play.core.routing.queryString(List(if(sortby == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortby", sortby)))))
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
