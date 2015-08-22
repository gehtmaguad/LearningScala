package at.hoeselm.exercises8.exercise1

class Game (
    val make:String, 
    val name:String, 
    val consoles: List[Console]){
  
  def isSupported(console:Console):Boolean = {
    consoles.contains(console)
  }
  
}