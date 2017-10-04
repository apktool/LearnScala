/*
 * Variances | Covariance
 */

abstract class Animal {
    def name: String
}

case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal

object CovarianceTest extends App {
  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach { animal => println(animal.name) }
  }

  val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
  val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

  printAnimalNames(cats)
  printAnimalNames(dogs)
}

/*
 * C[+T]：如果A是B的子类，那么C[A]是C[B]的子类。
 * C[-T]：如果A是B的子类，那么C[B]是C[A]的子类。
 * C[T]：无论A和B是什么关系，C[A]和C[B]没有从属关系。
 */
/*
 * Polymorphism
 *
 * 理解本系列例子时结合多态的概念
 * 本系列的例子并不是特别经典，因此有时间考虑重新表达Variance的思想
 */
