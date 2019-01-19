package demo.simple

class Count {
  private var value: Int = 0

  def increment(step: Int): Unit = {
    value += step
  }

  def getValue(): Int = {
    value
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    println("Hello world")

    var haha = new Count
    haha.increment(5)
    println(haha.getValue())
  }
}
