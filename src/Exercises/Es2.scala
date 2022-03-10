package Exercises

object Es2 extends App :

  //EXERCISE 2
  // lambda syntax
  val negLambda: (String => Boolean) => String => Boolean =
    f => i => !f(i)

  // method syntax
  def negMethod(f: String => Boolean): String => Boolean =
    i => !f(i)
