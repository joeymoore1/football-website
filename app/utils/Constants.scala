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
  val ryan: Player = Player(16, Name("Ryan","Thompson"), "Defender")
  val adRowley: Player = Player(17, Name("Adam","Rowley"), "Defender")
  val daveJones: Player = Player(19, Name("Dave","Jones"), "Midfielder")
  val tom: Player = Player(20, Name("Tom","Quinn"), "Defender")
  val cav: Player = Player(21, Name("Cav","Walker"), "Midfielder")
  val jordan: Player = Player(22, Name("Jordan","Dodd"), "Midfielder")
  val dan: Player = Player(23, Name("Daniel","Smart"), "Midfielder")

  val fullTeam: Team = Team(List(chad, matt, ben, dave, mark, layton, dean,
    adam, callum, aaron, joey,rhys, kyle, jack, ryan, adRowley, daveJones, tom, cav, jordan, dan).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  val matchAgainstShifnalImperials: Team = Team(List(chad, dave, ben, matt, adam, jack, daveJones, aaron, cav, joey, callum, adRowley, tom).sortBy(_.name.lastName))
//  Other players were aarons mate kieran
  val shifnalImperialsResult: Result = Result(1, matchAgainstShifnalImperials, "Shifnal Imperials", 2, 3, List(joey), List(daveJones, chad), LocalDate.parse("2020-09-20"))

  val matchAgainstKingsArms: Team = Team(List(chad, adam, ben, layton, adRowley, matt, jack, cav, joey, rhys, callum, mark, jordan).sortBy(_.name.lastName))
  val kingsArmsResult: Result = Result(2, matchAgainstKingsArms, "Kings Arms Market Drayton", 3, 6, List(joey, callum, adam), List(rhys, jack), LocalDate.parse("2020-09-27"))

  val matchAgainstCaptainWebb: Team = Team(List(chad, adam, ben, layton, mark, rhys, kyle, cav, joey, callum, adRowley, dave, dan, jordan).sortBy(_.name.lastName))
  //  Other players were luke
  val captainWebbResult: Result = Result(3, matchAgainstCaptainWebb, "Captain Webb FC", 2, 3, List(callum, callum), List(kyle), LocalDate.parse("2020-10-04"))

  val matchAgainstWellingtonKB: Team = Team(List(chad, layton, tom, ben, mark, matt, jack, dan, joey, rhys, adam, cav, jordan).sortBy(_.name.lastName))
  val wellingtonKBResult: Result = Result(4, matchAgainstWellingtonKB, "Wellington KB", 0, 7, List(), List(), LocalDate.parse("2020-10-18"))

  val matchAgainstTravellersJoy: Team = Team(List(chad, mark, ben, layton, dave, matt, rhys, kyle, cav, callum, joey, jack, jordan).sortBy(_.name.lastName))
  //  Other players were luke
  val travellersJoyResult: Result = Result(5, matchAgainstTravellersJoy, "Travellers Joy", 7, 2, List(joey, joey, joey, callum, cav, kyle, dave), List(joey, dave, callum, rhys, kyle, kyle, callum), LocalDate.parse("2020-10-25"))

  val matchAgainstTheLion: Team = Team(List(chad, mark, ben, layton, dave, dan, rhys, kyle, cav, callum, joey, adam).sortBy(_.name.lastName))
  val theLionResult: Result = Result(6, matchAgainstTheLion, "The Lion FC", 3, 2, List(joey, callum, callum), List(kyle, kyle, dan), LocalDate.parse("2020-11-01"))

  val fullResults: List[Result] = List(shifnalImperialsResult, kingsArmsResult, captainWebbResult, wellingtonKBResult, travellersJoyResult, theLionResult).reverse


//  ******** FIXTURES *********

  val bullsHead = Fixture("Bulls Head Dawley Bank Vets", LocalDate.parse("2020-11-08"), "TBC")
  val travellersJoy = Fixture("Travellers Joy FC", LocalDate.parse("2020-11-15"), "TBC")
  val shifnalImps = Fixture("Shifnal Imperials FC", LocalDate.parse("2020-11-22"), "Idsall")
  val bellBails = Fixture("Bell and Bails", LocalDate.parse("2020-11-29"), "HLC")

  val fullFixtures: List[Fixture] = List(bullsHead, travellersJoy, shifnalImps, bellBails)

}
