package at.hoeselm.exercises6

// TODO: Needs revise

object Exercise3 {

  def main(args: List[String]): Unit = {

    println(first_take(List('a', 't', 'o', 's'), 2))
    println(first_loop(List('a', 't', 'o', 's'), 2))
    println(first_recursive(List('a', 't', 'o', 's'), 2))

  }
  
  def first_take[A](items: List[A], count: Int): List[A] = {
    
    items.take(3)
    
  }
  
  def first_fold_left[A](items: List[A], count: Int): List[A] = {
    
    items.foldLeft[List[A]](Nil)({
      (a: List[A], i: A) => if (a.size >= count) a else i :: a})
    
  }

  def first_loop[A](items: List[A], count: Int): List[A] = {

    val result = for (i <- 0 to count) yield items(i)
    result.toList

  }

  def first_recursive[A](items: List[A], count: Int): List[A] = {

    if (count > 0) items.head :: first_recursive(items.tail, count - 1)
    else Nil

  }

}