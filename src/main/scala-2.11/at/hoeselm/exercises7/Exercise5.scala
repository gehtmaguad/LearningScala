package at.hoeselm.exercises7

import scala.util.Try
import scala.util.Success
import scala.util.Failure

object Exercise5 {

  def main(args: List[String]): Unit = {

    println(getProperty("java.home"))
    println(getProperty("user.timezone"))
    println(getProperty(""))
    println(getProperty("blah"))

  }

  def getProperty(a: String): Option[String] = {

    Try(System.getProperty(a)) match {
      case Success(x)  => Some(x)
      case Failure(ex) => None
    }

  }

}