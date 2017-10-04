/* 
 * sequence comprehensions
 * http://docs.scala-lang.org/tour/sequence-comprehensions.html
 *
 * Note
 * for (enumerators) yield e
 */


object ComprehensionTest1 extends App {
  def even(from: Int, to: Int): List[Int] =
    for(i <- List.range(from, to) if i % 2 == 0) yield i
  Console.println(even(0, 20))

  /*---------------*/

  def foo(n: Int, v: Int) =
    for (i <- 0 until n; j <- i until n if i + j == v) yield (i, j);

  foo(20, 32) foreach {
    case (i, j) =>
      println(s"($i, $j)")
  }
}
