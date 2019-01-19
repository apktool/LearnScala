package demo.simple

object ClosureDemo {
  def main(args: Array[String]): Unit = {
    val multiplier = (i: Int) => i * i
    println(multiplier(2))
    println(multiplier.apply(2))

    println("------")

    val createFun = () => {
      var x: Int = 0
      x = x + 1
      println(x * x)
    }

    createFun.apply()
    createFun()
  }
}
