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
  val dean: Player = Player(6, Name("Dean","Ridley"), "Defender")
  val jack: Player = Player(7, Name("Jack","Tarpey"), "Midfielder")
  val adNixon: Player = Player(8, Name("Adam","Nixon"), "Defender")
  val danSmart: Player = Player(9, Name("Daniel","Smart"), "Midfielder")
  val danSmout: Player = Player(10, Name("Dan","Smout"), "Defender")
  val mattSmart: Player = Player(11, Name("Matt","Smart"), "Midfielder")
  val kaleem: Player = Player(12, Name("Kaleem","Ramzan"), "Striker")
  val josh: Player = Player(13, Name("Josh","Edwards"), "Striker")
  val danGrimbo: Player = Player(14, Name("Dan","Griffiths"), "Defender")
  val charlie: Player = Player(15, Name("Charlie","Bates"), "Defender")
  val rich: Player = Player(16, Name("Rich","Boden"), "Defender")
  val tony: Player = Player(17, Name("Tony","Wilkes"), "Midfielder")
  val kian: Player = Player(18, Name("Kian","Garbett"), "Midfielder")
  val kieran: Player = Player(19, Name("Kieran","Jakovic"), "Defender")
  val cameron: Player = Player(20, Name("Cameron","Rann"), "Midfielder")

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, adFox, layton, dean, jack, adNixon, danSmout, danSmart,
    mattSmart, kaleem, josh, danGrimbo, charlie, rich, tony, kian, kieran, cameron).sortBy(_.name.lastName))

  //  ******** RESULTS ********

  //Other players were shit Kian and Nathan
  val tf3Team:Team = Team(List(chad, danSmout, adNixon, adFox, jack, joey, mattMaiden, danSmart, mattSmart, cameron, kian, kieran, layton))
  val tf3Result: Result = Result(1, homeTeam = tf3Team, awayTeam = "TF3 FC", goalsFor = 2, goalsAgainst = 4, scorers = List(cameron, mattSmart), assists = List(kian, cameron), date = LocalDate.of(2021, 7, 11))


  val fullResults: List[Result] = List(tf3Result).reverse

//  ******** FIXTURES *********

  val railwayFriendly: Fixture = Fixture("Railway United", LocalDate.of(2021, 7, 18), "Ketley Bank", "friendly")

  val fullFixtures: List[Fixture] = List(railwayFriendly)

}
