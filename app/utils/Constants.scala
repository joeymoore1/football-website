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
  val jack: Player = Player(7, Name("Jack","Tarpey"), "Midfielder")
  val adNixon: Player = Player(8, Name("Adam","Nixon"), "Defender")
  val danSmart: Player = Player(9, Name("Daniel","Smart"), "Midfielder")
  val danSmout: Player = Player(10, Name("Dan","Smout"), "Defender")
  val mattSmart: Player = Player(11, Name("Matt","Smart"), "Midfielder")
  val luke: Player = Player(13, Name("Luke","Hester"), "Striker")
  val danGrimbo: Player = Player(14, Name("Dan","Griffiths"), "Defender")
  val charlie: Player = Player(15, Name("Charlie","Bates"), "Defender")
  val rich: Player = Player(16, Name("Rich","Boden"), "Defender")
  val kieran: Player = Player(17, Name("Kieran","Jakovic"), "Defender")
  val cameron: Player = Player(18, Name("Cameron","Rann"), "Midfielder")
  val lewis: Player = Player(19, Name("Lewis","Evans"), "Defender")
  val lukeNixon: Player = Player(20, Name("Luke","Nixon"), "Defender")

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, adFox, layton, jack, adNixon, danSmout, danSmart,
    mattSmart, danGrimbo, charlie, rich, kieran, cameron, luke, lewis, lukeNixon).sortBy(_.name.lastName))

  //  ******** RESULTS ********

//  Other goal and two assists were from Kaleem
  val phezTeam:Team = Team(List(kieran, jack, adNixon, danGrimbo, lukeNixon, layton, mattMaiden, cameron, joey, mattSmart, danSmout, charlie, luke))
  val phezResult: Result = Result(1, homeTeam = phezTeam, awayTeam = "AFC Phez", goalsFor = 5, goalsAgainst = 2, scorers = List(joey, cameron, cameron, adNixon), assists = List(luke, jack, charlie), date = LocalDate.of(2021, 9, 12))

  val impactTeam:Team = Team(List(chad, jack, danGrimbo, adNixon, lukeNixon, layton, mattMaiden, cameron, mattSmart, joey, kieran, adFox, charlie))
  val impactResult: Result = Result(2, homeTeam = impactTeam, awayTeam = "Impact FC", goalsFor = 1, goalsAgainst = 4, scorers = List(adFox), assists = List(cameron), date = LocalDate.of(2021, 9, 19))

  val bullTeam:Team = Team(List(chad, lukeNixon, adNixon, danGrimbo, danSmout, jack, joey, mattMaiden, mattSmart, cameron, adFox, kieran, layton))
  val bullResult: Result = Result(3, homeTeam = bullTeam, awayTeam = "Bull in the barne FC", goalsFor = 3, goalsAgainst = 4, scorers = List(adNixon, jack, mattSmart), assists = List(mattSmart, adNixon), date = LocalDate.of(2021, 9, 26))

  val poloniaTeam:Team = Team(List(chad, lukeNixon, layton, danGrimbo, adFox, danSmart, mattMaiden, adNixon, jack, joey, mattSmart, danSmout, lewis, kieran))
  val poloniaResult: Result = Result(4, homeTeam = poloniaTeam, awayTeam = "Polonia Telford FC", goalsFor = 0, goalsAgainst = 6, scorers = List(), assists = List(), date = LocalDate.of(2021, 10, 3))

  val fullResults: List[Result] = List(phezResult, impactResult, bullResult, poloniaResult).reverse

//  ******** FIXTURES *********

  val queensFixture: Fixture = Fixture(opponent = "FC Queens", date = LocalDate.of(2021, 10, 17), venue = "Bowring Park", gameType = "league")

  val fullFixtures: List[Fixture] = List(queensFixture)

}
