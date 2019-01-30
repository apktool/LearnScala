package demo.simple

class CompanionDemo {
  var field = "Companion Class"
  def doSomething = println("Hello " + field)
}

object CompanionDemo {
  val field = "Companion Object"
  def doSomething= println("Hello " + field)

  def apply(): CompanionDemo = new CompanionDemo()

  def main(args: Array[String]): Unit = {
    val str1 = CompanionDemo.field
    println("Call " + str1)

    // Call Companion Class
    val cd = new CompanionDemo
    cd.doSomething

    // Call Companion Object
    val cd1 = CompanionDemo
    cd1.doSomething

    // Call Companion Class | apply
    val cd2 = CompanionDemo()
    cd2.doSomething
  }
}
