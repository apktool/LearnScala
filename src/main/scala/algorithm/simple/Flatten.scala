package algorithm.simple

import scala.collection.mutable.ListBuffer

/**
  * @author apktool
  */
object Flatten {
  def apply(array: List[Any]): List[Any] = {
    var result = ListBuffer.empty[Any]

    array.foreach(e => result ++= flatten(e))

    result.toList
  }

  def main(args: Array[String]): Unit = {
    val list = List("a", "b", List("c", "d"), Tuple2("e", "f"))
    val result = Flatten.apply(list)
    result.foreach(e => {
      print(e + " ")
    })
  }

  private[this] def flatten(e: Any): List[Any] = {
    e match {
      case Nil => Nil
      case head :: rest => flatten(head) ++ flatten(rest)
      case (a, b) => flatten(a) ++ flatten(b)
      case v => List(v)
    }
  }
}
