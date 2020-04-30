package controllers

import javax.inject._
import play.api.mvc._
import service.ProfileService

@Singleton
class TeamController @Inject()(val controllerComponents: ControllerComponents, profileService: ProfileService) extends BaseController {

  def team(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.team(profileService.newTeam))
  }
}
  