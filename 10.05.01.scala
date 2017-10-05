/*
 * Abstract Types
 *
 * type T
 */


trait Buffer {
  type T
  val element: T
}

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
  // anonymous class
  new IntSeqBuffer {
	type T = List[U]
	val element = List(elem1, elem2)
  }

val buf = newIntSeqBuf(7, 8)
println("length = " + buf.length)
println("content = " + buf.element)

/**
 * Traits and abstract classes can have an abstract type member.
 * This means that the concrete implementations define the actual type. 
 */
