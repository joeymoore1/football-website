package service

import javax.inject.Inject
import models.{Player, Team}

class ProfileService @Inject()() {

  val joey: Player = Player(1, "Joey Moore", "Striker")
  val chad: Player = Player(2, "Chad Bailey", "Keeper")
  val matt: Player = Player(3, "Matt Maiden", "Defender")
  val ben: Player = Player(4, "Ben Keable", "Defender")
  val ian: Player = Player(5, "Ian Harkins", "Midfielder")
  val rhys: Player = Player(6, "Rhys Clarkson", "Striker")
  val adam: Player = Player(7, "Adam Fox", "Midfielder")
  val dave: Player = Player(8, "David Boden", "Defender")
  val curt: Player = Player(9, "Curtis Cooper", "Midfielder")
  val zoltan: Player = Player(10, "Zoltan KanizsaI-Nagy", "Striker")
  val callum: Player = Player(11,"Callum Stainer", "Midfielder")
  val kieran: Player = Player(12, "Kieran Whyman", "Defender")
  val ryan: Player = Player(13, "Ryan Jones", "Midfielder")

  val keepers: List[Player] = List(chad)
  val defenders: List[Player] = List(matt, ben, dave, kieran)
  val midfielders: List[Player] = List(ryan, ian, adam, curt, callum)
  val strikers: List[Player] = List(joey,rhys, zoltan)

  def newTeam: Team = Team(keepers, defenders, midfielders, strikers)

  def getPlayerById(id: Int): Player = {
    val filteredKeepers: Seq[Player] = newTeam.keepers.filter(_.index == id)
    val filteredDefenders: Seq[Player] = newTeam.defenders.filter(_.index == id)
    val filteredMidfielders: Seq[Player] = newTeam.midfielders.filter(_.index == id)
    val filteredStrikers: Seq[Player] = newTeam.strikers.filter(_.index == id)

    if (filteredKeepers.nonEmpty) filteredKeepers.head
    else if (filteredDefenders.nonEmpty) filteredDefenders.head
    else if (filteredMidfielders.nonEmpty) filteredMidfielders.head
    else filteredStrikers.head
  }

}
