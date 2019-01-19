package demo.simple

/**
  * @author apktool
  */
object OptionDemo {
  def main(args: Array[String]): Unit = {
    val option: Option[String] = Option("foo")
    option match {
      case Some(s) => s
      case None => "?"
    }

    val abc = option
    println(abc.get)

    println("----------------")

    val sites = Map("a" -> 1, "b" -> 2)
    println("show(sites.get(a)) : " + show(sites.get("a")))

  }

  def show(x: Option[Int]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
