package algorithm.simple

/**
  * @author apktool
  */
object TwoSum {
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 2, 5, 9)
    val target = 7

    val result = twoSum(list, target)
    result.foreach(print)
  }

  def twoSum(list: List[Int], target: Int): List[Int] = {
    var map = Map.empty[Int, Int]

    for ((v, i) <- list.zipWithIndex) {
      map.get(v) match {
        case Some(r) => return List(r, i)
        case None => map ++= Map((target - v) -> i)
      }
    }

    return List(-1, -1);
  }
}
