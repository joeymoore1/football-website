package utils

import java.time.LocalDate

import models._

object Constants {

  //  ******** PLAYERS ********

  val joey: Player = Player(1, Name("Joey","Moore"), "Striker")
  val chad: Player = Player(2, Name("Chad","Bailey"), "Keeper")
  val mattMaiden: Player = Player(3, Name("Matt","Maiden"), "Coach")
  val layton: Player = Player(4, Name("Layton","Reynolds"), "Defender")
  val adNixon: Player = Player(5, Name("Adam","Nixon"), "Midfielder")
  val danSmout: Player = Player(6, Name("Dan","Smout"), "Coach")
  val luke: Player = Player(7, Name("Luke","Hester"), "Defender")
  val danGrimbo: Player = Player(8, Name("Dan","Griffiths"), "Defender")
  val charlie: Player = Player(9, Name("Charlie","Bates"), "Winger")
  val cameron: Player = Player(10, Name("Cameron","Rann"), "Midfielder")
  val lukeNixon: Player = Player(11, Name("Luke","Nixon"), "Defender")
  val callum: Player = Player(12, Name("Callum","Stainer"), "Winger")
  val ste: Player = Player(13, Name("Ste","Crowson"), "Defender")
  val ross: Player = Player(14, Name("Ross","Crowson"), "Defender")
  val lee: Player = Player(15, Name("Lee","Haines"), "Striker")
  val matt: Player = Player(16, Name("Matt","Pugh"), "Defender")
  val david: Player = Player(17, Name("David","Vitova"), "Winger")
  val jobbo: Player = Player(18, Name("Tom","Jobburns"), "Midfielder")
  val malin: Player = Player(19, Name("Matty","Malin"), "Keeper")
  val scott: Player = Player(20, Name("Scott","Franks"), "Striker")
  val lewis: Player = Player(21, Name("Lewis","Winfindale"), "Defender")
  val ben: Player = Player(22, Name("Ben","Robinson"), "Midfielder")
  val rhys: Player = Player(23, Name("Rhys","Clarkson"), "Striker")
  val josh: Player = Player(24, Name("Josh","Cooper"), "Midfielder")
  val conlon: Player = Player(25, Name("Conlon","Vinters"), "Midfielder")
  val kaleem: Player = Player(26, Name("Kaleem","Ramzan"), "Striker")
  val jake: Player = Player(27, Name("Jake","Cook"), "Midfielder")
  val bob: Player = Player(28, Name("Bob","Cowdrill"), "Defender")

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, layton, adNixon, danSmout, luke, danGrimbo, charlie, cameron,
    lukeNixon, callum, ste, ross, lee, matt, david, jobbo, malin, scott, lewis, ben, rhys, josh, conlon, kaleem, jake, bob).sortBy(_.name.lastName))

  // ********* Preseason results *********

  val shifnalTeam:Team = Team(List(malin, matt, ste, ross, luke, layton, jobbo, rhys, david, callum, joey, charlie, danSmout, danGrimbo))
  val shifnalResult: Result = Result(1, homeTeam = shifnalTeam, awayTeam = "Shifnal Imperials", goalsFor = 3, goalsAgainst = 4, scorers = List(joey, jobbo, callum), assists = List(david, ross), motm = layton, date = LocalDate.of(2022, 7, 3))

  val minersTeam:Team = Team(List(malin, luke, lukeNixon, ross, ste, layton, jobbo, adNixon, rhys, charlie, joey, chad, danSmout, danGrimbo, callum))
  val minersResult: Result = Result(2, homeTeam = minersTeam, awayTeam = "Miners Arms", goalsFor = 1, goalsAgainst = 4, scorers = List(ross), assists = List(luke), motm = ross, date = LocalDate.of(2022, 7, 10))

  //Other player was jobbos mate jordan
  val unicornTeam:Team = Team(List(malin, danGrimbo, ste, ross, luke, layton, conlon, josh, jobbo, rhys,mattMaiden))
  val unicornResult: Result = Result(3, homeTeam = unicornTeam, awayTeam = "Unicorn FC", goalsFor = 5, goalsAgainst = 0, scorers = List(josh, conlon, josh, mattMaiden), assists = List(layton, conlon, josh, ross), motm = josh, date = LocalDate.of(2022, 7, 17))

  val wrockersTeam:Team = Team(List(malin, ross, adNixon, danGrimbo, luke, josh, jobbo, layton, joey, callum, ben, charlie, chad, scott, mattMaiden, matt))
  val wrockersResult: Result = Result(4, homeTeam = wrockersTeam, awayTeam = "Wrockwardine Wood FC", goalsFor = 0, goalsAgainst = 2, scorers = List(), assists = List(), motm = layton, date = LocalDate.of(2022, 7, 21))

  //Other player was Jake who needs adding to the site
  val wicketsTeam:Team = Team(List(malin, mattMaiden, jobbo, ste, luke, conlon, layton, josh, joey, lewis, lee, callum, scott, rhys, jake))
  val wicketsResult: Result = Result(5, homeTeam = wicketsTeam, awayTeam = "Church Wickets FC", goalsFor = 2, goalsAgainst = 7, scorers = List(jobbo, rhys), assists = List(mattMaiden, josh), motm = lee, date = LocalDate.of(2022, 7, 24))

  //Other player was Jaden
  val telfordTeam:Team = Team(List(callum, jake, layton, danGrimbo, ste, lewis, josh, jobbo, joey, rhys, kaleem, lee, ben, charlie))
  val telfordResult: Result = Result(6, homeTeam = telfordTeam, awayTeam = "AFC Telford UTD", goalsFor = 4, goalsAgainst = 2, scorers = List(kaleem, kaleem, kaleem, josh), assists = List(joey, joey, jobbo), motm = kaleem, date = LocalDate.of(2022, 7, 27))

  val poloniaTeam:Team = Team(List(callum, danSmout, danGrimbo, ste, ross, charlie, layton, conlon, joey, rhys, josh, mattMaiden, scott, lewis))
  val poloniaResult: Result = Result(7, homeTeam = poloniaTeam, awayTeam = "Polonia Telford FC", goalsFor = 4, goalsAgainst = 1, scorers = List(rhys, conlon, josh, scott), assists = List(joey, layton, danSmout), motm = callum, date = LocalDate.of(2022, 7, 31))

  val wrockersTeam2:Team = Team(List(malin, jake, ross, ste, danGrimbo, lukeNixon, jobbo, adNixon, joey, josh, callum, scott, charlie, ben))
  val wrockersResult2: Result = Result(8, homeTeam = wrockersTeam2, awayTeam = "Wrockwardine Wood FC", goalsFor = 6, goalsAgainst = 1, scorers = List(joey, jake, ross, callum), assists = List(josh, josh, josh, jake, jake, jobbo), motm = jake, date = LocalDate.of(2022, 8, 4))

  val railwayTeam:Team = Team(List(callum, danSmout, ste, adNixon, lukeNixon, jobbo, layton, conlon, joey, rhys, josh, charlie, scott))
  val railwayResult: Result = Result(9, homeTeam = railwayTeam, awayTeam = "Railway United", goalsFor = 3, goalsAgainst = 3, scorers = List(joey, joey, ste), assists = List(josh, rhys, rhys), motm = adNixon, date = LocalDate.of(2022, 8, 7))

  val impactTeam:Team = Team(List(malin, ross, ste, danGrimbo, bob, luke, josh, layton, joey, rhys, kaleem, scott, lukeNixon, callum))
  val impactResult: Result = Result(10, homeTeam = impactTeam, awayTeam = "Impact FC", goalsFor = 3, goalsAgainst = 2, scorers = List(rhys, ross, kaleem), assists = List(joey, ross, lukeNixon), motm = mattMaiden, date = LocalDate.of(2022, 8, 21))

  //  ******** RESULTS ********

  val fullResults: List[Result] = List(shifnalResult, minersResult, unicornResult, wrockersResult, wicketsResult, telfordResult, poloniaResult, wrockersResult2, railwayResult, impactResult).reverse

//  ******** FIXTURES *********

  val fullFixtures: List[Fixture] = List()

}
