package at.hoeselm.exercises8.exercise1

import java.util.Date

object Exercise1 {

  def main(args: List[String]): Unit = {

    val date: Date = new Date()

    val playstation4 = new Console("Sony", "PlayStation4", date, Some("5g"), List("Full HD"), (1080, 1920))
    val xbox1 = new Console("Microsoft", "XBox1", date, Some("2g"), List("Full HD"), (1080, 1920))
    val pcSt5000 = new Console("Alienware", "ST5000", date, Some("2g"), List("Ultra HD"), (2160, 3840))
    val nintendoWii = new Console("Nintendo", "Wii", date, None, List("FHD"), (720, 1280))

    val g1 = new Game("Rockstar", "GTA5", List(playstation4, xbox1))
    val g2 = new Game("Konami", "Metal Gear Solid 5", List(nintendoWii))
    val g3 = new Game("Warner Brothers Interactive", "Batman: Arkham Knight", List(playstation4, xbox1, pcSt5000))
    val g4 = new Game("Ubisoft", "Assassin’s Creed Victory", List(playstation4, xbox1, pcSt5000, nintendoWii))
    val g5 = new Game("Ubisoft", "Assassin’s Creed Rogue", List(pcSt5000))

    println("Is Game5 supported by PlayStsation? : " + g5.isSupported(playstation4))
    println("Is Game5 supported by PC? : " + g5.isSupported(pcSt5000))

    def listGamesFromConsole(console: Console, games: List[Game]): List[Game] = {
      games.filter { x => x.isSupported(console) }
    }

    println("playstation4 games: ")
    listGamesFromConsole(playstation4, List(g1, g2, g3, g4, g5)).foreach { x => print(s"${x.name} by ${x.make}; ") }
    println()

    println("xbox1 games: ")
    listGamesFromConsole(xbox1, List(g1, g2, g3, g4, g5)).foreach { x => print(s"${x.name} by ${x.make}; ") }
    println()

    println("pcSt5000 games: ")
    listGamesFromConsole(playstation4, List(g1, g2, g3, g4, g5)).foreach { x => print(s"${x.name} by ${x.make}; ") }
    println()

    println("nintendoWii games: ")
    listGamesFromConsole(playstation4, List(g1, g2, g3, g4, g5)).foreach { x => print(s"${x.name} by ${x.make}; ") }
    println()

    def sortGameList(games: List[Game]): List[Game] = {
      games.sortBy { x => (x.make, x.name) }
    }

    println("Games Sorted By Maker and by Name")
    sortGameList(List(g1, g2, g3, g4, g5)).foreach { x => print(s"${x.name} by ${x.make}; ") }
  }

}