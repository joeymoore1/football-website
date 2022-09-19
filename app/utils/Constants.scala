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
  val jake: Player = Player(27, Name("Jake","Cooksey"), "Midfielder")
  val bob: Player = Player(28, Name("Bob","Cowdrill"), "Defender")

  //  ******** TEAMS ********

  val phez = "AFC Phez Newport"
  val wrekin = "AFC Wrekin"
  val bails = "Bell and Bails FC"
  val wickets = "Church Wicketts FC"
  val cottage = "Cottage Spring 2022"
  val dunCow = "Dun Cow Wellington"
  val queens = "FC Queens"
  val rose = "Rose & Crown FC"
  val unicorn = "The Unicorn FC"
  val wenlock = "Wenlock OSA FC"
  val wrockers = "Wrockwardine Wood Juniors Sunday"

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, layton, adNixon, danSmout, luke, danGrimbo, charlie, cameron,
    lukeNixon, callum, ste, ross, lee, matt, david, jobbo, malin, scott, lewis, ben, rhys, josh, conlon, kaleem, jake, bob).sortBy(_.name.lastName))

  // ********* Preseason results *********

  // yellow card was josh
  val unicornTeam:Team = Team(List(malin, luke, ste, adNixon, lukeNixon, ben, layton, jobbo, joey, josh, kaleem, rhys, callum, cameron, jake))
  val unicornResult: Result = Result(1, homeTeam = unicornTeam, awayTeam = unicorn, goalsFor = 6, goalsAgainst = 1, scorers = List(joey, rhys, rhys, rhys, josh, jobbo),
    assists = List(jobbo, joey, joey, joey, cameron, ben), motm = rhys, date = LocalDate.of(2022, 9, 4), yellowCards = List(josh))

  val wrockersTeam: Team = Team(List(malin, ross, ste, lukeNixon, danGrimbo, jake, jobbo, layton, joey, rhys, josh, lee, cameron, kaleem, adNixon, conlon))
  val wrockersResult: Result = Result(2, homeTeam = wrockersTeam, awayTeam = wrockers, goalsFor = 2, goalsAgainst = 2, scorers = List(ste, kaleem),
    assists = List(cameron, ross), motm = jobbo, date = LocalDate.of(2022, 9, 18))

  //  ******** RESULTS ********

  val fullResults: List[Result] = List(unicornResult, wrockersResult).reverse

//  ******** FIXTURES *********

  val roseFixture: Fixture = Fixture(opponent = rose, date = LocalDate.of(2022, 9, 25), venue = "unknown", gameType = "league")

  val fullFixtures: List[Fixture] = List(roseFixture)

}
