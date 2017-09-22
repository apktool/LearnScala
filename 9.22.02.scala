/**
 * Standard Library
 */

import scala.util.{ Try, Success, Failure }

// Option, Some, None
def divied(x: Double, y: Double): Option[Double] =
  if (y == 0) None else Some(x/y)

val a = divied(4.2, 0.0)
println(a)


// Try, Success, Failure
def postive(x: Double): Try[Double] = 
  if (x < 0) Failure(new IllegalArgumentException("x must be positive"))
  else Success(x)

val b = postive(4.0)
println(b)


// Either, Left, Right
def negative(x: Double): Either[String, Double] =
  if (x > 0) Left("x must be negative")
  else Right(x)

val c = negative(-4.0)
println(c)
