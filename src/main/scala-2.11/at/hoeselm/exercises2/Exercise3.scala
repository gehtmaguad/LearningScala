package at.hoeselm.exercises2

object Exercise3 {

  def main(args: List[String]): Unit = {

    val input = 2.7255

    // print text "You owe $2.73"
    println(f"You owe me $$$input%.2f")

    // this prints "You owe $2.72 (does not round)"
    println(f"You owe me $$$input%.4s")

  }

}