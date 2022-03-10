package Exercises

object Es7 extends App :

  // EXERCISE 7
  enum Shape:
    case Rectangle(length: Double, height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  object Shape:

    def perimeter(shape: Shape): Double = shape match
      case Rectangle(length, height) => length * 2 + height * 2
      case Circle(radius) => 2 * Math.PI * radius
      case Square(side) => side * 4

    def area(shape: Shape): Double = shape match
      case Rectangle(length, height) => length * height
      case Circle(radius) => Math.PI * (radius * radius)
      case Square(side) => side * side
