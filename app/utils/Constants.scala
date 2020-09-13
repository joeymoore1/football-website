package utils

import java.time.LocalDate

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
  val mark: Player = Player(8, Name("Mark","Betteridge"), "Defender")
  val aaron: Player = Player(9, Name("Arran","Moore"), "Midfielder")
  val layton: Player = Player(10, Name("Layton","Reynolds"), "Defender")
  val dean: Player = Player(11, Name("Dean","Ridley"), "Defender")
  val callum: Player = Player(12, Name("Callum","Wilson"), "Striker")
  val kyle: Player = Player(13, Name("Kyle","Jordan"), "Midfielder")
  val jack: Player = Player(14, Name("Jack","Tarpey"), "Midfielder")
  val daveJnr: Player = Player(15, Name("David","Easthope"), "Striker")
  val ryan: Player = Player(16, Name("Ryan","Thompson"), "Defender")
  val adRowley: Player = Player(17, Name("Adam","Rowley"), "Defender")
  val chambo: Player = Player(18, Name("Adam","Chamberlain"), "Midfielder")
  val daveJones: Player = Player(19, Name("Dave","Jones"), "Midfielder")

  val fullTeam: Team = Team(List(chad, matt, ben, dave, mark, layton, dean,
    adam, callum, aaron, joey,rhys, kyle, jack, daveJnr, ryan, chambo, adRowley, daveJones).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  val matchAgainstWellingtonKB: Team = Team(List(chad, dean, matt, rhys, dave, callum, jack, adam, mark, ben, layton, daveJnr, ryan).sortBy(_.name.lastName))
  val result1: Result = Result(1, matchAgainstWellingtonKB, "Wellington KB", 4, 3, List(daveJnr, daveJnr, callum, daveJnr), LocalDate.parse("2020-07-26"))

  val matchAgainstCrownFC: Team = Team(List(chad, dave, layton, matt, ben, mark, jack, kyle, adam, rhys, callum, ryan, dean).sortBy(_.name.lastName))
  val result2: Result = Result(2, matchAgainstCrownFC, "Crown FC", 2, 1, List(callum, jack), LocalDate.parse("2020-07-29"))

  val matchAgainstNCUnited: Team = Team(List(kyle, jack, callum, rhys, matt, dean, daveJnr, dave, mark, ben, layton, adRowley).sortBy(_.name.lastName))
  val result3: Result = Result(3, matchAgainstNCUnited, "NC United", 5, 3, List(rhys, callum, matt, callum, daveJnr), LocalDate.parse("2020-08-05"))

  val matchAgainstAFCDub: Team = Team(List(joey, callum, jack, rhys, dean, matt, chad, ryan, layton, adam, dave, daveJnr, kyle, chambo).sortBy(_.name.lastName))
  val result4: Result = Result(4, matchAgainstAFCDub, "AFC Dub", 2, 3, List(joey, callum), LocalDate.parse("2020-08-16"))

  val matchAgainstBritannia: Team = Team(List(joey, dean, daveJnr, dave, rhys, layton, matt, ben, mark, jack, adam, chambo, adRowley).sortBy(_.name.lastName))
  val result5: Result = Result(5, matchAgainstBritannia, "Britannia FC", 1, 8, List(joey), LocalDate.parse("2020-08-23"))

  val matchAgainstImpact: Team = Team(List(joey, daveJnr, dave, rhys, layton, matt, ben, mark, jack, kyle, callum, adRowley, chad).sortBy(_.name.lastName))
  val result6: Result = Result(6, matchAgainstImpact, "Impact FC", 7, 2, List(joey, callum, callum, callum, rhys, kyle, daveJnr), LocalDate.parse("2020-08-30"))

  val matchAgainstTSS: Team = Team(List(chad, mark, ben, layton, dave, matt, jack, rhys, daveJnr, kyle, joey, adRowley, adam).sortBy(_.name.lastName))
  val result7: Result = Result(7, matchAgainstTSS, "TSS", 3, 7, List(joey, daveJnr, daveJnr), LocalDate.parse("2020-09-06"))

  val matchAgainstWellyKB: Team = Team(List(chad, ben, dave, adam, rhys, aaron, kyle, joey, daveJnr, callum).sortBy(_.name.lastName))
  val result8: Result = Result(8, matchAgainstWellyKB, "Wellington KB", 5, 6, List(daveJnr, daveJnr, callum, callum), LocalDate.parse("2020-09-13"))

  val fullResults: List[Result] = List(result1, result2, result3, result4, result5, result6, result7, result8).reverse


//  ******** FIXTURES *********

  val fullFixtures: List[Fixture] = List()

}
