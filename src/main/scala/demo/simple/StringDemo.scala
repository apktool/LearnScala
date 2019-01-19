package demo.simple


object StringDemo {
  def main(args: Array[String]): Unit = {
    var a = "Hello Scala"
    println(a)

    val b: String = "Hello world"
    println(b)

    val buf = new StringBuilder
    buf += 'a'
    buf ++= "bcdef"
    println("buf is :" + buf.toString() + " -> " + buf.length)

    println(a.concat(b))
    println(a + b)

    printf("%d - %.3f - %s", 10, 20.0, "OK")
  }
}
