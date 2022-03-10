package Exercises

object Es6 extends App :

  // EXERCISE 6
  def fib(n: Int): Int =
    @annotation.tailrec
    def _fib(n: Int, a: Int, b: Int): Int = n match
      case 0 => a
      case 1 => b
      case _ => _fib(n - 1, b, a + b)

    _fib(n, 0, 1)

  println((fib(0), fib(1), fib(2), fib(3), fib(4)))