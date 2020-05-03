package service

import javax.inject.Inject
import models.{Player, Result}
import utils.Constants._
import slick.jdbc.MySQLProfile.api._
import slick.jdbc.MySQLProfile
import slick.jdbc.JdbcProfile

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

  class MySQLService(jdbcUrl: String, dbUser: String, dbPassword: String) {

    // Setup our database driver, Postgres in this case
    //  val driver: JdbcProfile = PostgresDriver
    val driver: JdbcProfile = MySQLProfile

    // Create a database connection
    val db: Database = Database.forURL(jdbcUrl, dbUser, dbPassword)
    db.createSession()
  }


}
