package Exercises

object Es3 extends App :

  val parityLambda = (x: Int) => x % 2 match
    case 0 => "even"
    case 1 => "odd"

  def parityMethod(x: Int) = x % 2 match
    case 0 => "even"
    case 1 => "odd"

  val negLambda: (String => Boolean) => String => Boolean =
    f => i => !f(i)

  def negMethod(f: String => Boolean): String => Boolean =
    i => !f(i)

  def genericNeg[A](f: A => Boolean): A => Boolean =
      i => !f(i)
