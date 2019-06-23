package demo.simple

object YieldDemo {
  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5)

    val result1 = for (i <- 0 until array.length) yield array(i) + 100
    result1.foreach(t => println(t))

    println("---------------------")

    for (i <-0 until array.length) array(i) = array(i) + 100
    array.foreach(t => println(t))
  }
}
