package utils

import java.time.LocalDate

import models._

object Constants {

  //  ******** PLAYERS ********

  val joey: Player = Player(1, Name("Joey","Moore"), "Midfielder")
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
  val ste: Player = Player(13, Name("Ste","Crowson"), "Defender")
  val ross: Player = Player(14, Name("Ross","Crowson"), "Defender")
  val lee: Player = Player(15, Name("Lee","Haines"), "Striker")
  val matt: Player = Player(16, Name("Matt","Pugh"), "Defender")
  val jobbo: Player = Player(18, Name("Tom","Jobburns"), "Midfielder")
  val malin: Player = Player(19, Name("Matty","Malin"), "Keeper")
  val scott: Player = Player(20, Name("Scott","Franks"), "Striker")
  val ben: Player = Player(22, Name("Ben","Robinson"), "Midfielder")
  val rhys: Player = Player(23, Name("Rhys","Clarkson"), "Striker")
  val josh: Player = Player(24, Name("Josh","Cooper"), "Midfielder")
  val conlon: Player = Player(25, Name("Conlon","Vinters"), "Midfielder")
  val jake: Player = Player(27, Name("Jake","Cooksey"), "Midfielder")
  val bob: Player = Player(28, Name("Bob","Cowdrill"), "Defender")
  val dave: Player = Player(29, Name("Dave", "Easthope"), "Striker")

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
  val ellesmere = "Ellesmere United FC"
  val nations = "FC Nations"

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, layton, adNixon, danSmout, luke, danGrimbo, charlie, cameron,
    lukeNixon, ste, ross, lee, matt, jobbo, malin, scott, ben, rhys, josh, conlon, jake, bob, dave).sortBy(_.name.lastName))

  val unicornTeam:Team = Team(List(malin, luke, ste, adNixon, lukeNixon, ben, layton, jobbo, joey, josh, rhys, cameron, jake))
  val unicornResult: Result = Result(1, homeTeam = unicornTeam, awayTeam = unicorn, goalsFor = 6, goalsAgainst = 1, scorers = List(joey, rhys, rhys, rhys, josh, jobbo),
    assists = List(jobbo, joey, joey, joey, cameron, ben), motm = rhys, date = LocalDate.of(2022, 9, 4), yellowCards = List(josh))

  //Other goal was kaleem
  val wrockersTeam: Team = Team(List(malin, ross, ste, lukeNixon, danGrimbo, jake, jobbo, layton, joey, rhys, josh, lee, cameron, adNixon, conlon))
  val wrockersResult: Result = Result(2, homeTeam = wrockersTeam, awayTeam = wrockers, goalsFor = 2, goalsAgainst = 2, scorers = List(ste),
    assists = List(cameron, ross), motm = jobbo, date = LocalDate.of(2022, 9, 18))

  val roseTeam: Team = Team(List(malin, luke, ross, ste, bob, danGrimbo, jake, jobbo, layton, joey, rhys, josh, lee, adNixon, conlon))
  val roseResult: Result = Result(3, homeTeam = roseTeam, awayTeam = rose, goalsFor = 2, goalsAgainst = 4, scorers = List(josh, lee),
    assists = List(luke, luke), motm = conlon, date = LocalDate.of(2022, 9, 25), yellowCards = List(josh))

  val ellesmereTeam: Team = Team(List(chad, luke, ross, ste, danGrimbo, jake, ben, joey, rhys, josh, lee, adNixon, conlon, charlie, luke))
  val ellesmereResult: Result = Result(4, homeTeam = ellesmereTeam, awayTeam = ellesmere, goalsFor = 2, goalsAgainst = 1, scorers = List(lee, lee),
    assists = List(luke), motm = lee, date = LocalDate.of(2022, 10, 2), yellowCards = List(josh))

  val bailsTeam: Team = Team(List(malin, luke, ross, ste, jake, joey, rhys, josh, lee, adNixon, conlon, bob, jobbo, layton))
  val bailsResult: Result = Result(5, homeTeam = bailsTeam, awayTeam = bails, goalsFor = 4, goalsAgainst = 1, scorers = List(lee, joey, ross, ste),
    assists = List(josh, josh, josh, luke), motm = luke, date = LocalDate.of(2022, 10, 16))

  val nationsTeam: Team = Team(List(malin, adNixon, lukeNixon, ste, ross, danGrimbo, josh, lee, layton, conlon, ben, charlie, rhys, cameron))
  val nationsResult: Result = Result(6, homeTeam = nationsTeam, awayTeam = nations, goalsFor = 2, goalsAgainst = 4, scorers = List(conlon),
    assists = List(rhys), motm = conlon, yellowCards = List(josh), date = LocalDate.of(2022, 11, 6))

  val dunCowTeam: Team = Team(List(malin, lukeNixon, bob, ste, ross, conlon, adNixon, layton, jobbo, lee, josh, luke, danGrimbo, rhys, jake))
  val dunCowResult: Result = Result(7, homeTeam = dunCowTeam, awayTeam = dunCow, goalsFor = 4, goalsAgainst = 3, scorers = List(lee, lee, lee, josh),
    assists = List(malin, josh, adNixon, lee), motm = lee, date = LocalDate.of(2022, 11, 13))

  val cottageTeam: Team = Team(List(malin, jake, bob, ste, ross, jobbo, layton, adNixon, joey, josh, lee, danGrimbo, charlie, danSmout, conlon))
  val cottageResult: Result = Result(8, homeTeam = cottageTeam, awayTeam = cottage, goalsFor = 5, goalsAgainst = 0, scorers = List(lee, lee, lee, joey, ross),
    assists = List(josh, josh, jobbo, jobbo, joey), motm = jobbo, yellowCards = List(mattMaiden), date = LocalDate.of(2022, 11, 20))

  val queensTeam: Team = Team(List(malin, jobbo, danGrimbo, ste, conlon, ben, josh, layton, joey, dave, lee, rhys, luke, jake, scott))
  val queensResult: Result = Result(9, homeTeam = queensTeam, awayTeam = queens, goalsFor = 1, goalsAgainst = 2, scorers = List(rhys),
    assists = List(ben), motm = ste, yellowCards = List(luke, josh), date = LocalDate.of(2022, 11, 27))

  val wrockersTeam2: Team = Team(List(malin, jake, ste, ross, adNixon, luke, jobbo, layton, dave, rhys, josh, danSmout, mattMaiden))
  val wrockersResult2: Result = Result(10, homeTeam = wrockersTeam2, awayTeam = wrockers, goalsFor = 0, goalsAgainst = 2, motm = adNixon,
    yellowCards = List(jobbo), redCards = List(josh, mattMaiden), date = LocalDate.of(2022, 12, 4))

  val phezTeam: Team = Team(List(malin, adNixon, lukeNixon, ross, cameron, lee, layton, josh, joey, dave, rhys, jake, ste, luke))
  val phezResult: Result = Result(11, homeTeam = phezTeam, awayTeam = phez, goalsFor = 3, goalsAgainst = 2, motm = lee,
    yellowCards = List(josh), scorers = List(lee, lee, josh), assists = List(jake), date = LocalDate.of(2023, 1, 8))

  val queensTeam2: Team = Team(List(malin, lukeNixon, ste, ross, cameron, jobbo, jake, joey, dave, josh, lee, rhys, luke, danGrimbo, scott, ben))
  val queensResult2: Result = Result(12, homeTeam = queensTeam2, awayTeam = queens, goalsFor = 1, goalsAgainst = 5, motm = jobbo,
    yellowCards = List(josh, dave), scorers = List(jake), assists = List(dave), date = LocalDate.of(2023, 1, 17))

  //  ******** RESULTS ********

  val fullResults: List[Result] = List(unicornResult, wrockersResult, roseResult, ellesmereResult, bailsResult, nationsResult,
    dunCowResult, cottageResult, queensResult, wrockersResult2, phezResult, queensResult2).reverse

//  ******** FIXTURES *********

  val dunCowFixture: Fixture = Fixture(opponent = dunCow, date = LocalDate.of(2022, 1, 22), venue = "Ketley Bank", gameType = "league")
  val bailsFixture: Fixture = Fixture(opponent = bails, date = LocalDate.of(2022, 1, 29), venue = "HLC", gameType = "league")

  val fullFixtures: List[Fixture] = List(dunCowFixture, bailsFixture)

}
