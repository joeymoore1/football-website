package controllers

import javax.inject._
import play.api.mvc._
import Models.{Player,Team}

@Singleton
class TeamController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def team() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.team)
  }

  val Joey: Player = Player("Joey", "Striker")

  val newTeam: Team = Team(List(Joey))

}
