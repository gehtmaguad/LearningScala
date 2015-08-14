package at.hoeselm.exercises5

object Exercise1 {

  def main(args: List[String]): Unit = {

    println(three_sized_tuple((2, 5, 8), return_higher))
    println(three_sized_tuple((5, 8, 2), return_higher))
    println(three_sized_tuple((8, 2, 5), return_higher))

  }

  val return_higher = (a: Int, b: Int) => {

    if (a > b) a else b

  }

  def three_sized_tuple(t: (Int, Int, Int), f: (Int, Int) => Int): Int = {

    f(t._1, f(t._2, t._3))

  }

}