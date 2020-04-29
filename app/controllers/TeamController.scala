package controllers

import Models.{Player, Team}
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
  val rhys: Player = Player("Rhys Clarkson", "Striker")

  val newTeam: Team = Team(Seq(joey, matt, chad, rhys))

}
