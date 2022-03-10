package Exercises

object Es3 extends App :

  // EXERCISE 3
  def neg[A](f: A => Boolean): A => Boolean =
    i => !f(i)

  val empty: String => Boolean = _ == ""
  val notEmpty = neg(empty)
  println(notEmpty("foo"))
  println(notEmpty(""))
  println(notEmpty("foo") && !notEmpty(""))
