package demo.simple

import scala.Array.range

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val myList1: Array[Int] = Array(1, 2, 3)
    for (i <- 0 to myList1.length - 1) {
      print(myList1(i) + " ")
    }

    println()

    for (x <- myList1) {
      print(x + " ")
    }

    println("----------------------")

    // 区间数组
    val myList2 = range(10, 20, 2)
    for (x <- myList2) {
      print(x + " ")
    }
  }
}
