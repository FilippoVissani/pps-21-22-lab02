package Exercises

object Es5 extends App :

  // EXERCISE 5
  def compose(f: Int => Int, g: Int => Int): Int => Int =
    x => f(g(x))
  
  def composeGeneric[A, B, C](f: B => C, g: A => B): A => C =
    x => f(g(x))
  
  val f1 = (x: Int) => x + 1
  val g1 = (x: Int) => x * 2
  val h1 = compose(f1, g1)
  println(h1(4))
  val f2 = (x: Double) => x + 1
  val g2 = (x: Int) => x * 2.0
  val h2 = composeGeneric(f2, g2)
  println(h2(4))