package learn.scala

object LearningScalaCh1 extends App {

  val n = 128
  val ch = (n).toChar
  val nn = (ch).toInt
  println(ch + ", " + nn)

  // regex
  val input = "Enjoying this apple 3.14159 times today"
  val pattern = """.* apple ([\d.]+) times .*""".r
  val pattern(amountText) = input
  println(amountText.toDouble)

  val input2 = "Frank,123 Main,925-555-1943,95122"
  val pattern2 = """.*([\d]{3}-[\d]{3}-[\d]{4}).*""".r
  val pattern2(phone) = input2
  println(phone)

  //  val phoneParts = phone.split('-')
  //  val tupleList = new ListBuffer[(String, Int)]()
  //  tupleList.+= (phoneParts(0), phoneParts(0).toInt)
}
