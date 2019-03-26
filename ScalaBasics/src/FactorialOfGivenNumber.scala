/*
Problem Statement => Write a tail recursive function to find factorial of given number
 */

object FactorialOfGivenNumber {

  def MathsOperation(x : Int, y : Int, definedFunction : (Int, Int) => Int) : Int = definedFunction(x,y)

  def factorial(num : Int, result : Int) : Int = {
    if(num > 0) {
      factorial(num-1,MathsOperation(num,result,_ * _))
    }
    else {
      result
    }
  }

  def main(args: Array[String]): Unit = {
    val num : Int = 6
    println("Factorial of given number " + num + " is " + factorial(num,1))
  }

}
