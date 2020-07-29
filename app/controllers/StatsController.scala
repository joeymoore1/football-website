package controllers

import javax.inject._
import models.GoalsPerScorer
import play.api.mvc._
import service.ResultsService
import utils.Constants._

@Singleton
class StatsController @Inject()(val controllerComponents: ControllerComponents, resultsService: ResultsService) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>

    val goalScorerList = goalscorerList(fullTeam.players).filter(_.goals > 0).sortBy(x => (-x.goals, x.player.name.lastName))

    val topGoalscorer: GoalsPerScorer = goalScorerList.head

    val otherGoalscorers: List[GoalsPerScorer] = goalScorerList.tail

    Ok(views.html.stats(topGoalscorer, otherGoalscorers))
  }
}
  