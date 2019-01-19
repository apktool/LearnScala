package demo.simple

class Counter {
  val age: Int = 10
  var name: String = ""

  def forList(item: Array[Int]): Unit = {
    for (a <- 0 until item.length) {
      print(item(a) + " ")
    }
    println()

    for (a <- 0 to item.length - 1) {
      print(item(a) + " ")
    }
    println()

    for (a <- item) {
      print(a + " ")
    }
    println()
  }

  def forEachList(item: Array[String]): Unit = {
    item.foreach(print)
    println()

    item.foreach { e =>
      val s = e.toUpperCase
      print(s + " ")
    }
  }

  def whileList(item: Array[Int]): Unit = {
    var i: Int = 0

    while (i < item.length) {
      print(item(i) + " ")
      i += 1
    }

    println()
  }


}

object LoopDemo {
  def main(args: Array[String]): Unit = {
    println("Hello world")

    val ahha = new Counter

    var x: Array[Int] = Array(0, 1, 3)
    ahha.forList(x)

    var y: Array[Int] = new Array[Int](3)
    y(0) = 7
    y(1) = 8
    y(2) = 9
    ahha.whileList(y)

    var z: Array[String] = Array("ab", "bc", "cd")
    ahha.forEachList(z)

    ahha.name = "apktool"
    println(ahha.name)
    //    ahha.age = 1 // Error
    println(ahha.age)
  }
}
