package learn.scala

import learn.scala.classes.Fruit
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

import scala.io.Source

object Chapter2 {

  def main(args: Array[String]) {

    println("=========Arrays=========")

    val greetStrings = new Array[String](2);
    greetStrings(0) = "Hello, ";
    greetStrings(1) = "Pankaj"

    for (greet <- greetStrings) {
      print(greet)
    }
    println()

    greetStrings(0) = "Bye, ";
    greetStrings(1) = "Kumar"

    for (greet <- greetStrings) {
      print(greet)
    }

    println("\n=============")

    val mango = new Fruit("Mango")
    mango eatenBy "Pankaj"

    println("=============")

    val num2 = Array.apply("a", "b")
    println(num2(1))
    num2.foreach { num => println(num) }

    println("=======Lists======")

    val list = List(1, 2, 3)
    list.foreach { l => print(l + "-") }
    println()

    val newList = list ::: List(4)
    newList.foreach { l => print(l + "-") }
    println()

    val newerList = 4 :: list
    newerList.foreach { l => print(l + "=") }
    println()

    println(List(1).:::(List(2, 3, 4))) // List(2, 3, 4) ::: List(1)
    println((List(2, 3, 4)).:::(List(1))) // List(1) ::: List(2, 3, 4)

    println(List(1).::(List(2, 3, 4))) // List(2, 3, 4) :: List(1)
    println(List(2, 3, 4).::(List(1))) // List(1) :: List(2, 3, 4)

    println((1 :: List(2, 3, 4)) + "===" + list(0))

    val llist = List()
    println(llist.length)

    val lnewlist = "a" :: "b" :: llist
    println(lnewlist.length)

    var mlist = new ListBuffer[String]()
    mlist.+=("a").+=("b").+=("c")
    mlist += "a" += "b" += "c"
    val milist = mlist.toList
    println(mlist.length)
    milist.foreach { x => print(x + ", ") }
    println()

    var rmlist = new ListBuffer[String]()
    rmlist.+=:("a").+=:("b").+=:("c") // +=: ending with ":", that's why computed on RHS
    val rmilist = rmlist.toList
    println(rmlist.length)
    rmilist.foreach { x => print(x + ", ") }

    println("\n==========Tuples==========")

    var pair = (99, "Hello World", 54.3)
    println(pair._1 + ", " + pair._2)

    println("=======Sets and Maps========")

    var jetSet = Set("Boeing", "Airbus")
    jetSet = jetSet + "Lear"
    println(jetSet.size + "==" + jetSet.contains("Cessana"))

    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Hello")
    treasureMap += (2 -> "World")
    println(treasureMap.size + "===" + treasureMap(1))
    treasureMap.foreach(f => println(f._1 + "->" + f._2))

    println("=======Files========")

    val filePath = getClass.getClassLoader.getResource("test1.txt").getPath

    for (line <- Source.fromFile(filePath).getLines()) {
      println(line)
    }

  }

}
