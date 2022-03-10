package Exercises

object Es1 extends App :

  // EXERCISE 1
  // lambda syntax
  val parityLambda: Int => String = x => x % 2 match
    case 0 => "even"
    case 1 => "odd"

  // method syntax
  def parityMethod(x: Int): String = x % 2 match
    case 0 => "even"
    case 1 => "odd"

  println(parityMethod(0))
  println(parityMethod(1))
  println(parityMethod(2))
  println(parityLambda(0))
  println(parityLambda(1))
  println(parityLambda(2))
