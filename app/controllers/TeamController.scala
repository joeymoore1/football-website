package controllers

import models.{Player, Team}
import javax.inject._
import play.api.mvc._

@Singleton
class TeamController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def team(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.team(newTeam))
  }

  val joey: Player = Player("Joey Moore", "Striker")
  val chad: Player = Player("Chad Bailey", "Keeper")
  val matt: Player = Player("Matt Maiden", "Defender")
  val ben: Player = Player("Ben Keable", "Defender")
  val ian: Player = Player("Ian Harkins", "Midfielder")
  val rhys: Player = Player("Rhys Clarkson", "Striker")
  val adam: Player = Player("Adam Fox", "Midfielder")
  val dave: Player = Player("David Boden", "Defender")
  val curt: Player = Player("Curtis Cooper", "Midfielder")
  val zoltan: Player = Player("Zoltan KanizsaI-Nagy", "Striker")
  val callum: Player = Player("Callum Stainer", "Midfielder")
  val kieran: Player = Player("Kieran Whyman", "Defender")
  val ryan: Player = Player("Ryan Jones", "Midfielder")

  val keepers: List[Player] = List(chad)
  val defenders: List[Player] = List(matt, ben, dave, kieran)
  val midfielders: List[Player] = List(ryan, ian, adam, curt, callum)
  val strikers: List[Player] = List(joey,rhys, zoltan)

  val newTeam: Team = Team(keepers, defenders, midfielders, strikers)
}
  