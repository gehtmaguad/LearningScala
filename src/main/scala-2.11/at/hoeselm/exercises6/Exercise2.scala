package at.hoeselm.exercises6

object Exercise2 {

  def main(args: List[String]): Unit = {

    // For Loop
    println((for (i <- 1L to 20L if (!(i % 2 == 0))) yield factors(i)).flatten)
    
    // Map
    println(((1L to 10L) map (_ * 2L - 1L) map (factors(_))).flatten)
  }

  def factors(a: Long): List[Long] = {

    (2L to (a - 1L)).toList filter (a % _ == 0)

  }

}