package Assignments

object ProductOfNumbersInTheRange {
  def MathsOperation(x : Int, y : Int, definedFunction:(Int, Int)=> Int) : Int = definedFunction(x,y)

  def product(x : Int, y : Int,result : Int) : Int = {
    if(x <= y) {
      product(x+1,y,MathsOperation(x,result,_ * _))
    }
    else {
      result
    }
  }

  def main(args: Array[String]): Unit = {
    val startIndex : Int = 1
    val endIndex : Int = 5
    println("Product of numbers between " + startIndex + " and " + endIndex + " is " + product(startIndex,endIndex,1))
  }

}
