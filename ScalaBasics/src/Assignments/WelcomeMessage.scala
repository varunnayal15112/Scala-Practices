package Assignments

object WelcomeMessage {

  def myUpperCase(str: String): String ={
    str.toUpperCase
  }

  def printWelcomeMsg(str: String, str1: String): Unit = {
    val resultString : String = myUpperCase(str) + " " + str1
    println(resultString)
  }

  def main(args: Array[String]): Unit = {
    val string1 : String = "Varun"
    val string2 : String = "Nayal"
    printWelcomeMsg(string1,string2)
  }

  def func(x:Int):Int = {
    var y =x
    y += 1
    y
  }

  print(func(5))

}
