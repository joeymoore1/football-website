package utils

import models._

object Constants {

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

  def fullTeam: Team = Team(keepers, defenders, midfielders, strikers)

  def matchAgainstJuniors: Team = Team(List(chad), List(matt, ben), List(ryan, adam, ian), List(joey, rhys))

  val result1: Result = Result(1, matchAgainstJuniors, "Telford Juniors", 4, 1)

  val fullResults: List[Result] = List(result1)

  val game1:Fixture = Fixture("Manchester City", "9th February 2020", "Home")
  val game2:Fixture = Fixture("Telford Juniors", "16th February 2020", "Away")
  val game3:Fixture = Fixture("Liverpool FC", "23th February 2020", "Home")

  val fullFixtures: List[Fixture] = List(game1, game2, game3)
}
