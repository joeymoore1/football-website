package controllers

import javax.inject._
import models.{playerStats, Player}
import play.api.mvc._
import service._
import utils.Constants._

@Singleton
class StatsController @Inject()(val controllerComponents: ControllerComponents,
                                profileService: ProfileService) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>

    val goalScorerList = playerStatsList(fullTeam.players).filter(_.goals > 0).sortBy(x => (-x.goals, x.player.name.lastName.reverse))

    val assistsList = playerStatsList(fullTeam.players).filter(_.assists > 0).sortBy(x => (-x.assists, x.player.name.lastName))

    val motmList = playerStatsList(fullTeam.players).filter(_.motms > 0).sortBy(x => (-x.motms, x.player.name.lastName))

    Ok(views.html.stats(goalScorerList, assistsList, motmList))
  }

  def playerStatsList(players:List[Player]):List[playerStats] = {
    players.map(l => playerStats(l, profileService.getGoalsForPlayer(l), profileService.getAssistsForPlayer(l),
      profileService.getAppearances(l), profileService.getMotmsForPlayer(l)))
  }
}
  