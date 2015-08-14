package at.hoeselm.exercises4

object Exercise1 {

  def main(args: List[String]): Unit = {

    val radius = args(0).toInt
    println(Function1.calc_circe_area(radius).toString())

  }

}

object Function1 {

  def calc_circe_area(radius: Int): Double = { 3.14159 * (radius * radius) }

}