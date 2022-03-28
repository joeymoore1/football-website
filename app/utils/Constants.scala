package utils

import java.time.LocalDate

import models._

object Constants {

  //  ******** PLAYERS ********

  val joey: Player = Player(1, Name("Joey","Moore"), "Striker")
  val chad: Player = Player(2, Name("Chad","Bailey"), "Keeper")
  val mattMaiden: Player = Player(3, Name("Matt","Maiden"), "Defender")
  val adFox: Player = Player(4, Name("Adam","Fox"), "Midfielder")
  val layton: Player = Player(5, Name("Layton","Reynolds"), "Defender")
  val jack: Player = Player(6, Name("Jack","Tarpey"), "Midfielder")
  val adNixon: Player = Player(7, Name("Adam","Nixon"), "Defender")
  val danSmart: Player = Player(8, Name("Daniel","Smart"), "Midfielder")
  val danSmout: Player = Player(9, Name("Dan","Smout"), "Defender")
  val mattSmart: Player = Player(10, Name("Matt","Smart"), "Midfielder")
  val luke: Player = Player(11, Name("Luke","Hester"), "Striker")
  val danGrimbo: Player = Player(12, Name("Dan","Griffiths"), "Defender")
  val charlie: Player = Player(13, Name("Charlie","Bates"), "Defender")
  val kieran: Player = Player(14, Name("Kieran","Jakovic"), "Defender")
  val cameron: Player = Player(15, Name("Cameron","Rann"), "Midfielder")
  val lewis: Player = Player(16, Name("Lewis","Evans"), "Defender")
  val lukeNixon: Player = Player(17, Name("Luke","Nixon"), "Defender")
  val rich: Player = Player(18, Name("Rich","Sambrook"), "Midfielder")
  val kieranW: Player = Player(19, Name("Kieran","Whyman"), "Defender")
  val callum: Player = Player(20, Name("Callum","Stainer"), "Midfielder")
  val kaleem: Player = Player(21, Name("Kaleem","Ramzan"), "Striker")
  val lj: Player = Player(22, Name("Liam","Johnson"), "Striker")
  val ben: Player = Player(23, Name("Ben","Stokes"), "Defender")
  val jackWills: Player = Player(24, Name("Jack","Williams"), "Striker")

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, adFox, layton, jack, adNixon, danSmout, danSmart,
    mattSmart, danGrimbo, charlie, kieran, cameron, luke, lewis, lukeNixon, rich, kieranW, callum, kaleem, lj, ben, jackWills).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  val phezTeam:Team = Team(List(kieran, jack, adNixon, danGrimbo, lukeNixon, layton, mattMaiden, cameron, joey, mattSmart, danSmout, charlie, luke, kaleem))
  val phezResult: Result = Result(1, homeTeam = phezTeam, awayTeam = "AFC Phez", goalsFor = 5, goalsAgainst = 2, scorers = List(joey, cameron, cameron, adNixon, kaleem), assists = List(luke, jack, charlie, kaleem, kaleem), date = LocalDate.of(2021, 9, 12))

  val impactTeam:Team = Team(List(chad, jack, danGrimbo, adNixon, lukeNixon, layton, mattMaiden, cameron, mattSmart, joey, kieran, adFox, charlie, kaleem))
  val impactResult: Result = Result(2, homeTeam = impactTeam, awayTeam = "Impact FC", goalsFor = 1, goalsAgainst = 4, scorers = List(adFox), assists = List(cameron), date = LocalDate.of(2021, 9, 19))

  val bullTeam:Team = Team(List(chad, lukeNixon, adNixon, danGrimbo, danSmout, jack, joey, mattMaiden, mattSmart, cameron, adFox, kieran, layton, kaleem))
  val bullResult: Result = Result(3, homeTeam = bullTeam, awayTeam = "Bull in the barne FC", goalsFor = 3, goalsAgainst = 4, scorers = List(adNixon, jack, mattSmart), assists = List(mattSmart, adNixon), date = LocalDate.of(2021, 9, 26))

  val poloniaTeam:Team = Team(List(chad, lukeNixon, layton, danGrimbo, adFox, danSmart, mattMaiden, adNixon, jack, joey, mattSmart, danSmout, lewis, kieran))
  val poloniaResult: Result = Result(4, homeTeam = poloniaTeam, awayTeam = "Polonia Telford FC", goalsFor = 0, goalsAgainst = 6, scorers = List(), assists = List(), date = LocalDate.of(2021, 10, 3))

  val queensTeam:Team = Team(List(chad, kieran, danSmout, adFox, charlie, danSmart, luke, jack, mattSmart, mattMaiden, lewis, layton, danGrimbo))
  val queensResult: Result = Result(5, homeTeam = queensTeam, awayTeam = "FC Queens", goalsFor = 3, goalsAgainst = 1, scorers = List(jack, mattSmart, danSmout), assists = List(jack, mattSmart), date = LocalDate.of(2021, 10, 17))

  val travsTeam:Team = Team(List(chad, layton, lukeNixon, danGrimbo, mattMaiden, kieran, danSmout, mattSmart, jack, rich, luke, lewis, kaleem))
  val travsResult: Result = Result(6, homeTeam = travsTeam, awayTeam = "Travellers Joy", goalsFor = 1, goalsAgainst = 1, scorers = List(rich), assists = List(luke), date = LocalDate.of(2021, 10, 24))

  val impact2Team:Team = Team(List(chad, adNixon, lukeNixon, adFox, danSmout, charlie, joey, mattMaiden, kaleem, jack, callum, kieranW, lewis, danGrimbo))
  val impact2Result: Result = Result(7, homeTeam = impact2Team, awayTeam = "Impact FC", goalsFor = 6, goalsAgainst = 2, scorers = List(joey, kaleem, jack, callum, danGrimbo, adNixon), assists = List(kaleem, kaleem, kaleem, joey, joey), date = LocalDate.of(2021, 11, 21))

  val apleyTeam:Team = Team(List(chad, lukeNixon, adFox, danGrimbo, layton, mattMaiden, jack, danSmout, danSmart, adNixon, joey, charlie, luke, kieran))
  val apleyResult: Result = Result(8, homeTeam = apleyTeam, awayTeam = "Apley United FC", goalsFor = 3, goalsAgainst = 5, scorers = List(joey, adNixon, mattMaiden), assists = List(joey, joey), date = LocalDate.of(2021, 11, 28))

  val wrekinTeam:Team = Team(List(chad, layton, lukeNixon, kieran, kieranW, danSmout, danGrimbo, mattMaiden, mattSmart, luke, joey, kaleem, jack, lewis, charlie, callum))
  val wrekinResult: Result = Result(9, homeTeam = wrekinTeam, awayTeam = "AFC Wrekin", goalsFor = 0, goalsAgainst = 4, scorers = List(), assists = List(), date = LocalDate.of(2021, 12, 5))

  //Other goal was an OG
  val phez2Team:Team = Team(List(chad, danGrimbo, joey, layton, mattMaiden, mattSmart, cameron, danSmout, kaleem, callum, charlie, luke))
  val phez2Result: Result = Result(10, homeTeam = phez2Team, awayTeam = "AFC Phez Newport", goalsFor = 4, goalsAgainst = 1, scorers = List(kaleem, kaleem, callum), assists = List(cameron, callum, callum), date = LocalDate.of(2021, 12, 12))

  //Other player was chris
  val bellBailsTeam:Team = Team(List(lukeNixon, danSmout, layton, danSmart, lewis, mattMaiden, adNixon, joey, kaleem, callum, jack, charlie, luke, mattSmart, danGrimbo))
  val bellBailsResult: Result = Result(11, homeTeam = bellBailsTeam, awayTeam = "Bell & Bails FC", goalsFor = 5, goalsAgainst = 2, scorers = List(joey, joey, kaleem, kaleem, jack), assists = List(adNixon, adNixon, joey, kaleem), date = LocalDate.of(2022, 1, 9))

  val travsTeam2:Team = Team(List(chad, danSmout, layton, lukeNixon, mattMaiden, jack, adNixon, cameron, mattSmart, callum, joey, adFox, danGrimbo))
  val travsResult2: Result = Result(12, homeTeam = travsTeam2, awayTeam = "Travellers Joy", goalsFor = 3, goalsAgainst = 0, scorers = List(joey, joey, adNixon), assists = List(joey, danSmout, adFox), date = LocalDate.of(2022, 1, 16))

  val wrekinTeam2:Team = Team(List(chad, danSmout, adNixon, layton, mattMaiden, danSmart, jack, cameron, charlie, mattSmart, kaleem, rich, danGrimbo, callum))
  val wrekinResult2: Result = Result(13, homeTeam = wrekinTeam2, awayTeam = "AFC Wrekin", goalsFor = 4, goalsAgainst = 3, scorers = List(kaleem, jack, adNixon, danGrimbo), assists = List(danSmart, danSmart, adNixon), date = LocalDate.of(2022, 1, 23))

  val madeleyTeam:Team = Team(List(chad, luke, lukeNixon, layton, mattMaiden, danGrimbo, adNixon, cameron, jack, joey, mattSmart, lewis, charlie, callum))
  val madeleyResult: Result = Result(14, homeTeam = madeleyTeam, awayTeam = "Madeley CC FC", goalsFor = 0, goalsAgainst = 2, scorers = List(), assists = List(), date = LocalDate.of(2022, 1, 30))

  val wrekinTeam3:Team = Team(List(chad, luke, layton, lukeNixon, danSmout, charlie, adNixon, danGrimbo, cameron, adFox, lewis, kaleem, lj))
  val wrekinResult3: Result = Result(15, homeTeam = wrekinTeam3, awayTeam = "AFC Wrekin", goalsFor = 2, goalsAgainst = 3, scorers = List(kaleem, charlie), assists = List(lj), date = LocalDate.of(2022, 3, 6))

  //Other player were connor, charlie(dawley mongs)
  val queensTeam2:Team = Team(List(chad, danSmout, lukeNixon, layton, jack, danGrimbo, adNixon, kaleem, adFox, lj, mattSmart, lewis, callum, ben))
  val queensResult2: Result = Result(16, homeTeam = queensTeam2, awayTeam = "FC Queens", goalsFor = 2, goalsAgainst = 5, scorers = List(kaleem, adNixon), assists = List(lj, lj), date = LocalDate.of(2022, 3, 20))

  val poloniaTeam2:Team = Team(List(chad, danSmout, layton, lukeNixon, danGrimbo, adNixon, mattMaiden, mattSmart, joey, callum, charlie, adFox, ben, jackWills))
  val poloniaResult2: Result = Result(17, homeTeam = poloniaTeam2, awayTeam = "Polonia Telford FC", goalsFor = 1, goalsAgainst = 3, scorers = List(joey), assists = List(jackWills), date = LocalDate.of(2022, 3, 27))

  val fullResults: List[Result] = List(phezResult, impactResult, bullResult, poloniaResult, queensResult, travsResult, impact2Result, apleyResult, wrekinResult, phez2Result, bellBailsResult, travsResult2, wrekinResult2, madeleyResult, wrekinResult3, queensResult2, poloniaResult2).reverse

//  ******** FIXTURES *********

  val fullFixtures: List[Fixture] = List()

}
