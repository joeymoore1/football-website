package service

import javax.inject.Inject
import models.{Player, Team, Name}

class ProfileService @Inject()() {

  val joey: Player = Player(1, Name("Joey","Moore"), "Striker")
  val chad: Player = Player(2, Name("Chad","Bailey"), "Keeper")
  val matt: Player = Player(3, Name("Matt","Maiden"), "Defender")
  val ben: Player = Player(4, Name("Ben","Keable"), "Defender")
  val ian: Player = Player(5, Name("Ian","Harkins"), "Midfielder")
  val rhys: Player = Player(6, Name("Rhys","Clarkson"), "Striker")
  val adam: Player = Player(7, Name("Adam","Fox"), "Midfielder")
  val dave: Player = Player(8, Name("David","Boden"), "Defender")
  val curt: Player = Player(9, Name("Curtis","Cooper"), "Midfielder")
  val zoltan: Player = Player(10, Name("Zoltan","KanizsaI-Nagy"), "Striker")
  val callum: Player = Player(11, Name("Callum","Stainer"), "Midfielder")
  val kieran: Player = Player(12, Name("Kieran","Whyman"), "Defender")
  val ryan: Player = Player(13, Name("Ryan","Jones"), "Midfielder")

  val keepers: List[Player] = List(chad).sortBy(_.name.lastName)
  val defenders: List[Player] = List(matt, ben, dave, kieran).sortBy(_.name.lastName)
  val midfielders: List[Player] = List(ryan, ian, adam, curt, callum).sortBy(_.name.lastName)
  val strikers: List[Player] = List(joey,rhys, zoltan).sortBy(_.name.lastName)

  def newTeam: Team = Team(keepers, defenders, midfielders, strikers)

  def getPlayerById(id: Int): Player = {
    val filteredKeepers: Seq[Player] = newTeam.keepers.filter(_.index == id)
    val filteredDefenders: Seq[Player] = newTeam.defenders.filter(_.index == id)
    val filteredMidfielders: Seq[Player] = newTeam.midfielders.filter(_.index == id)
    val filteredStrikers: Seq[Player] = newTeam.strikers.filter(_.index == id)

    if (filteredKeepers.nonEmpty) filteredKeepers.head
    else if (filteredDefenders.nonEmpty) filteredDefenders.head
    else if (filteredMidfielders.nonEmpty) filteredMidfielders.head
    else filteredStrikers.head
  }


  import slick.jdbc.MySQLProfile.api._
  import slick.jdbc.MySQLProfile
  import slick.jdbc.JdbcProfile

  class MySQLService(jdbcUrl: String, dbUser: String, dbPassword: String) {

    // Setup our database driver, Postgres in this case
    //  val driver: JdbcProfile = PostgresDriver
    val driver: JdbcProfile = MySQLProfile

    // Create a database connection
    val db: Database = Database.forURL(jdbcUrl, dbUser, dbPassword)
    db.createSession()
  }


}