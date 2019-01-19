package demo.simple

/**
  * @author apktool
  */
class MyAddr {
  val x: Int = 0

  def apply(y: Int) = x + y
}

object ApplyDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    val myAddr = new MyAddr
    println(myAddr(2))
  }
}
