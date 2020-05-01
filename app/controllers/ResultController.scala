package controllers

import javax.inject._
import play.api.mvc._
import service.ResultsService
import models.Result

@Singleton
class ResultController @Inject()(val controllerComponents: ControllerComponents, resultsService: ResultsService) extends BaseController {

  def index(resultIndex: Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val result: Result = resultsService.getResultById(resultIndex)

    Ok(views.html.result(result))
  }
}
  