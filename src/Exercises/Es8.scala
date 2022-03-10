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
      case Some(a) if predicate(a) => Some(a)
      case _ => None()

    def map[A](opt: Option[A])(predicate: A => Boolean): Option[Boolean] = opt match
      case Some(a) => Some(predicate(a))
      case _ => None()

    def map2[A, B, C](opt1: Option[A])(opt2: Option[B])(combiner: (A, B) => C): Option[C] = (opt1, opt2) match
        case (Some(a1), Some(a2)) => Some(combiner(a1, a2))
        case _ => None()
