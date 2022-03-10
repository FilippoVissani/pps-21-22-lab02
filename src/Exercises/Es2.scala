package Exercises

object Es2 extends App :

  //EXERCISE 2
  // lambda syntax
  val negLambda: (String => Boolean) => String => Boolean =
    f => i => !f(i)

  // method syntax
  def negMethod(f: String => Boolean): String => Boolean =
    i => !f(i)

  val empty: String => Boolean = _ == ""
  val notEmptyLambda = negLambda(empty)
  println(notEmptyLambda("foo"))
  println(notEmptyLambda(""))
  println(notEmptyLambda("foo") && !notEmptyLambda(""))
  val notEmptyMethod = negMethod(empty)
  println(notEmptyMethod("foo"))
  println(notEmptyMethod(""))
  println(notEmptyMethod("foo") && !notEmptyMethod(""))
