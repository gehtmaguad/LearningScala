package at.hoeselm.exercises5

object Exercise5 {

  def main(args: List[String]): Unit = {

    def square(m: Double) = m * m
    val sq1: (Double) => Double = square
    val sq2 = square _

    println(square(4))
    println(sq1(4))
    println(sq2(4))

  }

}