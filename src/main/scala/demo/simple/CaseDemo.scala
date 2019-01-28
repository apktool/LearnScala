package demo.simple

object CaseDemo {
  def basic(x: Int) = {
    val result = x match {
      case 1 => {
        println("Hello world")
        x
      }
      case 2 => x * 2
      case _ => x
    }

    result
  }

  def main(args: Array[String]): Unit = {
    var result = basic(1)
    println(result)
  }
}

/**
  * 对比 Java 中的 switch，Scala中的 match 有三个不同点：
  *
  * 第一、在 Scala 中 match 是一个表达式，这说明 match 是有返回值的；
  * 第二、只要匹配到一个，下面的语句就不会执行；
  * 第三、如果没有匹配到任何项就会剖出一个名为 MatchError 的异常，所以要确保能够匹配到值。
  */
