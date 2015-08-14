package at.hoeselm.exercises4

object Exercise5 {

  def main(args: List[String]): Unit = {

    println("HELLO")
    println(raise_with_pow(10, 4))
    println(raise_with_own_impl(10, 4))

  }

  def raise_with_pow(a: Double, b: Int): Double = {

    math.pow(a, b)

  }

  def raise_with_own_impl(a: Double, b: Int): Double = {

    var sum = 1

    @annotation.tailrec
    def multiply(a: Double, b: Int, sum: Double): Double = {

      if (b == 0) sum
      else multiply(a, b - 1, sum * a)

    }

    multiply(a, b, sum)

  }

}