package controllers

import models.Player
import javax.inject._
import play.api.mvc._

@Singleton
class ProfileController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.profile(joey))
  }

  val joey: Player = Player(1, "Joey Moore", "Striker")
}
  