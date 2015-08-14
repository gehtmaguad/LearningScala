package at.hoeselm.exercises5

object Exercise3 {

  def main(args: List[String]): Unit = {

    println(higher_order_multiply(3)(3))

  }

  def higher_order_multiply(a: Int) = {

    (b: Int) => a * b

  }

}