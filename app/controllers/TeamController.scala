package controllers

import javax.inject._
import play.api.mvc._
import utils.Constants._

@Singleton
class TeamController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def team(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.team(keepers, defenders, midfielders, strikers))
  }
}
  