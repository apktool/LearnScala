package demo.simple


object CollectionDemo {

  def main(args: Array[String]): Unit = {
    val myList = List(1, 2, 3, 4)

    for (x <- myList) {
      print(x + " ")
    }

    println("\n------")

    val mySet = Set(1, 3, 5, 7)

    for (x <- mySet) {
      print(x + " ")
    }

    println("\n------")

    val myMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
    println(myMap.keys)
    println(myMap.values)

    println(myMap("one"))

    myMap.keys.foreach { i =>
      print("key = " + i + "\t")
      println("value = " + myMap(i))
    }

    var map: Map[Char, Int] = Map()
    map += ('I' -> 1)
    map += ('K' -> 2)

    map.keys.foreach { i =>
      print("key = " + i + " ")
      println("value = " + map(i))
    }

    println("\n------")

    // tuple
    val myTuple = (10, "Runoob")
    println(myTuple._1)

    myTuple.productIterator.foreach { i =>
      println("value = " + i)
    }

    println("\n------")

    def f(s: String): Unit = {
      println(s * 2)
    }

    var arrays = Array("a", "b", "c")
    arrays.foreach(println)

    var mapE = Map.empty[String, Int]
    mapE ++= Map("a" -> 1)
    mapE ++= Map("b" -> 2)
    mapE ++= Map("c" -> 3)

    mapE.keys.foreach(x => {
      println(x + ":" + mapE(x))
    })
  }
}
