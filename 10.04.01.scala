/*
 * for comprehensions
 * http://docs.scala-lang.org/tour/for-comprehensions.html
 *
 * Note:
 * for (enumerators) yield e
 */

case class User(
  val name: String,
  val age: Int
)

val userBase = List(
  new User("Travis", 28),
  new User("Kelly", 33),
  new User("Jennifer", 44),
  new User("Dennis", 23)
)

val twentySomthings = for(user <- userBase if (user.age >= 20 && user.age < 30))
  yield user.name

twentySomthings.foreach(name => println(name))

/*-------------*/

def foo(n: Int, v: Int) = 
  for(i <- 0 until n; j<- i until n if i + j == v)
    yield (i, j)

foo(10, 10) foreach {
  case (i, j) => print(s"($i, $j) ")
}
