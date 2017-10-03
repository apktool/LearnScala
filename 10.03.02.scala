/*
 * Unified Type and Classes
 */

val list: List[Any] = List(
  "a String",
  732,
  'c',
  true,
  () => "an anonymous function returning a string"
)

list.foreach(element => println(element))

println("----->| Private Members and Getter/Setter Syntax")

//-----------

class Point {
  private var _x = 0
  private val bound = 100

  def x = _x // getter
  /*
   * Notice the special syntax for the setters:
   * the method has _= appended to the identifier of the getter and the parameters come after.
   */
  def x_= (newValue: Int): Unit = { // setter
    if (newValue < bound) _x = newValue else printWarning
  }

  private def printWarning = println("WARNING: Out of bounds")
}

val point1 = new Point
point1.x = 99
println(point1.x)
point1.x = 101
