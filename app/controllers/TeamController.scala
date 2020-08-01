package controllers

import javax.inject._
import models.Player
import play.api.mvc._
import utils.Constants._

@Singleton
class TeamController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  val keepers: List[Player] = fullTeam.players.filter(_.position.equals("Keeper"))
  val defenders: List[Player] = fullTeam.players.filter(_.position.equals("Defender"))
  val midfielders: List[Player] = fullTeam.players.filter(_.position.equals("Midfielder"))
  val strikers: List[Player] = fullTeam.players.filter(_.position.equals("Striker"))

  def team(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.team(keepers, defenders, midfielders, strikers))
  }
}
  