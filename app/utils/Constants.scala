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
  val jobbo: Player = Player(18, Name("Tom","Jobburns"), "Midfielder")
  val malin: Player = Player(19, Name("Matty","Malin"), "Keeper")
  val scott: Player = Player(20, Name("Scott","Franks"), "Striker")
  val rhys: Player = Player(23, Name("Rhys","Clarkson"), "Striker")
  val josh: Player = Player(24, Name("Josh","Cooper"), "Midfielder")
  val conlon: Player = Player(25, Name("Conlon","Vinters"), "Midfielder")
  val jake: Player = Player(27, Name("Jake","Cooksey"), "Midfielder")
  val bob: Player = Player(28, Name("Bob","Cowdrill"), "Defender")
  val dave: Player = Player(29, Name("Dave", "Easthope"), "Striker")
  val harvey: Player = Player(30, Name("Harvey", "Edwards"), "Winger")
  val ash: Player = Player(31, Name("Ashley", "Brown"), "Defender")
  val jj: Player = Player(32, Name("Jamie", "Bloor"), "Midfielder")

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
    lukeNixon, ste, ross, lee, jobbo, malin, scott, rhys, josh, conlon, jake, bob, dave, ash, harvey, jj).sortBy(_.name.lastName))

  val unicornTeam:Team = Team(List(malin, luke, ste, adNixon, lukeNixon, layton, jobbo, joey, josh, rhys, cameron, jake))
  val unicornResult: Result = Result(1, homeTeam = unicornTeam, awayTeam = unicorn, goalsFor = 6, goalsAgainst = 1, scorers = List(joey, rhys, rhys, rhys, josh, jobbo),
    assists = List(jobbo, joey, joey, joey, cameron), motm = rhys, date = LocalDate.of(2022, 9, 4), yellowCards = List(josh))

  //Other goal was kaleem
  val wrockersTeam: Team = Team(List(malin, ross, ste, lukeNixon, danGrimbo, jake, jobbo, layton, joey, rhys, josh, lee, cameron, adNixon, conlon))
  val wrockersResult: Result = Result(2, homeTeam = wrockersTeam, awayTeam = wrockers, goalsFor = 2, goalsAgainst = 2, scorers = List(ste),
    assists = List(cameron, ross), motm = jobbo, date = LocalDate.of(2022, 9, 18))

  val roseTeam: Team = Team(List(malin, luke, ross, ste, bob, danGrimbo, jake, jobbo, layton, joey, rhys, josh, lee, adNixon, conlon))
  val roseResult: Result = Result(3, homeTeam = roseTeam, awayTeam = rose, goalsFor = 2, goalsAgainst = 4, scorers = List(josh, lee),
    assists = List(luke, luke), motm = conlon, date = LocalDate.of(2022, 9, 25), yellowCards = List(josh))

  val ellesmereTeam: Team = Team(List(chad, luke, ross, ste, danGrimbo, jake, joey, rhys, josh, lee, adNixon, conlon, charlie, luke))
  val ellesmereResult: Result = Result(4, homeTeam = ellesmereTeam, awayTeam = ellesmere, goalsFor = 2, goalsAgainst = 1, scorers = List(lee, lee),
    assists = List(luke), motm = lee, date = LocalDate.of(2022, 10, 2), yellowCards = List(josh))

  val bailsTeam: Team = Team(List(malin, luke, ross, ste, jake, joey, rhys, josh, lee, adNixon, conlon, bob, jobbo, layton))
  val bailsResult: Result = Result(5, homeTeam = bailsTeam, awayTeam = bails, goalsFor = 4, goalsAgainst = 1, scorers = List(lee, joey, ross, ste),
    assists = List(josh, josh, josh, luke), motm = luke, date = LocalDate.of(2022, 10, 16))

  val nationsTeam: Team = Team(List(malin, adNixon, lukeNixon, ste, ross, danGrimbo, josh, lee, layton, conlon, charlie, rhys, cameron))
  val nationsResult: Result = Result(6, homeTeam = nationsTeam, awayTeam = nations, goalsFor = 2, goalsAgainst = 4, scorers = List(conlon),
    assists = List(rhys), motm = conlon, yellowCards = List(josh), date = LocalDate.of(2022, 11, 6))

  val dunCowTeam: Team = Team(List(malin, lukeNixon, bob, ste, ross, conlon, adNixon, layton, jobbo, lee, josh, luke, danGrimbo, rhys, jake))
  val dunCowResult: Result = Result(7, homeTeam = dunCowTeam, awayTeam = dunCow, goalsFor = 4, goalsAgainst = 3, scorers = List(lee, lee, lee, josh),
    assists = List(malin, josh, adNixon, lee), motm = lee, date = LocalDate.of(2022, 11, 13))

  val cottageTeam: Team = Team(List(malin, jake, bob, ste, ross, jobbo, layton, adNixon, joey, josh, lee, danGrimbo, charlie, danSmout, conlon))
  val cottageResult: Result = Result(8, homeTeam = cottageTeam, awayTeam = cottage, goalsFor = 5, goalsAgainst = 0, scorers = List(lee, lee, lee, joey, ross),
    assists = List(josh, josh, jobbo, jobbo, joey), motm = jobbo, yellowCards = List(mattMaiden), date = LocalDate.of(2022, 11, 20))

  val queensTeam: Team = Team(List(malin, jobbo, danGrimbo, ste, conlon, josh, layton, joey, dave, lee, rhys, luke, jake, scott))
  val queensResult: Result = Result(9, homeTeam = queensTeam, awayTeam = queens, goalsFor = 1, goalsAgainst = 2, scorers = List(rhys),
    motm = ste, yellowCards = List(luke, josh), date = LocalDate.of(2022, 11, 27))

  val wrockersTeam2: Team = Team(List(malin, jake, ste, ross, adNixon, luke, jobbo, layton, dave, rhys, josh, danSmout, mattMaiden))
  val wrockersResult2: Result = Result(10, homeTeam = wrockersTeam2, awayTeam = wrockers, goalsFor = 0, goalsAgainst = 2, motm = adNixon,
    yellowCards = List(jobbo), redCards = List(josh, mattMaiden), date = LocalDate.of(2022, 12, 4))

  val phezTeam: Team = Team(List(malin, adNixon, lukeNixon, ross, cameron, lee, layton, josh, joey, dave, rhys, jake, ste, luke))
  val phezResult: Result = Result(11, homeTeam = phezTeam, awayTeam = phez, goalsFor = 3, goalsAgainst = 2, motm = lee,
    yellowCards = List(josh), scorers = List(lee, lee, josh), assists = List(jake), date = LocalDate.of(2023, 1, 8))

  val queensTeam2: Team = Team(List(malin, lukeNixon, ste, ross, cameron, jobbo, jake, joey, dave, josh, lee, rhys, luke, danGrimbo, scott))
  val queensResult2: Result = Result(12, homeTeam = queensTeam2, awayTeam = queens, goalsFor = 1, goalsAgainst = 5, motm = jobbo,
    yellowCards = List(josh, dave), scorers = List(jake), assists = List(dave), date = LocalDate.of(2023, 1, 17))

  val bailsTeam2: Team = Team(List(malin, josh, lukeNixon, ste, ross, jobbo, layton, conlon, joey, lee, adNixon, mattMaiden, charlie, danGrimbo, jake))
  val bailsResult2: Result = Result(13, homeTeam = bailsTeam2, awayTeam = bails, goalsFor = 10, goalsAgainst = 0, scorers = List(lee, lee, lee, ross, ross, ross, mattMaiden, joey, jobbo, adNixon),
    assists = List(adNixon, josh, josh, lee, lee, josh, jobbo, charlie, joey), motm = ross, date = LocalDate.of(2023, 1, 29))

  val wrekinTeam: Team = Team(List(malin, ste, ross, danGrimbo, jake, josh, jobbo, joey, lee, rhys, mattMaiden, ash))
  val wrekinResult: Result = Result(14, homeTeam = wrekinTeam, awayTeam = wrekin, goalsFor = 2, goalsAgainst = 2, scorers = List(rhys, josh),
    assists = List(josh), yellowCards = List(josh, danGrimbo, mattMaiden), motm = jobbo, date = LocalDate.of(2023, 2, 5))

  val wickettsTeam: Team = Team(List(malin, ste, ross, lukeNixon, adNixon, jobbo, layton, joey, lee, rhys, charlie, jake, danGrimbo, josh, ash, harvey))
  val wickettsResult: Result = Result(15, homeTeam = wickettsTeam, awayTeam = wickets, goalsFor = 2, goalsAgainst = 3, scorers = List(lee, ross),
    assists = List(lukeNixon), motm = layton, date = LocalDate.of(2023, 2, 12))

  val crownTeam: Team = Team(List(malin, mattMaiden, ross, ste, danGrimbo, lukeNixon, layton, adNixon, joey, josh, rhys, jake, luke, harvey, scott))
  val crownResult: Result = Result(16, homeTeam = crownTeam, awayTeam = rose, goalsFor = 3, goalsAgainst = 1, scorers = List(joey, joey, rhys),
    assists = List(rhys, scott), yellowCards = List(ste, scott, josh), motm = malin, date = LocalDate.of(2023, 2, 19))

  val cottageTeam2: Team = Team(List(malin, jake, danGrimbo, ross, lukeNixon, josh, layton, ste, joey, rhys, lee, harvey, conlon, jobbo, charlie))
  val cottageResult2: Result = Result(17, homeTeam = cottageTeam2, awayTeam = cottage, goalsFor = 3, goalsAgainst = 2, scorers = List(joey, josh, josh),
    assists = List(joey), yellowCards = List(josh), motm = lukeNixon, date = LocalDate.of(2023, 2, 26))

  val crownTeam2: Team = Team(List(malin, josh, ste, ross, danGrimbo, harvey, lukeNixon, jobbo, layton, joey, rhys, dave, conlon, jake))
  val crownResult2: Result = Result(18, homeTeam = crownTeam2, awayTeam = rose, goalsFor = 2, goalsAgainst = 1, scorers = List(josh, rhys),
    assists = List(layton), yellowCards = List(ste, conlon, dave), motm = josh, date = LocalDate.of(2023, 3, 5))

  val phezTeam2: Team = Team(List(malin, ste, ross, lukeNixon, danGrimbo, adNixon, layton, josh, dave, joey, lee, jake, jobbo))
  val phezResult2: Result = Result(19, homeTeam = phezTeam2, awayTeam = phez, goalsFor = 6, goalsAgainst = 1, scorers = List(lee, lee, lee, joey, joey, dave),
    assists = List(lee, lee, josh, layton, malin, adNixon), motm = joey, date = LocalDate.of(2023, 3, 19))

  val cottageTeam3: Team = Team(List(malin, ste, ross, lukeNixon, danGrimbo, adNixon, josh, joey, lee, jake, jobbo, harvey))
  val cottageResult3: Result = Result(20, homeTeam = cottageTeam3, awayTeam = cottage, goalsFor = 6, goalsAgainst = 0, scorers = List(lee, lee, lee, joey, ste, jobbo),
    assists = List(lee, lee, lee, joey, adNixon, harvey), yellowCards = List(josh), motm = lee, date = LocalDate.of(2023, 4, 2))

  //Other play was Ethan Ralf
  val unicornTeam2: Team = Team(List(chad, lukeNixon, ste, ross, danGrimbo, jake, jobbo, conlon, dave, josh, joey, mattMaiden, luke))
  val unicornResult2: Result = Result(21, homeTeam = unicornTeam2, awayTeam = unicorn, goalsFor = 7, goalsAgainst = 0, scorers = List(josh, josh, josh, joey, dave, dave, conlon),
    assists = List(jake, jake, dave, dave, ross), motm = josh, date = LocalDate.of(2023, 4, 9))

  val wrekinTeam2: Team = Team(List(malin, ross, harvey, jake, layton, lukeNixon, ste, jobbo, joey, dave, lee, rhys))
  val wrekinResult2: Result = Result(22, homeTeam = wrekinTeam2, awayTeam = wrekin, goalsFor = 3, goalsAgainst = 0, scorers = List(joey, joey, lee),
    assists = List(joey, jake, lee), yellowCards = List(layton), motm = harvey, date = LocalDate.of(2023, 4, 16))

  //Other player was Kenzie
  val dunCowTeam2: Team = Team(List(malin, conlon, layton, luke, harvey, jake, jobbo, ste, josh, lee, joey, jj, danGrimbo))
  val dunCowResult2: Result = Result(23, homeTeam = dunCowTeam2, awayTeam = dunCow, goalsFor = 7, goalsAgainst = 2, scorers = List(lee, lee, lee, lee, josh, jj, jj),
    assists = List(jake, luke, danGrimbo, josh, joey, lee), redCards = List(conlon), motm = lee, date = LocalDate.of(2023, 4, 23))


  //  ******** RESULTS ********

  val fullResults: List[Result] = List(unicornResult, wrockersResult, roseResult, ellesmereResult, bailsResult, nationsResult,
    dunCowResult, cottageResult, queensResult, wrockersResult2, phezResult, queensResult2, bailsResult2, wrekinResult,
    wickettsResult, crownResult, cottageResult2, crownResult2, phezResult2, cottageResult3, unicornResult2, wrekinResult2,
    dunCowResult2).reverse

//  ******** FIXTURES *********

  val fullFixtures: List[Fixture] = List()

}
