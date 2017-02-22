package learn.scala

import java.io.File;

object Chapter7 extends App {

  val fileShare = (new File(".")).listFiles();

  for (file <- fileShare)
    println(file)

  println

  for (i <- 1 until 4)
    println("Count: " + i)

  println

  val list = List.range(1, 10)

  for (i <- list if (i % 2 != 0))
    print(i + " ")

  println

  for (i <- list if (i % 2 != 0)) {
    var x = i + 1
    if (x % 2 == 0)
      print(x + " ")
  }

  println

  def evenPlusTwo = for (i <- list if (i % 2 == 0)) yield { i + 2 }
  for (x <- evenPlusTwo) print(x + " ")

  println

  val input = "chips"

  input match {
    case "salt" =>
      println(input + " pepper")
      val str = input + " " + "--pepper"
      println(str)
    case "chips" =>
      println(input + " salsa")
      val str = input + " " + "--salsa"
      println(str)
    case "eggs" => println(input + " bacon")
    case _      => println("what??")
  }

  val friend = input match {
    case "salt"  => "pepper"
    case "chips" => "salsa"
    case "eggs"  => "bacon"
    case _       => "what??"
  }

  println(input + "--" + friend)

  println("======Multiplication table - functional style====")

  println(multiTable())

  def multiTable() = {
    val seq = for (i <- 1 to 10) yield makeRow(i)
    seq.mkString("\n")
  }

  def makeRow(row: Int): String = {
    val result = for (col <- 1 to 10) yield { row * col + "\t" }
    result.mkString
  }
}
