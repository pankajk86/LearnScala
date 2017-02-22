package learn.scala.classes

class Rational(n: Int, d: Int) {

  //require(d != 0)

  try {
    require(d != 0)
  } catch {
    case ex: IllegalArgumentException => {
      println("Illegal Argument(s).")
    }
  }

  private val g = gcd(n.abs, d.abs)
  val num: Int = n / g
  val den: Int = d / g

  // Auxiliary Constructor
  def this(n: Int) = this(n, 1)

  override def toString() = num + "/" + den

  def +(that: Rational): Rational = {
    new Rational(num * that.den + d * that.num, den * that.den)
  }

  def *(that: Rational): Rational = {
    val numer = this.num * that.num
    val denom = this.den * that.den
    val g = gcd(numer.abs, denom.abs)

    new Rational(numer / g, denom / g)
  }

  def *(that: Int): Rational = {
    val numer = this.num * that
    val g = gcd(numer.abs, den.abs)

    new Rational(numer / g, den / g)
  }

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // will have to figure it out: why not working. // Chapter 21
  implicit def intToRational(x: Int) = new Rational(x)
}
