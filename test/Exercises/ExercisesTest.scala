package Exercises

import Exercises.Es3.*
import Exercises.Es4.{p1, p2, p3, p4}
import Exercises.Es5.{compose, composeGeneric}
import Exercises.Es6.fib
import Exercises.Es7.Shape
import Exercises.Es7.Shape.{Circle, Rectangle, Square, area, perimeter}
import Exercises.Es8.Option.{None, Some, filter, map, map2}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.BTrees.Tree.count

class ExercisesTest {

  @Test def testParity(): Unit = {
    assertEquals("even", parityLambda(0))
    assertEquals("odd", parityLambda(1))
    assertEquals("even", parityLambda(2))
    assertEquals("even", parityMethod(0))
    assertEquals("odd", parityMethod(1))
    assertEquals("even", parityMethod(2))
  }

  @Test def testNeg(): Unit = {
    val empty: String => Boolean = _ == ""
    val notEmptyLambda = negLambda(empty)
    assertEquals(true, notEmptyLambda("foo"))
    assertEquals(false, notEmptyLambda(""))
    assertEquals(true, notEmptyLambda("foo") && !notEmptyLambda(""))
    val notEmptyMethod = negMethod(empty)
    assertEquals(true, notEmptyMethod("foo"))
    assertEquals(false, notEmptyMethod(""))
    assertEquals(true, notEmptyMethod("foo") && !notEmptyMethod(""))
    val notEmpty = genericNeg(empty)
    assertEquals(true, notEmpty("foo"))
    assertEquals(false, notEmpty(""))
    assertEquals(true, notEmpty("foo") && !notEmpty(""))

  }

  @Test def testRelations(): Unit = {
    assertEquals(true, p1(1)(2)(3))
    assertEquals(false, p1(3)(2)(3))
    assertEquals(true, p2(1, 2, 3))
    assertEquals(false, p2(3, 2, 3))
    assertEquals(true, p3(1)(2)(3))
    assertEquals(false, p3(3)(2)(3))
    assertEquals(true, p4(1, 2, 3))
    assertEquals(false, p4(3, 2, 3))
  }

  @Test def testComposition(): Unit = {
    val f1 = (x: Int) => x + 1
    val g1 = (x: Int) => x * 2
    val h1 = compose(f1, g1)
    val f2 = (x: Double) => x + 1
    val g2 = (x: Int) => x * 2.0
    val h2 = composeGeneric(f2, g2)
    assertEquals(9, h1(4))
    assertEquals(9.0, h2(4))
  }

  @Test def testFibonacci(): Unit = {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(2, fib(3))
    assertEquals(3, fib(4))
  }

  @Test def testShapes(): Unit = {
    val height = 2
    val length = 3
    val radius = 3
    val rectangle = Rectangle(2, 3)
    val square = Square(3)
    val circle = Circle(3)
    assertEquals(height * 2 + length * 2, perimeter(rectangle))
    assertEquals(height * length, area(rectangle))
    assertEquals(length * 4, perimeter(square))
    assertEquals(length * length, area(square))
    assertEquals(radius * 2 * Math.PI, perimeter(circle))
    assertEquals(radius * radius * Math.PI, area(circle))
  }

  @Test def testOption(): Unit = {
    val combiner = (x: Int, y: Double) => x + y
    val opt1 = Some(5)
    val opt2 = Some(6.1)
    val opt3 = None[Int]()
    val opt4 = None[Double]()
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
    assertEquals(None(), filter(None[Int]())(_ > 2))
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(false), map(Some(5))(_ > 8))
    assertEquals(None(), map(None[Int]())(_ > 2))
    assertEquals(Some(11.1), map2(opt1)(opt2)(combiner))
    assertEquals(None(), map2(opt3)(opt2)(combiner))
    assertEquals(None(), map2(opt1)(opt4)(combiner))
  }
}
