package at.hoeselm.exercises6

object Exercise7 {

  def main(args: List[String]): Unit = {

    val url = "http://api.openweathermap.org/data/2.5/forecast?mode=xml&lat=48&lon=16"
    val l: List[String] = io.Source.fromURL(url).getLines.toList
    
    // Print first ten lines
    println(l.take(10))

    // TODO: b-h 
       
    
  }

}