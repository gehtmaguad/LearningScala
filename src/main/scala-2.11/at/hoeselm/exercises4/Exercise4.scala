package at.hoeselm.exercises4

object Exercise4 {

  def main(args: List[String]): Unit = {

    convert_to_human_readable(123456789000L)

  }

  def convert_to_human_readable(millis: Long): Unit = {

    val seconds = millis / 1000 % 60
    val minutes = millis / 1000 % (60 * 60) / 60
    val hours = millis / 1000 % (60 * 60 * 24) / 60 / 60
    val days = millis / 1000 / 60 / 60 / 24
    println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + "seconds ")

  }

}