package at.hoeselm.exercises5

object Exercise6 {

  def main(args: List[String]): Unit = {

    println(conditional[Int](2, { (a: Int) => if (a > 21) a / 2 else a * 2 }, _.!=(42)))
    println(conditional[Int](22, { (a: Int) => if (a > 21) a / 2 else a * 2 }, _.!=(42)))
    println(conditional[Int](42, { (a: Int) => if (a > 21) a else a * 2 }, _.!=(42)))

  }

  def conditional[A](x: A, f: A => A, p: A => Boolean): A = {
    if (p(x)) f(x) else x
  }

}