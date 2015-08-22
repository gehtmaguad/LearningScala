package at.hoeselm.exercises8.exercise2

class LinkedList[A](instances:A*) {
  
  def foreachMethod[A,B](instances:List[A],transformed:List[B],f: A => B):List[B] = {
    
    instances match {
      case Nil => transformed
      case x => {
        f(x.head) :: transformed
        foreachMethod(x.tail,transformed,f)
      }
    }
    
  }
    
}