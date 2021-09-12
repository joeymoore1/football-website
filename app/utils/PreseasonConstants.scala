package utils

import java.time.LocalDate

import models._

object PreseasonConstants {

  //  ******** PLAYERS ********

  val joey: Player = Player(1, Name("Joey","Moore"), "Striker")
  val chad: Player = Player(2, Name("Chad","Bailey"), "Keeper")
  val mattMaiden: Player = Player(3, Name("Matt","Maiden"), "Defender")
  val adFox: Player = Player(4, Name("Adam","Fox"), "Midfielder")
  val layton: Player = Player(5, Name("Layton","Reynolds"), "Defender")
  val dean: Player = Player(6, Name("Dean","Ridley"), "Defender")
  val jack: Player = Player(7, Name("Jack","Tarpey"), "Midfielder")
  val adNixon: Player = Player(8, Name("Adam","Nixon"), "Defender")
  val danSmart: Player = Player(9, Name("Daniel","Smart"), "Midfielder")
  val danSmout: Player = Player(10, Name("Dan","Smout"), "Defender")
  val mattSmart: Player = Player(11, Name("Matt","Smart"), "Midfielder")
  val kaleem: Player = Player(12, Name("Kaleem","Ramzan"), "Striker")
  val luke: Player = Player(13, Name("Luke","Hester"), "Striker")
  val danGrimbo: Player = Player(14, Name("Dan","Griffiths"), "Defender")
  val charlie: Player = Player(15, Name("Charlie","Bates"), "Defender")
  val rich: Player = Player(16, Name("Rich","Boden"), "Defender")
  val kieran: Player = Player(17, Name("Kieran","Jakovic"), "Defender")
  val cameron: Player = Player(18, Name("Cameron","Rann"), "Midfielder")
  val lewis: Player = Player(19, Name("Lewis","Evans"), "Defender")
  val lukeNixon: Player = Player(20, Name("Luke","Nixon"), "Defender")

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, adFox, layton, dean, jack, adNixon, danSmout, danSmart,
    mattSmart, kaleem, danGrimbo, charlie, rich, kieran, cameron, luke, lewis, lukeNixon).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  //Other players were shit Kian and Nathan (good kian assisted but has left the team)
  val tf3Team:Team = Team(List(chad, danSmout, adNixon, adFox, jack, joey, mattMaiden, danSmart, mattSmart, cameron, kieran, layton))
  val tf3Result: Result = Result(1, homeTeam = tf3Team, awayTeam = "TF3 FC", goalsFor = 2, goalsAgainst = 4, scorers = List(cameron, mattSmart), assists = List(cameron), date = LocalDate.of(2021, 7, 11))

  val impactTeam:Team = Team(List(chad, danGrimbo, layton, adNixon, rich, mattMaiden, jack, danSmart, joey, cameron, mattSmart, charlie, kaleem, danSmout, kieran, luke))
  val impactResult: Result = Result(2, homeTeam = impactTeam, awayTeam = "Impact FC", goalsFor = 2, goalsAgainst = 1, scorers = List(joey, kaleem), assists = List(kaleem, mattMaiden), date = LocalDate.of(2021, 7, 29))

  val dawleyTeam:Team = Team(List(chad, layton, danGrimbo, adNixon, mattMaiden, cameron, mattSmart, joey, kaleem, jack, adFox, charlie, danSmout, danSmart, lewis))
  val dawleyResult: Result = Result(3, homeTeam = dawleyTeam, awayTeam = "Dawley Reserves", goalsFor = 3, goalsAgainst = 1, scorers = List(joey, joey, mattSmart), assists = List(adNixon), date = LocalDate.of(2021, 8, 11))

  val phezTeam:Team = Team(List(chad, layton, danGrimbo, adNixon, mattMaiden, mattSmart, joey, kaleem, charlie, danSmout, kieran, lewis, luke))
  val phezResult: Result = Result(4, homeTeam = phezTeam, awayTeam = "AFC Phez", goalsFor = 3, goalsAgainst = 4, scorers = List(kaleem, kaleem, kaleem), assists = List(joey), date = LocalDate.of(2021, 8, 15))

  val sportsTeam:Team = Team(List(chad, joey, cameron, kaleem, mattSmart, adNixon, mattMaiden, danSmout, charlie, layton, danSmart, lewis, luke))
  val sportsResult: Result = Result(5, homeTeam = sportsTeam, awayTeam = "Sports Village FC", goalsFor = 2, goalsAgainst = 4, scorers = List(kaleem, kaleem), assists = List(cameron, adNixon), date = LocalDate.of(2021, 8, 16))

  val fullResults: List[Result] = List(tf3Result, impactResult, dawleyResult, phezResult, sportsResult).reverse

  //  ******** FIXTURES *********

  val phezFixture: Fixture = Fixture(opponent = "AFC Phez", date = LocalDate.of(2021, 9, 12), venue = "Hinstock", gameType = "league")
  val impactFixture: Fixture = Fixture(opponent = "Impact FC", date = LocalDate.of(2021, 9, 19), venue = "Ketley Bank", gameType = "league")

  val fullFixtures: List[Fixture] = List(phezFixture, impactFixture)

}
