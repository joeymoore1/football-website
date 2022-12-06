package models

import java.time.LocalDate

case class Result(index: Int,
                  homeTeam:Team,
                  awayTeam: String,
                  goalsFor: Int,
                  goalsAgainst: Int,
                  scorers: List[Player] = Nil,
                  assists: List[Player] = Nil,
                  motm: Player = null,
                  date:LocalDate,
                  yellowCards: List[Player] = Nil,
                  redCards: List[Player] = Nil
                 )