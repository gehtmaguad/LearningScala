package at.hoeselm.exercises7

object Exercise6 {

  def main(args: List[String]): Unit = {

    getGithubRssEntries("scala", "scala", "2.11.x").foreach { x => println(findProperties(x).getOrElse("not available")) }

  }

  def getGithubRssEntries(username: String, reponame: String, branchname: String): List[String] = {
    //val u = s"https://github.com/$username/$reponame/commits/$branchname.atom"
    //val s = io.Source.fromURL(u)
    //val text = s.getLines.map(_.trim).mkString("")
    val text = scala.io.Source.fromFile("/home/ikthsm/githubrss.xml").getLines.mkString
    val entries = text.split("</?entry>").toList.tail
    val filtered_entries = entries.filter { !_.isEmpty() }
    filtered_entries
  }

  def findProperties(entry: String): Option[Map[String,String]] = {

    val pattern = ".*<id>(.*)</id>.*<title>(.*)</title>.*<author><name>(.*)</name>.*".r
    val matched = pattern.findFirstMatchIn(entry)
    matched match {
      case Some(m) => Some(Map("id" -> m.group(1), "title" -> m.group(2), "author" -> m.group(3)))
      case None => None
    }

  }

}