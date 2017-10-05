/*
 * Abstract Types
 *
 * type T
 */

abstract class Buffer[+T] {
  val element: T
}
abstract class SeqBuffer[U, +T <: Seq[U]] extends Buffer[T] {
  def length = element.length
}

def newIntSeqBuf(e1: Int, e2: Int): SeqBuffer[Int, Seq[Int]] =
  new SeqBuffer[Int, List[Int]] {
	val element = List(e1, e2)
  }

val buf = newIntSeqBuf(7, 8)
println("length = " + buf.length)
println("content = " + buf.element)

/**
 * Traits and abstract classes can have an abstract type member.
 * This means that the concrete implementations define the actual type. 
 */

/**
 * 本例与10.05.01.scala是相同的，这里将抽象类型成员转换为了类的类型参数
 */
