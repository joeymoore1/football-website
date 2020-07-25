package controllers

import javax.inject._
import models.GoalsPerScorer
import play.api.mvc._
import service.ResultsService
import utils.Constants._

@Singleton
class StatsController @Inject()(val controllerComponents: ControllerComponents, resultsService: ResultsService) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>

    val topGoalscorer: List[GoalsPerScorer] = goalscorerList(fullTeam.players).filter(_.goals > 0).sortBy(_.goals).reverse

    Ok(views.html.stats(topGoalscorer))
  }
}
  