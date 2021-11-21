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

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, adFox, layton, jack, adNixon, danSmout, danSmart,
    mattSmart, danGrimbo, charlie, kieran, cameron, luke, lewis, lukeNixon, rich, kieranW, callum, kaleem).sortBy(_.name.lastName))

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

  val fullResults: List[Result] = List(phezResult, impactResult, bullResult, poloniaResult, queensResult, travsResult, impact2Result).reverse

//  ******** FIXTURES *********
  
  val fullFixtures: List[Fixture] = List()

}
