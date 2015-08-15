package at.hoeselm.exercises6

object Exercise1 {

  def main(args: List[String]): Unit = {

    // For Loop
    for (i <- 1L to 20L if (!(i % 2 == 0))) yield i

    // Filter Operation
    (1L to 20L) filter (_ % 2 != 0)

    // Map Operation
    (1L to 10L) map (_ * 2 - 1)

  }

}