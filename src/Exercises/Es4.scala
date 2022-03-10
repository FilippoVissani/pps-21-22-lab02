package Exercises

object Es4 extends App :

  // EXERCISE 4
  val p1: Int => Int => Int => Boolean = x => y => z =>
    x <= y && y <= z

  val p2: (Int, Int, Int) => Boolean = (x, y, z) =>
    x <= y && y <= z

  def p3(x: Int)(y: Int)(z: Int): Boolean =
    x <= y && y <= z

  def p4(x: Int, y: Int, z: Int): Boolean =
    x <= y && y <= z

  println(p1(1)(2)(3))
  println(p1(3)(2)(3))
  println(p2(1, 2, 3))
  println(p2(3, 2, 3))
  println(p3(1)(2)(3))
  println(p3(3)(2)(3))
  println(p4(1, 2, 3))
  println(p4(3, 2, 3))
