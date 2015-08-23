package at.hoeselm.exercises8.exercise4

object Exercise4 {

  def main(args: List[String]): Unit = {

    new Mozart(100).play(Seq(60, 62, 64, 65, 67, 69, 71, 72))
    new Mozart(100).play((30 to 70 by 5) ++ (70 to 30 by -5))

  }

}