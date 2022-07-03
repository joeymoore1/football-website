package controllers

import javax.inject._
import models.Player
import play.api.mvc._
import utils.Constants._

@Singleton
class TeamController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  val coaches: List[Player] = fullTeam.players.filter(_.position.equals("Coach"))
  val keepers: List[Player] = fullTeam.players.filter(_.position.equals("Keeper"))
  val defenders: List[Player] = fullTeam.players.filter(_.position.equals("Defender"))
  val midfielders: List[Player] = fullTeam.players.filter(_.position.equals("Midfielder"))
  val strikers: List[Player] = fullTeam.players.filter(_.position.equals("Striker"))
  val wingers: List[Player] = fullTeam.players.filter(_.position.equals("Winger"))

  def team(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.team(coaches, keepers, defenders, midfielders, strikers, wingers))
  }
}
  