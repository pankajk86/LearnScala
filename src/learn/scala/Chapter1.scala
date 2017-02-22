package learn.scala

object HelloWorld {
  
  def main(args: Array[String]) {
    println("Hello World to " + (if(args.length > 0) args(0) else "User"))
    
    args.foreach {arg => println(arg)}
    println("==============")    
    args.foreach { arg => (if(arg == "Pankaj") println("Hello Pankaj") else println("blah blah")) }
    println("==============")    
    args.foreach { arg => message(arg) }
  }
  
  def message(name: String): Unit = {
    if(name == "Pankaj") 
      println("Hello Pankaj") 
    else 
      println("blah blah")
  }
  
}