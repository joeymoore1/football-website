package utils

import java.time.LocalDate

import models._

object Constants {

  //  ******** PLAYERS ********

  val joey: Player = Player(1, Name("Joey","Moore"), "Striker")
  val ste: Player = Player(2, Name("Ste","Crowson"), "Defender")
  val lee: Player = Player(3, Name("Lee","Haines"), "Striker")
  val malin: Player = Player(4, Name("Matty","Malin"), "Keeper")
  val rhys: Player = Player(5, Name("Rhys","Clarkson"), "Striker")
  val josh: Player = Player(6, Name("Josh","Cooper"), "Midfielder")
  val jake: Player = Player(7, Name("Jake","Cooksey"), "Midfielder")
  val layt: Player = Player(8, Name("Layton","Reynolds"), "Defender")
  val ian: Player = Player(9, Name("Ian","Harkins"), "Winger")
  val joeyNixon: Player = Player(10, Name("Joey","Nixon"), "Midfielder")
  val ryan: Player = Player(11, Name("Ryan","Jones"), "Midfielder")
  val tom: Player = Player(12, Name("Tom","Fallon"), "Striker")
  val hester: Player = Player(13, Name("Luke","Hester"), "Defender")
  val ollie: Player = Player(14, Name("Ollie","Eaves"), "Striker")
  val danSmout: Player = Player(15, Name("Dan","Smout"), "Coach")
  val mattMaiden: Player = Player(16, Name("Matt","Maiden"), "Coach")
  val chad: Player = Player(17, Name("Chad","Bailey"), "Keeper")
  val adam: Player = Player(18, Name("Adam","Nixon"), "Midfielder")
  val goucher: Player = Player(19, Name("Sam","Goucher"), "Defender")
  val harvey: Player = Player(20, Name("Harvey","Edwards"), "Winger")
  val jobbo: Player = Player(21, Name("Tom","Jobburns"), "Midfielder")
  val adFox: Player = Player(22, Name("Adam","Fox"), "Midfielder")
  val jamal: Player = Player(23, Name("Jamal","Jervis"), "Midfielder")
  val connor: Player = Player(24, Name("Connor","Smith"), "Defender")
  val jayden: Player = Player(25, Name("Jayden","??"), "Defender")
  val omd: Player = Player(26, Name("Dan","Griffiths"), "Defender")
  val luke: Player = Player(27, Name("Luke","Nixon"), "Defender")
  val lewis: Player = Player(28, Name("Lewis","Winfindale"), "Defender")
  val conlon: Player = Player(29, Name("Conlon","Vinters"), "Midfielder")
  val kaleem: Player = Player(30, Name("Kaleem","Ramzan"), "Striker")
  val sam: Player = Player(31, Name("Sam","??"), "Striker")

  val fullTeam: Team = Team(List(joey, ste, lee, malin, rhys, josh, jake, layt, ian, joeyNixon, ryan,
    tom, hester, ollie, mattMaiden, danSmout, chad, adam, goucher, harvey, jobbo, adFox, jamal, connor, jayden,
    omd, luke, lewis, conlon, kaleem, sam).sortBy(_.name.lastName))

  //  ******** TEAMS ********

  val queens = "FC Queens"
  val bullsHead = "Bulls Head"
  val ercall = "Ercall Rangers"
  val shifnal = "Shifnal Imperials"

  //  ******** PreSeason ********

  val queensTeam:Team = Team(List(malin, jake, ste, layt, ian, joeyNixon, ryan, josh, joey, lee, tom, rhys, hester, ollie))
  val queensResult: Result = Result(1, homeTeam = queensTeam, awayTeam = queens, goalsFor = 3, goalsAgainst = 4, scorers = List(tom, tom, ryan),
    assists = List(joey, ollie, lee), motm = tom, date = LocalDate.of(2023, 7, 9))

  // Other players were Gabriel
  val bullsHeadTeam: Team = Team(List(chad, jake, ste, layt, ian, ryan, josh, joey, adam, tom, rhys, ollie, connor))
  val bullsHeadResult: Result = Result(2, homeTeam = bullsHeadTeam, awayTeam = bullsHead, goalsFor = 1, goalsAgainst = 5, scorers = List(ryan),
    assists = List(josh), motm = ollie, date = LocalDate.of(2023, 7, 16))

  val ercallTeam: Team = Team(List(chad, mattMaiden, goucher, rhys, ollie, josh, harvey, ste, jobbo, adFox, jamal, connor, jayden, omd))
  val ercallResult: Result = Result(3, homeTeam = ercallTeam, awayTeam = ercall, goalsFor = 3, goalsAgainst = 4, scorers = List(rhys, rhys, lee),
    assists = List(harvey, lee, rhys), motm = ollie, date = LocalDate.of(2023, 7, 23))

  val shifnalTeam: Team = Team(List(chad, harvey, luke, ste, layt, lewis, conlon, jobbo, joey, rhys, kaleem, sam, omd, adFox))
  val shifnalResult: Result = Result(4, homeTeam = shifnalTeam, awayTeam = shifnal, goalsFor = 2, goalsAgainst = 4, scorers = List(kaleem, rhys),
    assists = List(sam, sam), motm = rhys, date = LocalDate.of(2023, 8, 6))


  //  ******** RESULTS ********

  val fullResults: List[Result] = List(queensResult, bullsHeadResult, ercallResult, shifnalResult).reverse

//  ******** FIXTURES *********

  val fullFixtures: List[Fixture] = List()

}
