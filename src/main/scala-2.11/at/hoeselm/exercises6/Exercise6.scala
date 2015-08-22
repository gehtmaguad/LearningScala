package at.hoeselm.exercises6

object Exercise6 {

  def main(args: List[String]): Unit = {

    println(palindromes_detector(List("asdf", "qwer", "racecar", "d", "lagerregal")))

  }

  def palindromes_detector(l: List[String]): (List[String], List[String]) = {

    var r1: List[String] = List[String]()
    var r2: List[String] = List[String]()

    def reverse(a: String, b: String): String = {

      a match {
        case "" => b
        case _  => reverse(a.tail, b = a.head + b)
      }

    }

    l.foreach(x => if (x == reverse(x, "")) r1 = x :: r1 else r2 = x :: r2)

    (r1, r2)

  }

}