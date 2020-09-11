package service

import javax.inject.Inject
import models.Player
import utils.Constants._

class ProfileService @Inject()() {

  def getPlayerById(id: Int): Player = {
    val filterPlayersById = fullTeam.players.filter(_.index == id)
    filterPlayersById.head
  }

  def getAppearances(player: Player): Int = {
    val filterResultsByPlayer = fullResults.filter(_.homeTeam.players.contains(player))
    filterResultsByPlayer.size
  }

  def getGoalsForPlayer(player: Player): Int = {
    var goals = 0
    for (result <- fullResults){
      goals += result.scorers.count(_ == player)
    }
    goals
  }
}
