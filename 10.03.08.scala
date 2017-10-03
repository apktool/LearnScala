/*
 * currying
 *
 * http://docs.scala-lang.org/tour/currying.html
 */


object CurryTest extends App {
  def mulOneAtATime(x: Int)(y: Int) = x * y
  /*
   * 上述语句是下述语句的一种简写形式
   * def mulOneAtATime(x: Int) = (y: Int) => x * y
   *
   * 而上述语句所要完成的功能类似于下述形式
   * def mul(x: Int, y: Int) = x * y
   */
  val result = mulOneAtATime(6)(7)
  println(result)
}
