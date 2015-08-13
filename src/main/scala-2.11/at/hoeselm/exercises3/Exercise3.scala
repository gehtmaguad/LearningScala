package at.hoeselm.exercises3

object Exercise3 {

  def main(args: List[String]): Unit = {

    val color = args(0)
    val result = color match {
      case "cyan"    => println("#00FFFF")
      case "magenta" => println("#00FF00")
      case "yellow"  => println("#FFFF00")
      case _         => println(color + " not defined")
    }

  }

}