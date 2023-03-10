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

  def getAssistsForPlayer(player: Player): Int = {
    var assists = 0
    for (result <- fullResults){
      assists += result.assists.count(_ == player)
    }
    assists
  }

  def getMotmsForPlayer(player: Player): Int = {
    var motms = 0
    for (result <- fullResults){
      if(result.motm.equals(player)){
        motms +=1
      }
    }
    motms
  }

  def getYellowsForPlayer(player: Player): Int = {
    var yellows = 0
    for (result <- fullResults) {
      yellows += result.yellowCards.count(_ == player)
    }
    yellows
  }

  def getRedsForPlayer(player: Player): Int = {
    var reds = 0
    for (result <- fullResults) {
      reds += result.redCards.count(_ == player)
    }
    reds
  }

  def getWinsForPlayer(player: Player): String = {
    val filterResultsByPlayer = fullResults.filter(_.homeTeam.players.contains(player))
    var wins = 0
    for (result <- filterResultsByPlayer){
      val goalsFor = result.goalsFor
      val goalsAgainst = result.goalsAgainst
      val won = goalsFor > goalsAgainst
      if(won) wins += 1
    }
    val appearances = getAppearances(player)
    val percentage: Double  = wins.toFloat / appearances
    val string = f"Win percentage: ${percentage*100}%.0f%%"

    string
  }
}
