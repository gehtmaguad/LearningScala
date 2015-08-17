package at.hoeselm.exercises6

object Exercise7 {

  def main(args: List[String]): Unit = {

    val url = "http://api.openweathermap.org/data/2.5/forecast?mode=xml&lat=48&lon=16"
    //val data: String = io.Source.fromURL(url).getLines.mkString
    val data = scala.io.Source.fromFile("/home/ikthsm/xmltest.xml").getLines.mkString  

    // Print data
    //println(data)

    //Print City
    val citypattern = """<location><name>(.*)</name>.*<country>(.*)</country>.*</location>""".r
    citypattern.findFirstMatchIn(data) match {
      case Some(m) => println("City: " + m.group(1) + " ,Country: " + m.group(2))
      case None    => println("no City")
    }
    
    // Print Count of Times
    println("There are " + data.split("><").filter(_ contains "time from=").size + " time elements")
    
    // Print all symbol properties
    val symbolpattern = """number=.([A-Za-z0-9 ]*). name=.([A-Za-z0-9 ]*). var=.([A-Za-z0-9 ]*).""".r
    symbolpattern.findAllMatchIn(data) foreach { m => println("number=" + m.group(1) + ", name=" + m.group(2) + ", var=" + m.group(3)) }
    
    // Print only the name symbol for the last 12 hours
    symbolpattern.findAllMatchIn(data).toList.takeRight(4).foreach{ m => println(m.group(2)) }
    // TODO: c-h 
    
    // Print list with all names without duplicates
    println(symbolpattern.findAllMatchIn(data).toList.map { _ group 2 }.distinct)

  }

}