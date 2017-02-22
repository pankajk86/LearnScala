package learn.scala

object Chapter5 extends App {

  println("""Hello "World!!"
      How you're doing?? """)

  println("\n" + """|Hello "World!!"
      |How you're doing?? """.stripMargin)

  println((2.0).unary_-)

  // Empty parentheses can be removed from the method call
  println
  println
  println("Hello")

  println("Hello World".toLowerCase)
  println("Hello World" toLowerCase)

  println(List(1, 2, 3) == List(1, 5, 3))
}
