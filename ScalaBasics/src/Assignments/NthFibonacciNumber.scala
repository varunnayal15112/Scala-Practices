package Assignments

/*
Problem Statement => Write a tail recursive function for Nth Fibonacci Number
 */
object NthFibonacciNumber {

  def MathsOperation(x : Int, y : Int, definedFunction : (Int, Int) => Int) : Int = definedFunction(x,y)

  def NthFibonacciNumber(x : Int, y : Int, numberOfIteration : Int) : Int = {
    if(numberOfIteration != 0) {
      NthFibonacciNumber(y,MathsOperation(x,y,_ + _),numberOfIteration-1)
    }
    else {
      y
    }
  }

  def main(args: Array[String]): Unit = {
    val num : Int = 8
    println(num + "th Fibonacci Number is " + NthFibonacciNumber(0,1,num-2))
  }

}
