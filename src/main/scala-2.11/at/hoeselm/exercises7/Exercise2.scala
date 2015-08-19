package at.hoeselm.exercises7

object Exercise2 {

  def main(args: List[String]): Unit = {
    
    get_all_not_hidden_files_in_dir(".").foreach { x => print( x + ";" ) }

  }

  def get_all_not_hidden_files_in_dir(path: String): List[String] = {
    new java.io.File(path).listFiles.toList.map { x => x.toString().replace("./", "") }.filter { x => !x.startsWith(".") }
  }
}