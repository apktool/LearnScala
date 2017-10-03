/*
 * Syntactic Sugars
 */


// String Interpolation
def greet(name: String): String =
  s"Hello, $name!"

val a = greet("Scala")
println(a)


// Tuples
def pair(i: Int, s: String): (Int, String) = (i, s)

val b = pair(42, "foo")
println(b)


/* Functions as objects */

trait Function1[A, B]{
  def apply(x: A): B
}

class AnonFun extends Function1[Int, Int]{
  def apply(x: Int) = x * x
}
val funinstance: AnonFun = new AnonFun

// Expansion of Function Calls
val c = funinstance.apply(2)
println(c)

// Functions and Methods
val f = (x: Int) => x+1
println(f(1))
println(f.apply(1))
