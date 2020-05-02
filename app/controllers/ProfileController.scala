package controllers

import javax.inject._
import play.api.mvc._
import service.ProfileService

@Singleton
class ProfileController @Inject()(val controllerComponents: ControllerComponents, profileService: ProfileService) extends BaseController {

  def index(playerIndex: Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>

    val player = profileService.getPlayerById(playerIndex)

    val appearances = profileService.getAppearances(player)

    Ok(views.html.profile(player, appearances))
  }

}
  