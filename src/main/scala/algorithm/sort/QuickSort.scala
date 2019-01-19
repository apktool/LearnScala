package algorithm.sort

/**
  * @author apktool
  */
object QuickSort {
  def main(args: Array[String]): Unit = {
    var array: Array[Int] = Array(21, 13, 24, 53, 46, 75)

    array = quicksort (array)
    array foreach (t => print(t + " "))
  }

  def quicksort(array: Array[Int]): Array[Int] = {
    if (array.length <= 1) array
    else {
      val pivot: Int = array((array.length - 1) / 2)
      Array.concat(
        array filter (pivot >),
        array filter (pivot ==),
        array filter (pivot <)
      )
    }
  }
}
