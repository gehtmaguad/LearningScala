package at.hoeselm.exercises5

object Exercise2 {

  def main(args: List[String]): Unit = {

    println(eval(util.Random.nextInt(), util.Random.nextInt(), (a: Int, b: Int) => if (a > b) a else b))
    println(eval(util.Random.nextInt(), util.Random.nextInt(), (a: Int, b: Int) => if (a < b) a else b))
    println(eval(util.Random.nextInt(), util.Random.nextInt(), (a: Int, b: Int) => b))

  }

  def eval(a: Int, b: Int, f: (Int, Int) => Int) = {

    f(a, b)

  }

}