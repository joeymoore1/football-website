package models

case class Player(index: Int, name: Name, position: String)

case class Name(firstName: String, lastName: String)