package demo.simple

import scala.collection.{Seq, mutable}

object MutableDemo {
  private var partitionReplicaAssignmentUnderlying: mutable.Map[String, mutable.Map[Int, Seq[Int]]] = mutable.Map.empty

  def main(args: Array[String]): Unit = {
    val seq1: Seq[Int] = Seq(1, 2, 3, 4, 5)
    val seq2: Seq[Int] = Seq(6, 7, 8, 9, 0)

    val map: mutable.Map[Int, Seq[Int]] = mutable.Map.empty
    map.put(1, seq1)
    map.put(2, seq2)

    partitionReplicaAssignmentUnderlying.put("a", map)

    val a = partitionReplicaAssignmentUnderlying.getOrElse("b", mutable.Map.empty)
    println(partitionReplicaAssignmentUnderlying.contains("b"))


    val b = partitionReplicaAssignmentUnderlying.getOrElseUpdate("c", mutable.Map.empty)
    println(partitionReplicaAssignmentUnderlying.contains("c"))

    val c = partitionReplicaAssignmentUnderlying get ("a")
    println(c)

    println("--------keySet------------")
    map.keySet.foreach(t => println(t))

    println("--------values------------")
    map.values.foreach(t => println(t))
  }
}
