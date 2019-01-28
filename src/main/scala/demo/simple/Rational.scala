package demo.simple

/**
  * Classes And Objects
  */

class Rational(n: Int, d: Int) {
  private def gcd(x: Int, y: Int): Int = {
    if(x == 0) y
    else if(x < 0) gcd(-x, y)
    else if(y < 0) -gcd(x, -y)
    else gcd(y % x, x)
  }

  private val g = gcd(n, d)

  val numer: Int = n / g
  val denom: Int = d / g

  def +(that: Rational) = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def -(that: Rational) = {
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  }

  def *(that: Rational) = {
    new Rational(numer * that.numer, denom * that.denom)
  }

  def /(that: Rational) = {
    new Rational(numer * that.denom, denom * that.numer)
  }
}

object RationalDemo {
  def main(args: Array[String]): Unit = {
    val x = new Rational(1, 2)
    val y = new Rational(1, 4)

    /* 1/2 + 1/4 = 3/4 */
    var a = x + y
    println(" " + a.numer + "/" + a.denom)

    /* 1/2 - 1/4 = 1/4 */
    var b = x - y
    println(" " + b.numer + "/" + b.denom)

    /* 1/2 * 1/4 = 1/8 */
    var c = x * y
    println(" " + c.numer + "/" + c.denom)

    /* 1/2 / 1/4 = 2/1 */
    var d = x / y
    println(" " + d.numer + "/" + d.denom)
  }
}
