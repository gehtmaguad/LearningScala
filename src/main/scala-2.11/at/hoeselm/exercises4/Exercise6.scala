package at.hoeselm.exercises4

object Exercise6 {

  def main(args: List[String]): Unit = {

    println(compare_tuples((5, 5), (2, 8)))

  }

  def compare_tuples(a: (Int, Int), b: (Int, Int)): (Int, Int) = {

    (a._1 - b._1, a._2 - b._2)

  }

}