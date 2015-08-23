package at.hoeselm.exercises8.exercise3

object Exercise3 {

  def main(args: List[String]): Unit = {

    def filterTextfiles(name: String): Boolean = {
      !name.endsWith(".txt")
    }

    println(new DirectoryListing(".", filterTextfiles).list)

  }

}