package demo.simple

/**
  * 传值调用（call-by-value）：先计算参数表达式的值，再应用到函数内部；
  * 传名调用（call-by-name）：将未计算的参数表达式直接应用到函数内部
  */
class DelayedTime {
  def time(): Long = {
    println("获取时间，单位为纳秒")
    System.nanoTime()
  }

  // call-by-name
  // 思想有点类似于延迟计算，延迟加载
  def delayed(t: => Long): Long = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

  // call-by-value
  def delayed2(t: Long): Long = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }
}

object CallByName {
  def main(args: Array[String]): Unit = {
    val delayedTime1 = new DelayedTime
    val delayedTime2 = new DelayedTime

    // 请注意下述两种写法导致的结果的差异

    delayedTime1.delayed(delayedTime1.time())

    println("-----------")

    val time = delayedTime2.time()
    delayedTime2.delayed(time)

    println("\n-------上述描述了传名引用---------")
    println("-------下述描述了传值引用---------\n")

    delayedTime1.delayed2(delayedTime1.time())

    println("-----------")

    delayedTime2.delayed2(delayedTime2.time())
  }
}
