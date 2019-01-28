package demo.simple

/**
  * Case Class
  *
  * 1. 自动为该类添加了一个和类名一样的工厂方法，所以在实例化的时候我们可以直接写成 Var("x")，不再写成 new Var("x")
  * 2. 所有 case class 的参数被隐式的添加上了 val 前缀，也就是说我们可以直接像这样访问参数
  * 3. 编译器添加了 toString、hashCode、equals 方法的实现
  * 4. 编译器添加了一个 copy 方法，可以通过修改特定的参数生成一个新的 case class 实例
  */

abstract class Expr

case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object Expression {
  def main(args: Array[String]): Unit = {
    val result = simplifyTop(UnOp("-", UnOp("-", Number(2.0))))
    println(result)  //Number(2.0)
  }

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e     // Double negation
    case BinOp("+", e, Number(0)) => e    // Adding zero
    case BinOp("*", e, Number(1)) => e    // Multiplying by one
    case _ => expr
  }
}

/**
  * 空对象Nil,Null,null,Unit,Nothing,None
  * 1) Nothing 是trait，定义为：final trait Nothing extends Any。Nothing处于Scala类型体系的最底层，是所有类型的子类型，Nothing没有实例。
  * 2) Null 是trait，定义为：final trait Null extends AnyRef 。Null是所有引用类型的子类型，唯一的一个实例是null。
  * 3) null是Null的实例，类似Java中的null
  * 4) Nil 是case object，定义为case object Nil extends List[Nothing]， 代表一个空list,长度为0。由于Scala中的List是协变的，因此无论T是何种类型，Nil都是List[T]的实例。
  * 5) None 是case object，定义为：case object None extends Option[Nothing]，代表不存在的值。Option有两个实例。None和Some
  * 6) Unit 是class，定义为：abstract final class Unit extends AnyVal。Unit跟Java中的void相当，当一个方法不返回任何值的时候，那么方法的类型是Unit。Unit唯一的一个实例是().
  */
