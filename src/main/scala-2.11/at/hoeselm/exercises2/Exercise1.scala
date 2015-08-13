package at.hoeselm.exercises2

object Exercise1 {

  def main(args: List[String]): Unit = {

    val celsius = args(0).toInt
    println("Type of celsius is: " + celsius.getClass())

    val temp = celsius * (9.0 / 5)
    println("Type after multiplication is: " + temp.getClass())

    val fahrenheit = temp + 32
    println("Type of fahrenheit is: " + fahrenheit.getClass())

    println(celsius + " celsius equals " + fahrenheit + " fahrenheit")
  }

}