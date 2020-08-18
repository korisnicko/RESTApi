// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Marko/Desktop/adverts/adverts/conf/routes
// @DATE:Tue Aug 18 14:48:12 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:10
  AdvertController_0: controllers.AdvertController,
  // @LINE:17
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:10
    AdvertController_0: controllers.AdvertController,
    // @LINE:17
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, AdvertController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AdvertController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """car/adverts""", """controllers.AdvertController.getAllAdverts(sortby:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """car/adverts/""" + "$" + """id<[^/]+>""", """controllers.AdvertController.getSingleAdvert(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """car/adverts""", """controllers.AdvertController.createAdvert"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """car/adverts/""" + "$" + """id<[^/]+>""", """controllers.AdvertController.modifyAdvert(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """car/adverts/""" + "$" + """id<[^/]+>""", """controllers.AdvertController.deleteAdvert(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AdvertController_getAllAdverts1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("car/adverts")))
  )
  private[this] lazy val controllers_AdvertController_getAllAdverts1_invoker = createInvoker(
    AdvertController_0.getAllAdverts(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdvertController",
      "getAllAdverts",
      Seq(classOf[String]),
      "GET",
      this.prefix + """car/adverts""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AdvertController_getSingleAdvert2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("car/adverts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdvertController_getSingleAdvert2_invoker = createInvoker(
    AdvertController_0.getSingleAdvert(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdvertController",
      "getSingleAdvert",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """car/adverts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AdvertController_createAdvert3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("car/adverts")))
  )
  private[this] lazy val controllers_AdvertController_createAdvert3_invoker = createInvoker(
    AdvertController_0.createAdvert,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdvertController",
      "createAdvert",
      Nil,
      "POST",
      this.prefix + """car/adverts""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AdvertController_modifyAdvert4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("car/adverts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdvertController_modifyAdvert4_invoker = createInvoker(
    AdvertController_0.modifyAdvert(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdvertController",
      "modifyAdvert",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """car/adverts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AdvertController_deleteAdvert5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("car/adverts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdvertController_deleteAdvert5_invoker = createInvoker(
    AdvertController_0.deleteAdvert(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdvertController",
      "deleteAdvert",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """car/adverts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:10
    case controllers_AdvertController_getAllAdverts1_route(params@_) =>
      call(params.fromQuery[String]("sortby", Some(""))) { (sortby) =>
        controllers_AdvertController_getAllAdverts1_invoker.call(AdvertController_0.getAllAdverts(sortby))
      }
  
    // @LINE:11
    case controllers_AdvertController_getSingleAdvert2_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AdvertController_getSingleAdvert2_invoker.call(AdvertController_0.getSingleAdvert(id))
      }
  
    // @LINE:12
    case controllers_AdvertController_createAdvert3_route(params@_) =>
      call { 
        controllers_AdvertController_createAdvert3_invoker.call(AdvertController_0.createAdvert)
      }
  
    // @LINE:13
    case controllers_AdvertController_modifyAdvert4_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AdvertController_modifyAdvert4_invoker.call(AdvertController_0.modifyAdvert(id))
      }
  
    // @LINE:14
    case controllers_AdvertController_deleteAdvert5_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AdvertController_deleteAdvert5_invoker.call(AdvertController_0.deleteAdvert(id))
      }
  
    // @LINE:17
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
