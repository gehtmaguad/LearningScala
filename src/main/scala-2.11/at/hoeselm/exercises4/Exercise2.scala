package at.hoeselm.exercises4

object Exercise2 {

  def main(args: List[String]): Unit = {

    val radius = args(0)
    println(Function2.calc_circe_area(radius).toString())

  }

}

object Function2 {

  def calc_circe_area(radius: String): Double = {
    radius match {
      case "" => 0.0
      case _  => 3.14159 * (radius.toDouble * radius.toDouble)
    }

  }

}