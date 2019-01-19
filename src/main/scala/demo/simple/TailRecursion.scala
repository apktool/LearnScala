package demo.simple

/**
  * Tail Recursion
  *
  * @author apktool
  */

object TailRecursion {
  def main(args: Array[String]): Unit = {
    val a: Int = 14
    val b: Int = 21
    var g = gcd(a, b)
    println(g)

    var f = factorial(5)
    println(f)

  }

  // the greatest common divisor
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // factorial
  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)
}
