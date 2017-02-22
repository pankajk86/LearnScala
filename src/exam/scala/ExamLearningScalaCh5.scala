package exam.scala

object ExamLearningScalaCh5 extends App {

  //-----1------

  def max(a: Int, b: Int) = if (a > b) a else b
  def min(a: Int, b: Int) = if (a < b) a else b

  def findInTuple(tuple: (Int, Int, Int), f: (Int, Int) => Int): Int = {
    f(f(tuple._1, tuple._2), tuple._3)
  }

  val test1 = findInTuple((5, 2, 7), max)
  val test2 = findInTuple((5, 2, 7), min)

  println(test1 + ", " + test2)

  //------3------

  def calculate(a: Int) = (x: Int) => { a * x }

  val test3 = calculate(4)
  println(test3(6))

  //------4------

  def output(a: Int): Unit = println(a * a)

  def fzero[A](x: A)(f: A => Unit): A = { f(x); x }
  val test4 = fzero[Int](4)(output)
  println(test4)

  //------5------

  def square(m: Double) = m * m
  val sq = square _
  println(sq(4.0D))

  //------6------

  def isPositive(x: Double) = if (x > 0) true else false
  def conditional[A](x: A)(p: A => Boolean)(f: A => A) = if (p(x)) f(x) else x

  val test5 = conditional[Double](5.0D)(isPositive)(sq)
  val test6 = conditional[Double](-5.0D)(isPositive)(sq)
  println(test5 + ", " + test6)

  //------7------

  def multipleOf3or5or15(x: Int) = if (x % 3 == 0 || x % 5 == 0) true else false

  def evaluate(x: Int): Int = {
    if (x % 15 == 0) 15
    else if (x % 5 == 0) 5
    else if (x % 3 == 0) 3
    else x
  }

  for (i <- 1 to 100) {
    val t = conditional[Int](i)(multipleOf3or5or15)(evaluate)
    if (t == 15) println("Typesafe")
    else if (t == 5) println("Safe")
    else if (t == 3) println("Type")
    else println(t)
  }
}
