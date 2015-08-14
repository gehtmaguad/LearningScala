package at.hoeselm.exercises4

object Exercise8 {

  def main(args: List[String]): Unit = {

    val result: (Int, String, Boolean, String, Double, String) = three_to_six_with_string_values((1, true, 4.23))
    println(result)

  }

  def three_to_six_with_string_values[A, B, C](a: (A, B, C)): (A, String, B, String, C, String) = {

    (a._1, a._1.toString(), a._2, a._2.toString(), a._3, a._3.toString())

  }

}