package demo.simple


object ImplicitDemo {
  implicit val n: Int = 6
  def scale(x: Int)(implicit y: Int) = x * y

  abstract class Monoid[A] {
    def add(x: A, y: A): A
    def unit: A
  }

  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    def add(x: String, y: String): String = x concat y
    def unit: String = ""
  }

  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  def main(args: Array[String]): Unit = {
    var result: Any = None

    result = scale(5)
    println(result)

    result = sum(List(1, 2, 4))
    println(result)

    result = sum(List("a", "b", "c"))
    println(result)
  }
}