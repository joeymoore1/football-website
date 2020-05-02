package controllers

import javax.inject._
import play.api.mvc._
import utils.Constants._

@Singleton
class FixturesController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.fixtures(fullFixtures))
  }
}
  