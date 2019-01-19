package demo.simple

object CallByNameOrValue {
  def main(args: Array[String]): Unit = {
    callByName(something())

    println("----------------")

    callByValue(something())
  }

  def something(): Int = {
    println("Calling Something")
    return 1
  }

  def callByName(x: => Int): Unit = {
    println("x1= " + x)
    println("x2= " + x)
  }

  def callByValue(x: Int): Unit = {
    println("x1= " + x)
    println("x2= " + x)
  }
}
