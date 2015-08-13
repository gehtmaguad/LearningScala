package at.hoeselm.exercises3

object Exercise4 {

  def main(args: List[String]): Unit = {

    for (x <- 1 to 100) {
      print(x + ", ")
      if (x % 5 == 0) {
        println()
      }
    }

  }

}