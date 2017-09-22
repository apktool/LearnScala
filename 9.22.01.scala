/*
 * match case
 * sealed trait
 * case class
 */

case class Note1(
  name: String,
  duration: String,
  octave: Int
)

var c = Note1("C", "Quarter", 3)

println(c.name)
println(c.duration)
println(c.octave)

println("----------------")

/* 
 * defining alternatives with sealed traits
 */
sealed trait Symbol // 类似于定义了一个新的类型名

case class Note2(
  name: String,
  duration: String,
  octave: Int
)extends Symbol

case class Rest2(
  duration: String
)extends Symbol

val symbol1: Symbol = Note2("C", "Halve", 3)
val symbol2: Symbol = Rest2("Whole")

/*
 * pattern mathing
 */
def symbolDuration(symbol: Symbol): String = {
  symbol match {
    case Note2(name, duration, octave) => duration
    case Rest2(duration) => duration
  }
}

val a = symbolDuration(symbol1)
println(a)
