package ScalaBasics

object IfElse {
  def main(args: Array[String]): Unit = {
    /*
    Here, we will see two kinds of approaches to use the If-Else
    1. If-Else for control statements
    2. If-Else for Expressions statements
     */
    var a: Int = 20
    var b: Int = 30

    if(a==20) {
      println("a is equal to 20")
    }
    else {
      println("a is not equal to 20")
      }

    // we can also store result of if-else expressions in some variable "response"
    var response = if(a==20) "a is equal to 20" else "a is not equal to 20"
    println(response)

    // another way to print the result of evaluation of If-Else expression
    println(if(a==20) "a is equal to 20" else "a is not equal to 20")

    //Similarly, we can use && (and) operator, || (or) operator to evaluate multiple conditions
    //in If-Else statements or expressions

    if(a==20 && b==30) {
      println("a==20 and b==30")
    }
    else {
      println("Invalid Condition")
    }

  }

}
