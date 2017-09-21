import scala.annotation.tailrec

def factorial(n: Int): Int = {
  @tailrec
  def iter(x: Int, result: Int): Int =
    if (x == 0) {
      result
    } else {
      iter(x - 1, result * x)
    }
    iter(n, 1)
}

var result = factorial(3)
println(result)
