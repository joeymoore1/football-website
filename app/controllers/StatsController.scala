package controllers

import javax.inject._
import models.{GoalsPerScorer, Player}
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

  def getGoalsForPlayer(player: Player): Int = {
    var goals = 0
    for (result <- fullResults){
      goals += result.scorers.count(_ == player)
    }
    goals
  }

  def goalscorerList(players:List[Player]):List[GoalsPerScorer] = {
    players.map(l => GoalsPerScorer(l, getGoalsForPlayer(l)))
  }
}
  