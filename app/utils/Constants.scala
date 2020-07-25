package utils

import models._

object Constants {

  val joey: Player = Player(1, Name("Joey","Moore"), "Striker")
  val chad: Player = Player(2, Name("Chad","Bailey"), "Keeper")
  val matt: Player = Player(3, Name("Matt","Maiden"), "Defender")
  val ben: Player = Player(4, Name("Ben","Keable"), "Defender")
  val rhys: Player = Player(5, Name("Rhys","Clarkson"), "Striker")
  val adam: Player = Player(6, Name("Adam","Fox"), "Midfielder")
  val dave: Player = Player(7, Name("David","Boden"), "Defender")
  val zoltan: Player = Player(8, Name("Zoltan","KanizsaI-Nagy"), "Striker")
  val mark: Player = Player(10, Name("Mark","Betteridge"), "Defender")
  val josh: Player = Player(11, Name("Josh","Dodd"), "Midfielder")
  val aaron: Player = Player(12, Name("Arran","Moore"), "Midfielder")
  val ashley: Player = Player(13, Name("Ashley","Moore"), "Midfielder")
  val layton: Player = Player(14, Name("Layton","Reynolds"), "Defender")
  val dean: Player = Player(15, Name("Dean","Ridley"), "Defender")
  val callum: Player = Player(16, Name("Callum","Wilson"), "Striker")
  val kyle: Player = Player(17, Name("Kyle","Jordan"), "Midfielder")
  val jack: Player = Player(18, Name("Jack","Tarpey"), "Midfielder")

  val fullTeam: Team = Team(List(chad, matt, ben, dave, mark, layton, dean,
    adam, callum, josh, aaron, ashley, joey,rhys, zoltan, kyle, jack).sortBy(_.name.lastName))

  val keepers: List[Player] = fullTeam.players.filter(_.position.equals("Keeper"))
  val defenders: List[Player] = fullTeam.players.filter(_.position.equals("Defender"))
  val midfielders: List[Player] = fullTeam.players.filter(_.position.equals("Midfielder"))
  val strikers: List[Player] = fullTeam.players.filter(_.position.equals("Striker"))

  val matchAgainstExample: Team = Team(List(chad, mark, matt, dave, ben, zoltan, joey, josh, adam, callum).sortBy(_.name.lastName))

  val result1: Result = Result(1, matchAgainstExample, "Example Result", 3, 2, List(joey, ben, joey))

  val fullResults: List[Result] = List(result1)

  val game1:Fixture = Fixture("Example Fixture", "9th February 2020", "Home")

  val fullFixtures: List[Fixture] = List(game1)

  def getGoalsForPlayer(player: Player): Int = {
    var goals = 0
    for (result <- fullResults){
      goals += result.scorers.count(_ == player)
    }
    goals
  }
}
