package learn.scala

object LearningScalaCh4 extends App {

  @annotation.tailrec
  def power(x: Int, n: Int, t: Int = 1): Int = {
    if (n < 1) t
    else power(x, n - 1, x * t)
  }

  def getCircleArea(x: Float): Double = 3.14 * x * x

  def getCircleArea(s: String): Double = {
    if (s.isEmpty()) 0D
    else getCircleArea(s.toFloat)
  }

  @annotation.tailrec
  def printValues(low: Int, high: Int): Unit = {
    if (low <= high) {
      print(low + " ")
      printValues(low + 5, high)
    }
  }

  def getStringRepresentation(tuple: (Any, Any, Any)): (Any, Any, Any, Any, Any, Any) = {
    (tuple._1, tuple._1.toString(), tuple._2, tuple._2.toString(),
      tuple._3, tuple._3.toString())
  }

  /**
   * Tests
   */
  println(power(5, 5))

  println(getCircleArea(2))

  println(getCircleArea(""))

  println(printValues(5, 50))

  val tuples = getStringRepresentation((true, 22.25, "yes"))
  println(tuples._1 + ", " + tuples._2 + ", " + tuples._3 + ", " +
    tuples._4 + ", " + tuples._5 + ", " + tuples._6)
}
