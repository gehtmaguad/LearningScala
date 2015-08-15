package at.hoeselm.exercises6

// TODO: Add FoldLeft and ForLoop

object Exercise3 {

  def main(args: List[String]): Unit = {
    println(first(List('a', 't', 'o', 's'), 2))
  }

  def first[A](items: List[A], count: Int): List[A] = {

    if (count > 0) items.head :: first(items.tail, count - 1)
    else Nil

  }

}