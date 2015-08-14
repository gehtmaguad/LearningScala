package at.hoeselm.exercises4

object Exercise3 {

  def main(args: List[String]): Unit = {

    recursive(5)

  }

  @annotation.tailrec
  def recursive(number: Int): Unit = {
    if (number <= 50) {
      if (number % 5 == 0) { println(number) }
      recursive(number + 1)
    }
  }

}