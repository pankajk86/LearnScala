package learn.scala

import learn.scala.classes.Rational

object Chapter6 extends App {

  val rational0 = new Rational(1, 0)
  println(rational0)

  val rational1 = new Rational(1, 10)
  println(rational1)

  val rational2 = new Rational(4, 5) + new Rational(7, 6)
  println(rational2)

  val rational3 = new Rational(2, 3) + new Rational(7)
  println(rational3)

  println(new Rational(55, 44))

  val rational4 = new Rational(4, 5) * new Rational(7, 6)
  println(rational4)

  val rational5 = new Rational(4, 5) * 2
  println(rational5)

  // Until Chapter 21
  //  val rational6 = 2 * new Rational(4, 5)
  //  println(rational6)
}
