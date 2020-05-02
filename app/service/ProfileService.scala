package service

import javax.inject.Inject
import models.Player
import utils.Constants._
import slick.jdbc.MySQLProfile.api._
import slick.jdbc.MySQLProfile
import slick.jdbc.JdbcProfile

class ProfileService @Inject()() {

  def getPlayerById(id: Int): Player = {
    val filteredKeepers: Seq[Player] = fullTeam.keepers.filter(_.index == id)
    val filteredDefenders: Seq[Player] = fullTeam.defenders.filter(_.index == id)
    val filteredMidfielders: Seq[Player] = fullTeam.midfielders.filter(_.index == id)
    val filteredStrikers: Seq[Player] = fullTeam.strikers.filter(_.index == id)

    if (filteredKeepers.nonEmpty) filteredKeepers.head
    else if (filteredDefenders.nonEmpty) filteredDefenders.head
    else if (filteredMidfielders.nonEmpty) filteredMidfielders.head
    else filteredStrikers.head
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
