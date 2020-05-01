package controllers

import javax.inject._
import play.api.mvc._
import service.ResultsService

@Singleton
class ResultsController @Inject()(val controllerComponents: ControllerComponents, resultsService: ResultsService) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.results(resultsService.results))
  }
}
  