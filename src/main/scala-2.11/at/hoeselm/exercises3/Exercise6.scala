package at.hoeselm.exercises3

object Exercise6 {

  def main(args: List[String]): Unit = {

    for (x <- 1 to 100) { x match { case x if x % 3 == 0 && x % 5 == 0 => println("typesafe"); case x if x % 3 == 0 => println("type"); case x if x % 5 == 0 => println("safe"); case x => println(x) } }

  }

}