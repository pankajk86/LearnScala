package learn.scala

/**
 * @author pankajkumar
 *
 * Companion Object: It contains, kind of Java static methods.
 * From Scala 2.11.x onwards, we can use App trait to avoid writing
 * main method.
 */
object Chapter3 extends App {

  //  def main(args: Array[String]) {
  //    Chapter3.publish()
  //  }

  Chapter3.publish()

  def publish(): Unit = {
    val chap3 = new Chapter3()
    chap3.welcome()
  }
}

/**
 * Companion class
 */
class Chapter3 {

  private var s = "Hello Chapter 3"

  def welcome() = println(s + " reader!!")
}
