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
  val ellis: Player = Player(13, Name("Ellis","Smith"), "Midfielder")
  val jack: Player = Player(14, Name("Jack","Tarpey"), "Midfielder")
  val adNixon: Player = Player(15, Name("Adam","Nixon"), "Defender")
  val daveJones: Player = Player(16, Name("Dave","Jones"), "Midfielder")
  val dan: Player = Player(17, Name("Daniel","Smart"), "Midfielder")
  val danSmout: Player = Player(18, Name("Dan","Smout"), "Defender")

  val fullTeam: Team = Team(List(chad, matt, ben, dave, mark, layton, dean,
    adam, callum, aaron, joey,rhys, jack, adNixon, daveJones, dan, danSmout, ellis).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  val matchAgainstShifnalImperials: Team = Team(List(chad, dave, ben, matt, adam, jack, daveJones, aaron, joey, callum).sortBy(_.name.lastName))
//  Other players were aarons mate kieran
  val shifnalImperialsResult: Result = Result(1, matchAgainstShifnalImperials, "Shifnal Imperials", 2, 3, List(joey), List(daveJones, chad), LocalDate.parse("2020-09-20"))

  val matchAgainstKingsArms: Team = Team(List(chad, adam, ben, layton, matt, jack, joey, rhys, callum, mark).sortBy(_.name.lastName))
  val kingsArmsResult: Result = Result(2, matchAgainstKingsArms, "Kings Arms Market Drayton", 3, 6, List(joey, callum, adam), List(rhys, jack), LocalDate.parse("2020-09-27"))

  val matchAgainstCaptainWebb: Team = Team(List(chad, adam, ben, layton, mark, rhys, joey, callum, dave, dan).sortBy(_.name.lastName))
  val captainWebbResult: Result = Result(3, matchAgainstCaptainWebb, "Captain Webb FC", 2, 3, List(callum, callum), List(), LocalDate.parse("2020-10-04"))

  val matchAgainstWellingtonKB: Team = Team(List(chad, layton, ben, mark, matt, jack, dan, joey, rhys, adam).sortBy(_.name.lastName))
  val wellingtonKBResult: Result = Result(4, matchAgainstWellingtonKB, "Wellington KB", 0, 7, List(), List(), LocalDate.parse("2020-10-18"))

  val matchAgainstTravellersJoy: Team = Team(List(chad, mark, ben, layton, dave, matt, rhys, callum, joey, jack).sortBy(_.name.lastName))
  val travellersJoyResult: Result = Result(5, matchAgainstTravellersJoy, "Travellers Joy", 7, 2, List(joey, joey, joey, callum, dave), List(joey, dave, callum, rhys, callum), LocalDate.parse("2020-10-25"))

  val matchAgainstTheLion: Team = Team(List(chad, mark, ben, layton, dave, dan, rhys, callum, joey, adam).sortBy(_.name.lastName))
  val theLionResult: Result = Result(6, matchAgainstTheLion, "The Lion FC", 3, 2, List(joey, callum, callum), List(dan), LocalDate.parse("2020-11-01"))

  val secondMatchAgainstShifnalImps: Team = Team(List(chad, mark, ben, layton, dave, rhys, callum, matt, dan, joey, adam, jack).sortBy(_.name.lastName))
  val secondShifnalResult: Result = Result(7, secondMatchAgainstShifnalImps, "Shifnal Imperials", 1, 6, List(rhys), List(joey), LocalDate.parse("2020-12-20"))

  val secondMatchAgainstTravellersJoy: Team = Team(List(chad, mark, ben, layton, matt, rhys, callum, joey, jack, dan, adNixon, adam).sortBy(_.name.lastName))
  val secondTravellersJoyResult: Result = Result(8, secondMatchAgainstTravellersJoy, "Travellers Joy", 4, 3, List(joey, joey, rhys), List(joey, joey, dan, rhys), LocalDate.parse("2021-04-11"))

  val secondMatchAgainstKingsArms: Team = Team(List(chad, danSmout, adam, layton, adNixon, jack, matt, dan, joey, rhys).sortBy(_.name.lastName))
  val secondKingsArmsResult: Result = Result(9, secondMatchAgainstKingsArms, "Kings Arms Market Drayton", 4, 1, List(joey, rhys, dan, jack), List(joey, rhys, dan, jack), LocalDate.parse("2021-04-18"))

//  Other player was stu
  val secondMatchAgainstWellyKb: Team = Team(List(chad, ben, layton, adNixon, adam, mark, matt, ellis, joey, rhys, danSmout).sortBy(_.name.lastName))
  val secondWellingtonKBResult: Result = Result(10, matchAgainstWellingtonKB, "Wellington KB", 2, 5, List(joey, adNixon), List(ellis, ellis), LocalDate.parse("2021-04-25"))

  //  Other player was jez
  val secondMatchAgainstCapWebb: Team = Team(List(chad, mark, ben, layton, adam, matt, aaron, jack, rhys, ellis, joey, callum).sortBy(_.name.lastName))
  val secondCapWebbResult: Result = Result(11, secondMatchAgainstCapWebb, "Captain Webb FC", 1, 6, List(joey), List(jack), LocalDate.parse("2021-05-02"))

  //  Other players were jez/ian/scott
  val bellAndBails: Team = Team(List(chad, mark, adam, adNixon, dean, matt, rhys, callum, joey, danSmout).sortBy(_.name.lastName))
  val bellAndBailsResult: Result = Result(12, bellAndBails, "Bell and Bails", 1, 3, List(rhys), List(callum), LocalDate.parse("2021-05-09"))

  //  Other players were curtis/rich/scott
  val bellAndBails2: Team = Team(List(mark, layton, danSmout, dan, matt, ben, joey, jack, ellis).sortBy(_.name.lastName))
  val bellAndBailsResult2: Result = Result(13, bellAndBails2, "Bell and Bails", 4, 3, List(joey,joey), List(ben, joey, dan), LocalDate.parse("2021-05-16"))

  //  Other players were curt/ryan/alex/kaleem/nath/grimbo/stu
  val matchAgainstTheLion2: Team = Team(List(mark, layton, danSmout, matt, joey, ben, adam).sortBy(_.name.lastName))
  val theLionResult2: Result = Result(14, matchAgainstTheLion2, "The Lion FC", 1, 3, List(joey), List(), LocalDate.parse("2021-05-23"))

  val fullResults: List[Result] = List(shifnalImperialsResult, kingsArmsResult, captainWebbResult, wellingtonKBResult, travellersJoyResult,
    theLionResult, secondShifnalResult, secondTravellersJoyResult, secondKingsArmsResult, secondWellingtonKBResult, secondCapWebbResult, bellAndBailsResult,
    bellAndBailsResult2, theLionResult2).reverse


//  ******** FIXTURES *********

  val fullFixtures: List[Fixture] = List()

}
