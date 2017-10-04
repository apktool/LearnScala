/*
 * Generic class
 *
 * make a stack structure using generic class
 */

class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A) { elements = x :: elements }
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}

val stack1 = new Stack[Int]
stack1.push(1)
stack1.push(2)
println(stack1.pop)  // prints 2
println(stack1.pop)  // prints 1

/*-------------*/

class Fruit
class Apple extends Fruit
class Banana extends Fruit

val stack2 = new Stack[Fruit]
val apple = new Apple
val banana = new Banana

stack2.push(apple)
stack2.push(banana)
println(stack2.pop)
println(stack2.pop)

/*
 * Generic classes take a type as a parameter within square brackets [].
 * One convention is to use the letter A as type parameter identifier,
 * though any parameter name may be used.
 */
