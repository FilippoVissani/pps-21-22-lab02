package Exercises

object Es5 extends App :

  // EXERCISE 5
  def compose(f: Int => Int, g: Int => Int): Int => Int =
    x => f(g(x))
  
  def composeGeneric[A, B, C](f: B => C, g: A => B): A => C =
    x => f(g(x))
