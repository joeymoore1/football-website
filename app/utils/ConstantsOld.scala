package utils

import models._

import java.time.LocalDate

object ConstantsOld {

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
  val david: Player = Player(33, Name("David", "Vitova"), "Striker")
  val callum: Player = Player(34, Name("Callum", "Stainer"), "Striker")
  val matt: Player = Player(35, Name("Matt","Pugh"), "Midfielder")
  val kaleem: Player = Player(36, Name("Kaleem","Ramzan"), "Striker")
  val ben: Player = Player(37, Name("Ben","Robinson"), "Midfielder")
  val lewis: Player = Player(38, Name("Lewis","Winfindale"), "Defender")
  val adFox: Player = Player(39, Name("Adam","Fox"), "Midfielder")
  val jack: Player = Player(40, Name("Jack","Tarpey"), "Midfielder")
  val danSmart: Player = Player(41, Name("Daniel","Smart"), "Midfielder")
  val mattSmart: Player = Player(42, Name("Matt","Smart"), "Winger")
  val rich: Player = Player(43, Name("Rich","Sambrook"), "Midfielder")
  val lj: Player = Player(44, Name("Liam", "Johnson"), "Striker")
  val benStokes: Player = Player(45, Name("Ben", "Stokes"), "Defender")
  val jackWills: Player = Player(46, Name("Jack", "Williams"), "Winger")
  val fake: Player = Player(47, Name("Fake", "Player"), "Winger")
  val kieran: Player = Player(48, Name("Kieran", "Jakovic"), "Winger")

  val fullTeam: Team = Team(List(joey, chad, mattMaiden, layton, adNixon, danSmout, luke, danGrimbo, charlie, cameron,
    lukeNixon, ste, ross, lee, jobbo, malin, scott, rhys, josh, conlon, jake, bob, dave, ash, harvey, jj, david, callum, matt, kaleem, lewis,
    adFox, jack, danSmart, mattSmart, rich, lj, benStokes, jackWills).sortBy(_.name.lastName))

  // ********* Preseason results *********

    //Other players were shit Kian and Nathan (good kian assisted but has left the team)
    val tf3Team:Team = Team(List(chad, danSmout, adNixon, adFox, jack, joey, mattMaiden, danSmart, mattSmart, cameron, kieran, layton))
    val tf3Result: Result = Result(1, homeTeam = tf3Team, awayTeam = "TF3 FC", goalsFor = 2, goalsAgainst = 4, scorers = List(cameron, mattSmart), assists = List(cameron), date = LocalDate.of(2021, 7, 11))

    val impactTeampre21:Team = Team(List(chad, danGrimbo, layton, adNixon, rich, mattMaiden, jack, danSmart, joey, cameron, mattSmart, charlie, kaleem, danSmout, kieran, luke))
    val impactResultpre21: Result = Result(2, homeTeam = impactTeampre21, awayTeam = "Impact FC", goalsFor = 2, goalsAgainst = 1, scorers = List(joey, kaleem), assists = List(kaleem, mattMaiden), date = LocalDate.of(2021, 7, 29))

    val dawleyTeam:Team = Team(List(chad, layton, danGrimbo, adNixon, mattMaiden, cameron, mattSmart, joey, kaleem, jack, adFox, charlie, danSmout, danSmart, lewis))
    val dawleyResult: Result = Result(3, homeTeam = dawleyTeam, awayTeam = "Dawley Reserves", goalsFor = 3, goalsAgainst = 1, scorers = List(joey, joey, mattSmart), assists = List(adNixon), date = LocalDate.of(2021, 8, 11))

    val phezTeampre21:Team = Team(List(chad, layton, danGrimbo, adNixon, mattMaiden, mattSmart, joey, kaleem, charlie, danSmout, kieran, lewis, luke))
    val phezResultpre21: Result = Result(4, homeTeam = phezTeampre21, awayTeam = "AFC Phez", goalsFor = 3, goalsAgainst = 4, scorers = List(kaleem, kaleem, kaleem), assists = List(joey), date = LocalDate.of(2021, 8, 15))

    val sportsTeam:Team = Team(List(chad, joey, cameron, kaleem, mattSmart, adNixon, mattMaiden, danSmout, charlie, layton, danSmart, lewis, luke))
    val sportsResult: Result = Result(5, homeTeam = sportsTeam, awayTeam = "Sports Village FC", goalsFor = 2, goalsAgainst = 4, scorers = List(kaleem, kaleem), assists = List(cameron, adNixon), date = LocalDate.of(2021, 8, 16))

  val fullResultspre21: List[Result] = List(tf3Result, impactResultpre21, dawleyResult, phezResultpre21, sportsResult).reverse

  //  ******** 2012/22 RESULTS ********

  val phezTeam21: Team = Team(List(jack, adNixon, danGrimbo, lukeNixon, layton, mattMaiden, cameron, joey, mattSmart, danSmout, charlie, luke, kaleem))
  val phezResult21: Result = Result(1, homeTeam = phezTeam21, awayTeam = "AFC Phez", goalsFor = 5, goalsAgainst = 2, scorers = List(joey, cameron, cameron, adNixon, kaleem), assists = List(luke, jack, charlie, kaleem, kaleem), date = LocalDate.of(2021, 9, 12))

  val impactTeam21: Team = Team(List(chad, jack, danGrimbo, adNixon, lukeNixon, layton, mattMaiden, cameron, mattSmart, joey, adFox, charlie, kaleem))
  val impactResult21: Result = Result(2, homeTeam = impactTeam21, awayTeam = "Impact FC", goalsFor = 1, goalsAgainst = 4, scorers = List(adFox), assists = List(cameron), date = LocalDate.of(2021, 9, 19))

  val bullTeam: Team = Team(List(chad, lukeNixon, adNixon, danGrimbo, danSmout, jack, joey, mattMaiden, mattSmart, cameron, adFox, layton, kaleem))
  val bullResult: Result = Result(3, homeTeam = bullTeam, awayTeam = "Bull in the barne FC", goalsFor = 3, goalsAgainst = 4, scorers = List(adNixon, jack, mattSmart), assists = List(mattSmart, adNixon), date = LocalDate.of(2021, 9, 26))

  val poloniaTeam21: Team = Team(List(chad, lukeNixon, layton, danGrimbo, adFox, danSmart, mattMaiden, adNixon, jack, joey, mattSmart, danSmout, lewis))
  val poloniaResult21: Result = Result(4, homeTeam = poloniaTeam21, awayTeam = "Polonia Telford FC", goalsFor = 0, goalsAgainst = 6, scorers = List(), assists = List(), date = LocalDate.of(2021, 10, 3))

  val queensTeam21: Team = Team(List(chad, danSmout, adFox, charlie, danSmart, luke, jack, mattSmart, mattMaiden, lewis, layton, danGrimbo))
  val queensResult21: Result = Result(5, homeTeam = queensTeam21, awayTeam = "FC Queens", goalsFor = 3, goalsAgainst = 1, scorers = List(jack, mattSmart, danSmout), assists = List(jack, mattSmart), date = LocalDate.of(2021, 10, 17))

  val travsTeam: Team = Team(List(chad, layton, lukeNixon, danGrimbo, mattMaiden, danSmout, mattSmart, jack, rich, luke, lewis, kaleem))
  val travsResult: Result = Result(6, homeTeam = travsTeam, awayTeam = "Travellers Joy", goalsFor = 1, goalsAgainst = 1, scorers = List(rich), assists = List(luke), date = LocalDate.of(2021, 10, 24))

  val impact2Team: Team = Team(List(chad, adNixon, lukeNixon, adFox, danSmout, charlie, joey, mattMaiden, kaleem, jack, callum, lewis, danGrimbo))
  val impact2Result: Result = Result(7, homeTeam = impact2Team, awayTeam = "Impact FC", goalsFor = 6, goalsAgainst = 2, scorers = List(joey, kaleem, jack, callum, danGrimbo, adNixon), assists = List(kaleem, kaleem, kaleem, joey, joey), date = LocalDate.of(2021, 11, 21))

  val apleyTeam: Team = Team(List(chad, lukeNixon, adFox, danGrimbo, layton, mattMaiden, jack, danSmout, danSmart, adNixon, joey, charlie, luke))
  val apleyResult: Result = Result(8, homeTeam = apleyTeam, awayTeam = "Apley United FC", goalsFor = 3, goalsAgainst = 5, scorers = List(joey, adNixon, mattMaiden), assists = List(joey, joey), date = LocalDate.of(2021, 11, 28))

  val wrekinTeam21: Team = Team(List(chad, layton, lukeNixon, danSmout, danGrimbo, mattMaiden, mattSmart, luke, joey, kaleem, jack, lewis, charlie, callum))
  val wrekinResult21: Result = Result(9, homeTeam = wrekinTeam21, awayTeam = "AFC Wrekin", goalsFor = 0, goalsAgainst = 4, scorers = List(), assists = List(), date = LocalDate.of(2021, 12, 5))

  //Other goal was an OG
  val phez2Team: Team = Team(List(chad, danGrimbo, joey, layton, mattMaiden, mattSmart, cameron, danSmout, kaleem, callum, charlie, luke))
  val phez2Result: Result = Result(10, homeTeam = phez2Team, awayTeam = "AFC Phez Newport", goalsFor = 4, goalsAgainst = 1, scorers = List(kaleem, kaleem, callum), assists = List(cameron, callum, callum), date = LocalDate.of(2021, 12, 12))

  //Other player was chris
  val bellBailsTeam: Team = Team(List(lukeNixon, danSmout, layton, danSmart, lewis, mattMaiden, adNixon, joey, kaleem, callum, jack, charlie, luke, mattSmart, danGrimbo))
  val bellBailsResult: Result = Result(11, homeTeam = bellBailsTeam, awayTeam = "Bell & Bails FC", goalsFor = 5, goalsAgainst = 2, scorers = List(joey, joey, kaleem, kaleem, jack), assists = List(adNixon, adNixon, joey, kaleem), date = LocalDate.of(2022, 1, 9))

  val travsTeam2: Team = Team(List(chad, danSmout, layton, lukeNixon, mattMaiden, jack, adNixon, cameron, mattSmart, callum, joey, adFox, danGrimbo))
  val travsResult2: Result = Result(12, homeTeam = travsTeam2, awayTeam = "Travellers Joy", goalsFor = 3, goalsAgainst = 0, scorers = List(joey, joey, adNixon), assists = List(joey, danSmout, adFox), date = LocalDate.of(2022, 1, 16))

  val wrekinTeam221: Team = Team(List(chad, danSmout, adNixon, layton, mattMaiden, danSmart, jack, cameron, charlie, mattSmart, kaleem, rich, danGrimbo, callum))
  val wrekinResult221: Result = Result(13, homeTeam = wrekinTeam221, awayTeam = "AFC Wrekin", goalsFor = 4, goalsAgainst = 3, scorers = List(kaleem, jack, adNixon, danGrimbo), assists = List(danSmart, danSmart, adNixon), date = LocalDate.of(2022, 1, 23))

  val madeleyTeam21: Team = Team(List(chad, luke, lukeNixon, layton, mattMaiden, danGrimbo, adNixon, cameron, jack, joey, mattSmart, lewis, charlie, callum))
  val madeleyResult21: Result = Result(14, homeTeam = madeleyTeam21, awayTeam = "Madeley CC FC", goalsFor = 0, goalsAgainst = 2, scorers = List(), assists = List(), date = LocalDate.of(2022, 1, 30))

  val wrekinTeam3: Team = Team(List(chad, luke, layton, lukeNixon, danSmout, charlie, adNixon, danGrimbo, cameron, adFox, lewis, kaleem, lj))
  val wrekinResult3: Result = Result(15, homeTeam = wrekinTeam3, awayTeam = "AFC Wrekin", goalsFor = 2, goalsAgainst = 3, scorers = List(kaleem, charlie), assists = List(lj), date = LocalDate.of(2022, 3, 6))

  //Other player were connor, charlie(dawley mongs)
  val queensTeam221: Team = Team(List(chad, danSmout, lukeNixon, layton, jack, danGrimbo, adNixon, kaleem, adFox, lj, mattSmart, lewis, callum, benStokes))
  val queensResult221: Result = Result(16, homeTeam = queensTeam221, awayTeam = "FC Queens", goalsFor = 2, goalsAgainst = 5, scorers = List(kaleem, adNixon), assists = List(lj, lj), date = LocalDate.of(2022, 3, 20))

  val poloniaTeam2: Team = Team(List(chad, danSmout, layton, lukeNixon, danGrimbo, adNixon, mattMaiden, mattSmart, joey, callum, charlie, adFox, benStokes, jackWills))
  val poloniaResult2: Result = Result(17, homeTeam = poloniaTeam2, awayTeam = "Polonia Telford FC", goalsFor = 1, goalsAgainst = 3, scorers = List(joey), assists = List(jackWills), date = LocalDate.of(2022, 3, 27))

  val madeleyTeam2: Team = Team(List(chad, danSmout, layton, lukeNixon, benStokes, luke, adNixon, cameron, jackWills, joey, lj, kaleem, adFox))
  val madeleyResult2: Result = Result(18, homeTeam = madeleyTeam2, awayTeam = "Madeley CC FC", goalsFor = 2, goalsAgainst = 5, scorers = List(kaleem, kaleem), assists = List(jackWills), date = LocalDate.of(2022, 4, 9))

  val apleyTeam2: Team = Team(List(chad, danSmout, adFox, mattMaiden, callum, luke, lj, kaleem, charlie, jack, joey, mattSmart, lewis))
  val apleyResult2: Result = Result(19, homeTeam = apleyTeam2, awayTeam = "Apley United FC", goalsFor = 1, goalsAgainst = 5, scorers = List(joey), assists = List(luke), date = LocalDate.of(2021, 4, 1))

  val bellBailsTeam2: Team = Team(List(chad, danSmout, layton, adFox, jack, danGrimbo, mattMaiden, luke, joey, jackWills, mattSmart, callum, lewis, charlie))
  val bellBailsResult2: Result = Result(20, homeTeam = bellBailsTeam2, awayTeam = "Bell & Bails FC", goalsFor = 1, goalsAgainst = 2, scorers = List(jackWills), assists = List(joey), date = LocalDate.of(2022, 4, 8))

  val fullResults21: List[Result] = List(phezResult21, impactResult21, bullResult, poloniaResult21, queensResult21, travsResult, impact2Result, apleyResult, wrekinResult21, phez2Result, bellBailsResult, travsResult2, wrekinResult221, madeleyResult21, wrekinResult3, queensResult221, poloniaResult2, madeleyResult2, apleyResult2, bellBailsResult2).reverse

  // ********* 2022/23 Preseason results *********

  val shifnalTeam: Team = Team(List(malin, matt, ste, ross, luke, layton, jobbo, rhys, david, callum, joey, charlie, danSmout, danGrimbo))
  val shifnalResult: Result = Result(1, homeTeam = shifnalTeam, awayTeam = "Shifnal Imperials", goalsFor = 3, goalsAgainst = 4, scorers = List(joey, jobbo, callum), assists = List(david, ross), motm = layton, date = LocalDate.of(2022, 7, 3))

  val minersTeam: Team = Team(List(malin, luke, lukeNixon, ross, ste, layton, jobbo, adNixon, rhys, charlie, joey, chad, danSmout, danGrimbo, callum))
  val minersResult: Result = Result(2, homeTeam = minersTeam, awayTeam = "Miners Arms", goalsFor = 1, goalsAgainst = 4, scorers = List(ross), assists = List(luke), motm = ross, date = LocalDate.of(2022, 7, 10))

  //Other player was jobbos mate jordan
  val unicornTeampre: Team = Team(List(malin, danGrimbo, ste, ross, luke, layton, conlon, josh, jobbo, rhys, mattMaiden))
  val unicornResultpre: Result = Result(3, homeTeam = unicornTeampre, awayTeam = "Unicorn FC", goalsFor = 5, goalsAgainst = 0, scorers = List(josh, conlon, josh, mattMaiden), assists = List(layton, conlon, josh, ross), motm = josh, date = LocalDate.of(2022, 7, 17))

  val wrockersTeampre2: Team = Team(List(malin, ross, adNixon, danGrimbo, luke, josh, jobbo, layton, joey, callum, ben, charlie, chad, scott, mattMaiden, matt))
  val wrockersResultpre2: Result = Result(4, homeTeam = wrockersTeampre2, awayTeam = "Wrockwardine Wood FC", goalsFor = 0, goalsAgainst = 2, scorers = List(), assists = List(), motm = layton, date = LocalDate.of(2022, 7, 21))

  val wicketsTeam: Team = Team(List(malin, mattMaiden, jobbo, ste, luke, conlon, layton, josh, joey, lewis, lee, callum, scott, rhys, jake))
  val wicketsResult: Result = Result(5, homeTeam = wicketsTeam, awayTeam = "Church Wickets FC", goalsFor = 2, goalsAgainst = 7, scorers = List(jobbo, rhys), assists = List(mattMaiden, josh), motm = lee, date = LocalDate.of(2022, 7, 24))

  //Other player was Jaden
  val telfordTeam: Team = Team(List(callum, jake, layton, danGrimbo, ste, lewis, josh, jobbo, joey, rhys, kaleem, lee, ben, charlie))
  val telfordResult: Result = Result(6, homeTeam = telfordTeam, awayTeam = "AFC Telford UTD", goalsFor = 4, goalsAgainst = 2, scorers = List(kaleem, kaleem, kaleem, josh), assists = List(joey, joey, jobbo), motm = kaleem, date = LocalDate.of(2022, 7, 27))

  val poloniaTeam: Team = Team(List(callum, danSmout, danGrimbo, ste, ross, charlie, layton, conlon, joey, rhys, josh, mattMaiden, scott, lewis))
  val poloniaResult: Result = Result(7, homeTeam = poloniaTeam, awayTeam = "Polonia Telford FC", goalsFor = 4, goalsAgainst = 1, scorers = List(rhys, conlon, josh, scott), assists = List(joey, layton, danSmout), motm = callum, date = LocalDate.of(2022, 7, 31))

  val wrockersTeampre: Team = Team(List(malin, jake, ross, ste, danGrimbo, lukeNixon, jobbo, adNixon, joey, josh, callum, scott, charlie, ben))
  val wrockersResultpre: Result = Result(8, homeTeam = wrockersTeampre, awayTeam = "Wrockwardine Wood FC", goalsFor = 6, goalsAgainst = 1, scorers = List(joey, jake, ross, callum), assists = List(josh, josh, josh, jake, jake, jobbo), motm = jake, date = LocalDate.of(2022, 8, 4))

  val railwayTeam: Team = Team(List(callum, danSmout, ste, adNixon, lukeNixon, jobbo, layton, conlon, joey, rhys, josh, charlie, scott))
  val railwayResult: Result = Result(9, homeTeam = railwayTeam, awayTeam = "Railway United", goalsFor = 3, goalsAgainst = 3, scorers = List(joey, joey, ste), assists = List(josh, rhys, rhys), motm = adNixon, date = LocalDate.of(2022, 8, 7))

  val impactTeam: Team = Team(List(malin, ross, ste, danGrimbo, bob, luke, josh, layton, joey, rhys, kaleem, scott, lukeNixon, callum))
  val impactResult: Result = Result(10, homeTeam = impactTeam, awayTeam = "Impact FC", goalsFor = 3, goalsAgainst = 2, scorers = List(rhys, ross, kaleem), assists = List(joey, ross, lukeNixon), motm = lukeNixon, date = LocalDate.of(2022, 8, 21))

  // Extra player was some bully
  val madeleyTeam: Team = Team(List(callum, luke, lee, ste, adNixon, lukeNixon, layton, jobbo, joey, josh, kaleem, scott, ben, rhys, cameron))
  val madeleyResult: Result = Result(11, homeTeam = madeleyTeam, awayTeam = "Madeley CC FC", goalsFor = 6, goalsAgainst = 0, scorers = List(joey, joey, josh, scott, lee), assists = List(joey, josh, josh, lukeNixon, layton), motm = ste, date = LocalDate.of(2022, 8, 31))

  //  ******** RESULTS ********

  val preseasonResults: List[Result] = List(shifnalResult, minersResult, unicornResultpre, wrockersResultpre, wicketsResult, telfordResult, poloniaResult, wrockersResultpre2, railwayResult, impactResult, madeleyResult).reverse


  //  ******** 2022/23 TEAMS ********

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

  val unicornTeam:Team = Team(List(malin, luke, ste, adNixon, lukeNixon, layton, jobbo, joey, josh, rhys, cameron, jake))
  val unicornResult: Result = Result(1, homeTeam = unicornTeam, awayTeam = unicorn, goalsFor = 6, goalsAgainst = 1, scorers = List(joey, rhys, rhys, rhys, josh, jobbo),
    assists = List(jobbo, joey, joey, joey, cameron), motm = rhys, date = LocalDate.of(2022, 9, 4), yellowCards = List(josh))

  val wrockersTeam: Team = Team(List(malin, ross, ste, lukeNixon, danGrimbo, jake, jobbo, layton, joey, rhys, josh, lee, cameron, adNixon, conlon))
  val wrockersResult: Result = Result(2, homeTeam = wrockersTeam, awayTeam = wrockers, goalsFor = 2, goalsAgainst = 2, scorers = List(ste, kaleem),
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

  val wickettsTeam2: Team = Team(List(malin, jake, ste, layton, danGrimbo, harvey, jobbo, dave, josh, joey, lee, rhys))
  val wickettsResult2: Result = Result(24, homeTeam = wickettsTeam2, awayTeam = wickets, goalsFor = 3, goalsAgainst = 8, scorers = List(joey, rhys),
    assists = List(lee, danGrimbo, jake), yellowCards = List(josh, danGrimbo), motm = rhys, date = LocalDate.of(2023, 4, 30))

  val wickettsTeam3: Team = Team(List(malin, jake, ross, layton, harvey, josh, jobbo, ste, rhys, joey, jj, ash, mattMaiden, danGrimbo))
  val wickettsResult3: Result = Result(25, homeTeam = wickettsTeam3, awayTeam = wickets, goalsFor = 5, goalsAgainst = 4, scorers = List(ste, jj, ross, jobbo, ste, rhys, ash, jake),
    assists = List(joey, joey, jake), yellowCards = List(josh), motm = layton, date = LocalDate.of(2023, 5, 7))

//  Other player was Nathan in goal
  val wenlockTeam: Team = Team(List(harvey, layton, danGrimbo, jake, adNixon, josh, jobbo, dave, lee, luke, ash, conlon))
  val wenlockResult: Result = Result(25, homeTeam = wenlockTeam, awayTeam = wenlock, goalsFor = 8, goalsAgainst = 0, scorers = List(joey, lee, lee, dave, dave, dave, dave, joey),
    assists = List(jake, joey, joey, lee, lee, josh, lee, dave), motm = dave, date = LocalDate.of(2023, 5, 14))


  //  ******** RESULTS ********

  val fullResults: List[Result] = List(unicornResult, wrockersResult, roseResult, ellesmereResult, bailsResult, nationsResult,
    dunCowResult, cottageResult, queensResult, wrockersResult2, phezResult, queensResult2, bailsResult2, wrekinResult,
    wickettsResult, crownResult, cottageResult2, crownResult2, phezResult2, cottageResult3, unicornResult2, wrekinResult2,
    dunCowResult2, wickettsResult2, wickettsResult3, wenlockResult).reverse ++ preseasonResults ++ fullResults21 ++ fullResultspre21

//  ******** FIXTURES *********

  val fullFixtures: List[Fixture] = List()

}
