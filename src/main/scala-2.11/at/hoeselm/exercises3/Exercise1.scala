package at.hoeselm.exercises3

object Exercise1 {

  def main(args: List[String]): Unit = {

    var name = args(0)

    val status = name match {
      case name if name != "" => name
      case name               => "n/a"
    }

    println(status)
  }

}