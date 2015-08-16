package at.hoeselm.exercises6

object Exercise4 {

  def main(args: List[String]): Unit = {

    println(longest_fold(List("a", "bb", "ccc", "dd", "e")))
    println(longest_reduce(List("a", "bb", "ccc", "dd", "e")))
    println(longest_expression(List("a", "bb", "ccc", "dd", "e"), (a, b) => if (a.size > b.size) a else b))
    println(longest_generic(List("a", "bb", "ccc", "dd", "e"), (a: String, b: String) => if (a.size > b.size) a else b))

  }

  def longest_fold(l: List[String]): String = {

    l.foldLeft("")({ (a: String, b: String) => if (a.size > b.size) a else b })

  }

  def longest_reduce(l: List[String]): String = {

    l.reduce({ (a: String, b: String) => if (a.size > b.size) a else b })

  }

  def longest_expression(l: List[String], f: (String, String) => String): String = {

    l.reduce({ (a: String, b: String) => f(a, b) })

  }

  def longest_generic[A](l: List[A], f: (A, A) => A): A = {

    l.reduce({ (a: A, b: A) => f(a, b) })

  }

}