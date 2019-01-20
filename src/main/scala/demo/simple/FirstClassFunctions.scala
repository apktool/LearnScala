package demo.simple

/**
  * First-Class Function
  */

object FirstClassFunctions {
  def main(args: Array[String]): Unit = {
    val a: Int = 0
    val b: Int = 5

    println(sumInts(a, b))
    println(sumSquares(a, b))
    println(sumPowersOfTwo(a, b))
  }

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)

  def sumSquares(a: Int, b: Int): Int = sum(x => x * x, a, b)

  def sumPowersOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)

  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)
}
