package at.hoeselm.exercises5

object Exercise7 {

  def main(args: List[String]): Unit = {

    for (i <- 1 until 100) {
      (conditional_old[Int](i, x => { print("type"); 0 }, _ % 3 == 0))
      (conditional_old[Int](i, x => { print("safe"); 0 }, _ % 5 == 0))
      (conditional_old[Int](i, x => { print(x); 0 }, { (a: Int) => a % 3 != 0 && a % 5 != 0 }))
      println()
    }

    for (i <- 1 until 100) {
      print((conditional_new[Int, String](i, x => "type", _ % 3 == 0)))
      print((conditional_new[Int, String](i, x => "safe", _ % 5 == 0)))
      print((conditional_new[Int, String](i, x => x.toString(), { (a: Int) => a % 3 != 0 && a % 5 != 0 })))
      println()
    }

  }

  def conditional_old[A](x: A, f: A => A, p: A => Boolean): A = {
    if (p(x)) f(x) else x
  }

  def conditional_new[A, B](x: A, f: A => B, p: A => Boolean): B = {
    if (p(x)) f(x) else "".asInstanceOf[B]
  }

}