package learn.scala

import scala.collection.mutable.ArrayBuffer

object FirstClassFunctions extends App {

  val square = (x: Int) => x * x

  def map(f: Int => Int, args: Array[Int]): Array[Int] = {
    val result = new ArrayBuffer[Int]()
    for (x <- args) result.+=(f(x))
    result.toArray
  }

  val squaredMap = map(square, Array(1, 2, 3, 4, 5))

  for (x <- squaredMap) println(x)
}
