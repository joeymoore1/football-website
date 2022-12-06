package controllers

import javax.inject._
import play.api.mvc._
import service.ProfileService

@Singleton
class ProfileController @Inject()(val controllerComponents: ControllerComponents, profileService: ProfileService) extends BaseController {

  def index(playerIndex: Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>

    val player = profileService.getPlayerById(playerIndex)

    val appearances = profileService.getAppearances(player)

    val goals = profileService.getGoalsForPlayer(player)

    val assists = profileService.getAssistsForPlayer(player)

    val motms = profileService.getMotmsForPlayer(player)

    val yellows = profileService.getYellowsForPlayer(player)

    val reds = profileService.getRedsForPlayer(player)

    Ok(views.html.profile(player, appearances, goals, assists, motms, yellows, reds))
  }

}
  