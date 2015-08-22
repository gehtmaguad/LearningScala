package at.hoeselm.exercises7

import scala.concurrent.Future
import concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.collection.mutable.ListBuffer

object Exercise6 {

  def main(args: List[String]): Unit = {
    
    // Exercise6
    getGithubRssEntries("scala", "scala", "2.11.x").foreach { x => println(findProperties(x).getOrElse("not available")) }
    
    // Exercise6a
    val repo6a = ("scala", "scala", "2.11.x")
    val data6a = getGithubRssEntriesTuple(repo6a)
    data6a.foreach { x => println(findProperties(x).getOrElse("not available")) }
    
    // Exercise6b
    val repos6b = List(("scala", "scala", "2.11.x"),("hoeselm", "kicklog", "master"),("scala", "scala", "2.11.x"))
    val data6b = getGithubRssEntriesTupleList(repos6b)
    data6b.foreach { x => println(findProperties(x).getOrElse("not available")) }
    
    // Exercise6c
    val repos6c = List(("scala", "scala", "2.11.x"),("hoeselm", "kicklog", "master"),("scala", "scala", "2.11.x"))
    val data6c = concurrent.Await.result(getGithubRssEntriesTupleListAsync(repos6c), Duration(5, SECONDS))
    data6c.foreach { x => println(findProperties(x).getOrElse("not available")) }
    
  }

  // Exercise6
  def getGithubRssEntries(username: String, reponame: String, branchname: String): List[String] = {
    //val u = s"https://github.com/$username/$reponame/commits/$branchname.atom"
    //val s = io.Source.fromURL(u)
    //val text = s.getLines.map(_.trim).mkString("")
    val text = scala.io.Source.fromFile("/home/ikthsm/githubrss.xml").getLines.mkString
    val entries = text.split("</?entry>").toList.tail
    val filtered_entries = entries.filter { !_.isEmpty() }
    filtered_entries
  }

  def findProperties(entry: String): Option[Map[String, String]] = {

    val pattern = ".*<title>(.*)</title>.*<updated>(.*)</updated>.*<author><name>(.*)</name>.*".r
    val matched = pattern.findFirstMatchIn(entry)
    matched match {
      case Some(m) => Some(Map("title" -> m.group(1), "updated" -> m.group(2), "author" -> m.group(3)))
      case None    => None
    }

  }

  // Exercise6a
  def getGithubRssEntriesTuple(identifier: (String, String, String)): List[String] = {

    getGithubRssEntries(identifier._1, identifier._2, identifier._3)

  }

  // Exercise6b
  def getGithubRssEntriesTupleList(identifiers: List[(String, String, String)]): List[String] = {

    identifiers.flatMap(getGithubRssEntriesTuple)

  }

  // Exercise6c
  def getGithubRssEntriesTupleListAsync(identifiers: List[(String, String, String)]) = Future {

    identifiers.flatMap(getGithubRssEntriesTuple)

  }
  
  
}