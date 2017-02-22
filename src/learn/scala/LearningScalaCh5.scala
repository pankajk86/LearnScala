package learn.scala

object LearningScalaCh5 extends App {

  def double(x: Int): Int = x * 2

  val myDouble = double _
  println(myDouble(4))

  val greeter = (name: String) => s"Hello, $name"
  val greetSam = greeter("Sam")
  println(greetSam)

  val max = (a: Int, b: Int) => if (a > b) a else b
  val maximize: (Int, Int) => Int = max
  println(maximize(4, 5))
  println(max(5, 6))

  //-----PLACEHOLDER SYNTAX-------

  def tripleOp[A, B, C](a: A, b: B, c: B, f: (A, B, B) => C) = f(a, b, c)

  val test1 = tripleOp[Int, Double, Double](4, 5.5D, 6.5D, _ + _ - _)
  val test2 = tripleOp[Int, Int, Double](4, 7, 6, _ * _ * _)

  println(test1)
  println(test2)

  def add(a: Int)(b: Int) = a + b
  val add2 = add(2) _

  val test3 = add2(5)
  println(test3)

  //------PARTIALLY APPLIED FUNCION AND CURRYING-------

  def multiply(a: Int)(b: Int)(c: Int) = a * b * c
  val multiply3 = multiply(3) _
  val multiply5 = multiply(5) _
  val multiply6 = multiply(6) _

  val test4 = multiply3
  val test41 = test4(5)
  val test411 = test41(6)
  println(test4 + ", " + test41 + ", " + test411)

  def op(a: Int)(b: Int)(c: Int)(f: (Int, Int, Int) => Int) = f(a, b, c)
  val parameters = op(5)(7)(8) _
  val op_* = parameters((a: Int, b: Int, c: Int) => a * b * c)
  val op_+ = parameters((a: Int, b: Int, c: Int) => a + b + c)
  println(op_* + ", " + op_+)

  def uncurriedOp(a: Int, b: Int, f: (Int, Int) => Int) = f(a, b)
  def curriedOp = (uncurriedOp _).curried

  val v5 = curriedOp(5)
  val v6 = v5(6)
  println(v6(_ * _))
  println(v6(_ - _))

  //-------FUNCTION LITERAL BLOCK------

  def stringOps(s: String)(f: String => String) = {
    if (s != null) f(s) else null
  }

  val uuid = java.util.UUID.randomUUID().toString()
  val timedUUID = stringOps(uuid) { s =>
    val now = System.currentTimeMillis
    val timed = s.take(24) + now
    timed.toUpperCase()
  }

  println(timedUUID)
}
