package Exercises

object Es3 extends App :

  // EXERCISE 3
  def genericNeg[A](f: A => Boolean): A => Boolean =
    i => !f(i)
