package at.hoeselm.exercises7

object Exercise3 {

  def main(args: List[String]): Unit = {

    get_all_not_hidden_files_in_dir(".").groupBy { x => x.take(1) }.foreach(x => println(x._1, x._2.size))

  }

  def get_all_not_hidden_files_in_dir(path: String): List[String] = {
    new java.io.File(path).listFiles.toList.map { x => x.toString().replace("./", "") }.filter { x => !x.startsWith(".") }
  }
}