package at.hoeselm.exercises7

object Exercise1 {

  def main(args: List[String]): Unit = {

    // a
    println(fibonacci_buffer(10))
    //Note: A Builder is not a good option here, because it only allows to append elements

    // b
    println(extend_fib_list_mutable(fibonacci_buffer(10), 10))
    println(extend_fib_list_immutable(fibonacci_buffer(10), 10))

    // c
    println(create_fib_stream(1, 1).take(10).toList)

    // d
    println(return_next_fib(10))

  }

  def fibonacci_buffer(count: Int): List[Int] = {

    val result = collection.mutable.Buffer(1)
    result += 1
    for (x <- 2 to count - 1) {
      result += (result(x - 1) + result(x - 2))
    }

    result.toList

  }

  def extend_fib_list_mutable(fiblist: List[Int], count: Int): List[Int] = {

    val result = fiblist.toBuffer
    for (x <- 1 to count) {
      result += (result.takeRight(2).reduce(_ + _))
    }

    result.toList
  }

  def extend_fib_list_immutable(fiblist: List[Int], count: Int): List[Int] = {

    if (count == 0) {
      fiblist
    } else {
      extend_fib_list_immutable(fiblist :+ fiblist.takeRight(2).reduce(_ + _), count - 1)
    }

  }

  def create_fib_stream(a: Int, b: Int): Stream[Int] = {

    Stream.cons(a, create_fib_stream(b, a + b))

  }

  def return_next_fib(a: Int): Option[Int] = {

    if (fibonacci_buffer(a + 1).takeRight(1).head.isValidInt) Option(fibonacci_buffer(a + 1).takeRight(1).head)
    else None

  }

}