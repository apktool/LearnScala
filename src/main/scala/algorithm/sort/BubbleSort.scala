package algorithm.sort

/**
  * @author apktool
  */

object BubbleSort {
  def main(args: Array[String]): Unit = {
    val bs = BubbleSort

    val list1 = Array(12, 23, 32, 3, 24, 1)
    bs.bubbleSort1(list1)

    list1.foreach(x => print(x + " "))

    println("\n--------------------")

    val list2: List[Int] = List(12, 23, 32, 3, 24, 1)
    val result = bs.bubblesort2(list2)

    result.foreach(x => print(x + " "))
  }

  def bubbleSort1(list: Array[Int]): Unit = {
    for (i <- 0 until list.length) {
      for (j <- i until list.length) {
        if (list(i) > list(j)) {
          val temp = list(i)
          list(i) = list(j)
          list(j) = temp
        }
      }
    }
  }

  def bubblesort2(list: List[Int]): List[Int] = {
    def bubble(as: List[Int], zs: List[Int], bs: List[Int]): List[Int] = as match {
      case h1 :: h2 :: t =>
        if (h1 > h2) bubble(h1 :: t, h2 :: zs, bs)
        else bubble(h2 :: t, h1 :: zs, bs)
      case h1 :: Nil => sort(zs, h1 :: bs)
    }

    def sort(as: List[Int], bs: List[Int]): List[Int] = {
      if (as.isEmpty) bs
      else bubble(as, Nil, bs)
    }

    sort(list, Nil)
  }
}
