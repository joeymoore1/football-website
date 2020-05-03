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
  val gaz: Player = Player(14, Name("Gareth","Baker"), "Defender")
  val mark: Player = Player(15, Name("Mark","Betteridge"), "Defender")
  val josh: Player = Player(16, Name("Josh","Dodd"), "Midfielder")
  val ewan: Player = Player(17, Name("Ewan","Griffiths"), "Midfielder")
  val aaron: Player = Player(18, Name("Arran","Moore"), "Midfielder")
  val ashley: Player = Player(19, Name("Ashley","Moore"), "Midfielder")
  val layton: Player = Player(20, Name("Layton","Reynolds"), "Defender")
  val dean: Player = Player(21, Name("Dean","Ridley"), "Defender")

  val fullTeam: Team = Team(List(chad, matt, ben, dave, kieran, gaz, mark, layton, dean, ryan, ian,
    adam, curt, callum, josh, ewan, aaron, ashley, joey,rhys, zoltan).sortBy(_.name.lastName))

  val keepers: List[Player] = fullTeam.players.filter(_.position.equals("Keeper"))
  val defenders: List[Player] = fullTeam.players.filter(_.position.equals("Defender"))
  val midfielders: List[Player] = fullTeam.players.filter(_.position.equals("Midfielder"))
  val strikers: List[Player] = fullTeam.players.filter(_.position.equals("Striker"))

  val matchAgainstJuniors: Team = Team(List(chad, matt, ben, ryan, adam, ian, joey, rhys))
  val matchAgainstLiverpool: Team = Team(List(chad, kieran, ben, ryan, curt, callum, joey, zoltan))

  val result1: Result = Result(1, matchAgainstJuniors, "Telford Juniors", 4, 1, List(joey, rhys, joey, curt))
  val result2: Result = Result(2, matchAgainstLiverpool, "Liverpool FC", 1, 9, List(rhys))

  val fullResults: List[Result] = List(result1, result2)

  val game1:Fixture = Fixture("Manchester City", "9th February 2020", "Home")
  val game2:Fixture = Fixture("Telford Juniors", "16th February 2020", "Away")
  val game3:Fixture = Fixture("Liverpool FC", "23th February 2020", "Home")

  val fullFixtures: List[Fixture] = List(game1, game2, game3)

  def getGoalsForPlayer(player: Player): Int = {
    var goals = 0
    for (result <- fullResults){
      goals += result.scorers.count(_ == player)
    }
    goals
  }
}
