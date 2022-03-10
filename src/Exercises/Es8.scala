package Exercises

object Es8 extends App :

  // EXERCISE 8
  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(predicate: A => Boolean): Option[A] = opt match
      case Some(a) => if (predicate(a)) Some(a) else None()
      case _ => None()

    def map[A](opt: Option[A])(predicate: A => Boolean): Option[Boolean] = opt match
      case Some(a) => Some(predicate(a))
      case _ => None()

    def map2[A, B, C](opt1: Option[A])(opt2: Option[B])(combiner: (A, B) => C): Option[C] =
      opt1 match {
        case Some(a1) => opt2 match {
          case Some(a2) => Some(combiner(a1, a2))
          case _ => None()
        }
        case _ => None()
      }

  import Option.*

  println(filter(Some(5))(_ > 2))
  println(filter(Some(5))(_ > 8))
  println(filter(None[Int]())(_ > 2))
  println(map(Some(5))(_ > 2))
  println(map(Some(5))(_ > 8))
  println(map(None[Int]())(_ > 2))
  val combiner = (x: Int, y: Double) => x + y
  val opt1 = Some(5)
  val opt2 = Some(6.1)
  val opt3 = None[Int]()
  val opt4 = None[Double]()
  println(map2(opt1)(opt2)(combiner))
  println(map2(opt3)(opt2)(combiner))
  println(map2(opt1)(opt4)(combiner))
