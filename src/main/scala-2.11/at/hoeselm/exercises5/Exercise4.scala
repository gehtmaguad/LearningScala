package at.hoeselm.exercises5

object Exercise4 {

  def main(args: List[String]): Unit = {

    fzero[Int](5) { a => println(a * a) }
    fzero(5) { a => println(a * a) }

    fzero[Boolean](true) { a => println(!a) }
    fzero(true) { a => println(!a) }

    fzero[String]("Lagerregal") { a => println(a.reverse) }
    fzero("Lagerregal") { a => println(a.reverse) }

  }

  def fzero[A](x: A)(f: A => Unit): A = { f(x); x }

}