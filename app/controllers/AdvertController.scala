package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Advert
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._
import play.modules.reactivemongo._

import scala.concurrent.{ ExecutionContext, Future, Await }

import reactivemongo.api.{ Cursor, DefaultDB, MongoConnection, AsyncDriver }
import reactivemongo.api.bson.{
  BSONDocumentWriter, BSONDocumentReader, Macros, document
}





/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class AdvertController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  import ExecutionContext.Implicits.global

  val mongoUri = "mongodb://localhost:27017"
  val driver = AsyncDriver()
  val parsedUri = Future.fromTry(MongoConnection parseURI mongoUri)
  val futureConnection = parsedUri.flatMap(driver.connect(_))

  def db: Future[DefaultDB] = futureConnection.flatMap(_.database("myAdverts"))
  def advertsCollection = db.map(_.collection("advert"))

  implicit def advertWriter: BSONDocumentWriter[Advert] = Macros.writer[Advert]

  val adverts = List(Advert(1,"mercedes","diesel",123,false,1453,"11-12-2014"),
    Advert(15,"opel","diesel",123,false,1453,"11-12-2014"),
    Advert(13,"audi","diesel",123,false,1453,"11-12-2014"),
    Advert(11,"renault","diesel",123,false,1453,"11-12-2014"))

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok("HELLO ADVERT")
  }

  def getAllAdverts(sortby: String) = Action { implicit request: Request[AnyContent] =>
    val sorted = adverts.sortWith(_.id < _.id)
    val res: String = adverts.asJson.spaces2
    Ok(res)
  }

  def getSingleAdvert(id: Int) = Action{ implicit request: Request[AnyContent] =>
    Ok("Hello from single")
  }


  def createAdvert = Action { request =>
    request.body.asJson.map { json =>
      (json \ "name").asOpt[String].map { name =>
        Ok("Hello " + name)
      }.getOrElse {
        BadRequest("Missing parameter [name]")
      }
    }.getOrElse {
      BadRequest("Expecting Json data")
    }
  }

  def modifyAdvert(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("modify")
  }

  def deleteAdvert(id: Int) = Action { implicit request: Request[AnyContent] =>
    Ok("delete")
  }

}