package at.hoeselm.exercises7

import scala.util.Try
import scala.util.Failure
import scala.util.Success

object Exercise4 {

  def main(args: List[String]): Unit = {

    println(product("5.4", "6.6"))
    println(product("test", "6.5"))

  }

  def getDouble(a: String): Try[Double] = {

    Try(a.toDouble)

  }

  def product(a: String, b: String): Option[Double] = {

    val d1 = getDouble(a) match {
      case Success(a)  => Some(a)
      case Failure(ex) => None
    }

    val d2 = getDouble(b) match {
      case Success(b)  => Some(b)
      case Failure(ex) => None
    }

    if (d1 != None & d2 != None) {
      Some(d1.get * d2.get)
    } else {
      None
    }

  }

}