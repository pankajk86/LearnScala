package learn.scala.classes

class Fruit(var name: String) {

  def eatenBy(user: String): Unit = { println(user + " is eating " + name) }
}
