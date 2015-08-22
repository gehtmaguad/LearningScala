package at.hoeselm.exercises8.exercise2

object Exercise2 {
  
    def main(args: List[String]): Unit = {
      
      val linkedlist = new LinkedList()
      linkedlist.foreachMethod( List("test","test2","test4"), Nil,{ x:String => println(x) })
      
    }
    
}