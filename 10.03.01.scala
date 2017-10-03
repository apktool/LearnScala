/*
 * Scala basics usage
 * http://docs.scala-lang.org/tour/basics.html
 */

println("----->| " + "Functions" + "|<-----")

val add = (x: Int, y: Int) => x + y
val number1 = add(1, 2)
println(number1)

println("----->| " + "Methods" + "|<-----")

def sum(x: Int, y: Int): Int = x + y
val number2 = sum(1, 2)
println(number2)

println("----->| " + "Classes" + "|<-----")

class Greeter(prefix: String, suffix: String){
  def greet(name: String): Unit = {
    println(prefix + name + suffix)
  }
}

val greeter = new Greeter("Hello", "!")
greeter.greet(" Scala ")

println("----->| " + "Case Classes" + "|<-----")

/*
 * case classes are immutable and compared by value.
 */

case class Point(
  x: Int,
  y: Int
)

var p = Point(1, 2)
println(p.x)
println(p.y)

println("----->| " + "Objects" + "|<-----")

/*
 * Objects are single instances of their own definitions.
 * You can think of them as singletons of their own classes.
 */

object IdFactory{
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}

val newId1: Int = IdFactory.create()
println(newId1)
val newId2: Int = IdFactory.create()
println(newId2)

println("----->| " + "Traits" + "|<-----")

/*
 * Traits are types containing certain fields and methods
 */

trait GreeterT {
  def greet(name: String): Unit = {
    println("Hello," + name + "!")
  }
}

//-------

class DefaultGreeterT extends GreeterT
val greeterT = new DefaultGreeterT()
greeter.greet(" Scala developer ")

//-------

class CustomizableGreeter(prefix: String, postfix: String) extends GreeterT {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}
val customGreeter = new CustomizableGreeter("How are you, ", "?")
customGreeter.greet("Scala developer")
