package controllers

import models.Fixture
import javax.inject._
import play.api.mvc._

@Singleton
class FixturesController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.fixtures(fixtures))
  }

  val game1:Fixture = Fixture("Manchester City", "9th February 2020", "Home")
  val game2:Fixture = Fixture("Telford Juniors", "16th February 2020", "Away")
  val game3:Fixture = Fixture("Liverpool FC", "23th February 2020", "Home")

  val fixtures: List[Fixture] = List(game1, game2, game3)
}
  