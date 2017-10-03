/*
 * extractor objects
 */

import scala.util.Random

object CustomerID {

  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val name = customerID.split("--").head
    if (name.nonEmpty) Some(name) else None
  }
}

val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
customer1ID match {
  case CustomerID(name) => println(name)  // prints Sukyoung
  case _ => println("Could not extract a CustomerID")
}

/*
 * An extractor object is an object with an unapply method.
 *
 * Whereas the 'apply' method is like a constructor which takes arguments and creates an object,
 * the 'unapply' takes an object and tries to give back the arguments.
 *
 * This is most often used in pattern matching and partial functions.
 */
