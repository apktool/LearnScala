/*
 * Lower Type Bounds
 *
 * http://docs.scala-lang.org/tour/lower-type-bounds.html
 */

trait Node[+B] {
  def prepend[U >: B](elem: U)  // 有点类似于强制类型转换。将类U强制转换为类B的父类（改为强制表示可能更恰当）
}

case class ListNode[+B](h: B, t: Node[B]) extends Node[B] {
  def prepend[U >: B](elem: U) = ListNode[U](elem, this)
  def head: B = h
  def tail = t
}

case class Nil[+B]() extends Node[B] {
  def prepend[U >: B](elem: U) = ListNode[U](elem, this)
}

trait Bird
case class AfricanSwallow() extends Bird
case class EuropeanSwallow() extends Bird


val africanSwallowList = ListNode[AfricanSwallow](AfricanSwallow(), Nil())
val birdList: Node[Bird] = africanSwallowList
birdList.prepend(new EuropeanSwallow)

/*
 * Covariance + Lower Type Bounds
 * Contravariance + Upper Type Bounds
 */
