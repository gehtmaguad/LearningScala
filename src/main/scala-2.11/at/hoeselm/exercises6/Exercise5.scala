package at.hoeselm.exercises6

object Exercise5 {

  def main(args: List[String]): Unit = {

    println(reverse_list(List("a", "bb", "ccc", "dd", "e")))

  }

  def reverse_list[A](orig: List[A]): List[A] = {

    var reversed: List[A] = Nil

    def reverse(a: List[A], b: List[A]): List[A] = {

      a match {
        case Nil => b
        case _   => reverse(a.tail, a.head :: b)
      }

    }

    reverse(orig, reversed)

  }
}