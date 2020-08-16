package utils

import models._

object Constants {

  //  ******** PLAYERS ********

  val joey: Player = Player(1, Name("Joey","Moore"), "Striker")
  val chad: Player = Player(2, Name("Chad","Bailey"), "Keeper")
  val matt: Player = Player(3, Name("Matt","Maiden"), "Defender")
  val ben: Player = Player(4, Name("Ben","Keable"), "Defender")
  val rhys: Player = Player(5, Name("Rhys","Clarkson"), "Striker")
  val adam: Player = Player(6, Name("Adam","Fox"), "Midfielder")
  val dave: Player = Player(7, Name("David","Boden"), "Defender")
  val lee: Player = Player(8, Name("Lee","Western"), "Defender")
  val mark: Player = Player(10, Name("Mark","Betteridge"), "Defender")
  val josh: Player = Player(11, Name("Josh","Dodd"), "Midfielder")
  val aaron: Player = Player(12, Name("Arran","Moore"), "Midfielder")
  val ashley: Player = Player(13, Name("Ashley","Moore"), "Midfielder")
  val layton: Player = Player(14, Name("Layton","Reynolds"), "Defender")
  val dean: Player = Player(15, Name("Dean","Ridley"), "Defender")
  val callum: Player = Player(16, Name("Callum","Wilson"), "Striker")
  val kyle: Player = Player(17, Name("Kyle","Jordan"), "Midfielder")
  val jack: Player = Player(18, Name("Jack","Tarpey"), "Midfielder")
  val daveJnr: Player = Player(19, Name("David","Easthope"), "Striker")
  val ryan: Player = Player(20, Name("Ryan","Thompson"), "Defender")

  val fullTeam: Team = Team(List(chad, matt, ben, dave, mark, layton, dean,
    adam, callum, josh, aaron, ashley, joey,rhys, kyle, jack, daveJnr, ryan, lee).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  val matchAgainstWellingtonKB: Team = Team(List(chad, dean, matt, rhys, dave, callum, jack, adam, josh, mark, ben, layton, daveJnr, ryan).sortBy(_.name.lastName))
  val result1: Result = Result(1, matchAgainstWellingtonKB, "Wellington KB", 4, 3, List(daveJnr, daveJnr, callum, daveJnr))

  val matchAgainstCrownFC: Team = Team(List(chad, dave, layton, matt, ben, mark, jack, kyle, adam, rhys, callum, ryan, josh, dean).sortBy(_.name.lastName))
  val result2: Result = Result(2, matchAgainstCrownFC, "Crown FC", 2, 1, List(callum, jack))

  val matchAgainstCgsFC: Team = Team(List(kyle, jack, callum, rhys, matt, dean, daveJnr, dave, mark, ben, layton).sortBy(_.name.lastName))
  val result3: Result = Result(3, matchAgainstCgsFC, "CGS FC", 5, 3, List(rhys, callum, matt, callum, daveJnr))

  val matchAgainstAFCDub: Team = Team(List(joey, callum, jack, rhys, dean, matt, chad, ryan, layton, adam, dave, daveJnr, kyle).sortBy(_.name.lastName))
  val result4: Result = Result(4, matchAgainstAFCDub, "AFC Dub", 2, 3, List(joey, callum))

  val fullResults: List[Result] = List(result1, result2, result3, result4)


//  ******** FIXTURES ********

  val game2: Fixture = Fixture("Britannia FC", "27th August 2020", "Away")

  val fullFixtures: List[Fixture] = List(game2)

}
