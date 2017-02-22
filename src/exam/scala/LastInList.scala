package exam.scala

import scala.collection.mutable.ListBuffer

/**
 * LESSONS LEARNT:
 * 1. Line# 14, 15: How to pass list as parameter to a method.
 * 2. Line# 22: List parameters must come last.
 *
 * @author pankajkumar
 */
object LastInList extends App {

  val list = List(1, 2, 3, 4, 5, 6, 7)

  println("Last element: " + last(list: _*))
  println("Penultimate element: " + penultimate(list: _*))
  println("Nth element: " + nth(3, list: _*))
  println("Reversed list: " + reverse(list: _*))
  println("Is the list palindrome: " + isPalindrome(list: _*))

  def last(list: Int*): Int = list(list.size - 1)

  def penultimate(list: Int*): Int = list(list.size - 2)

  def nth(k: Int, list: Int*): Int = list(k - 1)

  def reverse(list: Int*): List[Int] = {
    var reverse = new ListBuffer[Int]()
    list.foreach { x => reverse = x +: reverse }
    reverse.toList
  }

  // will resume from here, once control structures are studied
  def isPalindrome(list: Int*): Boolean = {
    var i = 0
    var j = list.size - 1

    for (i <- 0 to list.size; j <- list.size - 1 to 0) { //  if i <= j
      //      if (list(i) != list(j)) {
      //        return false
      //      }
      println("Hello world")
      println(list(i) + "--" + list(j))
    }

    for (i <- 0 to 3; j <- 0 to 2) {
      println(s"Hello world: $i, $j")
    }

    true
  }
}
