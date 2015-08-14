package at.hoeselm.exercises4

object Exercise7 {

  def main(args: List[String]): Unit = {

    println(compare_tuples(("TEST", 5)))
    println(compare_tuples((4, "TEST")))
    println(compare_tuples(("TEST1", "TEST2")))
    println(compare_tuples((4, 10)))
    println(compare_tuples((10, 4)))

  }

  def compare_tuples[A, B](a: (A, B)): (Any, Any) = {

    if (a._1.isInstanceOf[Int]) a
    else if (a._2.isInstanceOf[Int]) (a._2, a._1)
    else a

  }

}