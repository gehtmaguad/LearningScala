package at.hoeselm.exercises8.exercise3

class DirectoryListing(val path: String, f: String => Boolean) {

  lazy val files = new java.io.File(path)
  
  lazy val filter = new java.io.FilenameFilter {
    override def accept(dir: java.io.File, name: String): Boolean = f(name)
  }

  def list: List[String] = files.list(filter).toList

}