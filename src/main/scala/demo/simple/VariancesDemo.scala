package demo.simple

/**
  * * 不变 | A Invariant class
  * class Consumer[T](t: T) {}
  *
  * * 协变 | A covariant class
  * class Consumer[+T](t: T) {}
  *
  * * 逆变 | A contravariant class
  * class Consumer[-T](t: T) {}
  */

class Animal {}
class Bird extends Animal{}

class Consumer[+T](t: T) {}

class Test extends App {
  val c: Consumer[Bird] = new Consumer[Bird](new Bird())
  val c2: Consumer[Animal] = c
}

object VariancesDemo {
  def main(args: Array[String]): Unit = {
    val test = new Test
    test.c
    test.c2
  }
}

/**
  * 1） 不变
  * 不支持T的子类或者父类，只知支持T本身。
  *
  * 2） 协变
  * [+T], covariant (or “flexible”),类似Java中的(? extends T), 即可以用T和T的子类来替换T，里氏替换原则。
  *
  * 3） 逆变
  * [-T], contravariant,类似Java中的(? supers T),只能用T的父类来替换T,是逆里氏替换原则。
  *
  * 4） 上界
  * 只允许T的超类U来替换T。 [U >: T]
  *
  * 5） 下界
  * 只允许T的子类U来替代T。 [U <: T]
  */
