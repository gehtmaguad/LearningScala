package at.hoeselm.exercises3

object Exercise2 {

  def main(args: List[String]): Unit = {

    var amount = args(0).toInt

    // if...else block
    if (amount > 0) { println("greater than zero") }
    else if (amount == 0) { println("equal zero") }
    else { println("less than zero") }

    // match expression
    amount match {
      case amount if amount > 0  => println("greater than zero")
      case amount if amount == 0 => println("equal zero")
      case amount if amount < 0  => println("less than zero")
    }

  }

}