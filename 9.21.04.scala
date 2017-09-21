// Scala的执行顺序不太明白

object Foo {
  val x = 1
}

object Bar {
  val x = 2
}

object Baz {
  import Bar.x
  val y = x + Foo.x
}

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }
  println(Baz.y)
}
