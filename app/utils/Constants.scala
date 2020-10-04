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

  val fullTeam: Team = Team(List(chad, matt, ben, dave, mark, layton, dean,
    adam, callum, aaron, joey,rhys, kyle, jack, ryan, adRowley, daveJones, tom, cav).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  val matchAgainstShifnalImperials: Team = Team(List(chad, dave, ben, matt, adam, jack, daveJones, aaron, cav, joey, callum, adRowley, tom).sortBy(_.name.lastName))
//  Other players were aarons mate kieran
  val shifnalImperialsResult: Result = Result(1, matchAgainstShifnalImperials, "Shifnal Imperials", 2, 3, List(joey), List(daveJones, chad), LocalDate.parse("2020-09-20"))

  val matchAgainstKingsArms: Team = Team(List(chad, adam, ben, layton, adRowley, matt, jack, cav, joey, rhys, callum, mark).sortBy(_.name.lastName))
  //  Other players were jord dodd
  val kingsArmsResult: Result = Result(2, matchAgainstKingsArms, "Kings Arms Market Drayton", 3, 6, List(joey, callum, adam), List(rhys, jack), LocalDate.parse("2020-09-27"))

  val matchAgainstCaptainWebb: Team = Team(List(chad, adam, ben, layton, mark, rhys, kyle, cav, joey, callum, adRowley, dave).sortBy(_.name.lastName))
  //  Other players were jord dodd, dan smart, cavs RB mate
  val captainWebbResult: Result = Result(2, matchAgainstCaptainWebb, "Captain Webb FC", 2, 3, List(callum, callum), List(kyle), LocalDate.parse("2020-09-27"))



  val fullResults: List[Result] = List(shifnalImperialsResult, kingsArmsResult, captainWebbResult).reverse


//  ******** FIXTURES *********

  val wellingtonKB = Fixture("Wellington KB", LocalDate.parse("2020-10-18"), "Ketley Bank")
  val travellersJoy = Fixture("Travellers Joy", LocalDate.parse("2020-10-25"), "Ketley Bank")

  val fullFixtures: List[Fixture] = List(wellingtonKB, travellersJoy)

}
