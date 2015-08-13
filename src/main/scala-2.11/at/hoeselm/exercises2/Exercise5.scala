package at.hoeselm.exercises2

object Exercise5 {

  def main(args: List[String]): Unit = {

    val number_as_int = 128

    val number_as_char = number_as_int.toChar
    println("number as char: " + number_as_char)

    val number_as_string = number_as_char.toString()
    println("number as string: " + number_as_string)

    // convert only the first char from the string
    val number_as_double = number_as_string(0).toDouble
    println("number as double: " + number_as_double)

    val number_as_int_again = number_as_double.toInt
    println("number as int: " + number_as_int_again)

  }
}