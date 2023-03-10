package controllers

import javax.inject._
import play.api.mvc._
import utils.Constants.fullResults

@Singleton
class ResultsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.results(fullResults))
  }
}
  