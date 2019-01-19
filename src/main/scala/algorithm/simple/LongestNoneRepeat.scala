package algorithm.simple

/**
  * @author apktool
  */
object LongestNoneRepeat {
  def main(args: Array[String]): Unit = {
    val str: String = "abcabcd"
    val result: Int = longestNoneRepeat(str)
    println(result)
  }

  def longestNoneRepeat(str: String): Int = {
    var start = 0
    var maxLength = 0

    var startMap = Map.empty[Char, Int]

    str.zipWithIndex.foreach(v => {
      val (char, i) = v

      startMap.get(char) match {
        case Some(lastIndexOfChar) => {
          if (start <= lastIndexOfChar) {
            start = lastIndexOfChar + 1
          } else {
            maxLength = math.max(maxLength, i - start + 1)
          }
        }

        case None => {
          maxLength = math.max(maxLength, i - start + 1)
        }
      }

      startMap ++= Map[Char, Int](char -> i)
    })

    return maxLength;
  }
}
