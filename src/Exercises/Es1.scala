package Exercises

object Es1 extends App :

  // EXERCISE 1
  // lambda syntax
  val parityLambda = (x: Int) => x % 2 match
    case 0 => "even"
    case 1 => "odd"

  // method syntax
  def parityMethod(x: Int) = x % 2 match
    case 0 => "even"
    case 1 => "odd"
