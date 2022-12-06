package models

case class playerStats(player: Player,
                       goals: Int,
                       assists: Int,
                       appearances: Int,
                       motms: Int,
                       yellowCards: Int,
                       redCards: Int
                      )
