/*
 * Variances | Invariance
 */

abstract class Animal {
  def name: String
}
case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal

class Container[A](value: A) {
  private var _value: A = value
  def getValue: A = _value
  def setValue(value: A): Unit = {
    _value = value
  }
}

val catContainer: Container[Cat] = new Container(Cat("Felix"))
val cat: Cat = catContainer.getValue
println(catContainer)

val animalContainer: Container[Animal] = catContainer
animalContainer.setValue(Dog("Spot"))

/*
 * C[+T]：如果A是B的子类，那么C[A]是C[B]的子类。
 * C[-T]：如果A是B的子类，那么C[B]是C[A]的子类。
 * C[T]：无论A和B是什么关系，C[A]和C[B]没有从属关系。
 */
