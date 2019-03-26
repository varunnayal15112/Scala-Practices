object Functions {
  /*
  Syntax :
  def < function_name >(< argument : data type>, < argument : data type>,..) : < return data type > = {
    statements();
    return < return variable or result >
    // writing "return" keyword is optional. Scala itself takes the last line of function statements as the return variable
  }
   */
  object MathsOperation {

    def add(x : Int, y : Int) : Int = {
      x + y
    }

    def subtract(x : Int, y : Int) : Int = {
      x - y
    }

    def multiply(x : Int, y : Int) : Int = {
      x * y
    }

    def division(x : Int, y : Int) : Int = {
      x / y
    }

    def square(x : Int) : Int = {
      x * x
    }

    def print(x : Int, y : Int) : Unit = {
      // In case when function does not return anything, the return data type will be "Unit"
      println("Value of x : " + x)
      println("Value of y : " + y)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Addition Result " + MathsOperation.add(10,5))
    println("Subtraction Result " + MathsOperation.subtract(10,5))
    println("Multiplication Result " + MathsOperation.multiply(10,5))
    println("Division Result " + MathsOperation.division(10,5))

    println("Square Result " + MathsOperation.square(5))
    println("Square Result " + (MathsOperation square 5)) // Alternative way of calling single argument functions

    println(MathsOperation.print(10,5))
    println(MathsOperation.print(2,5))
  }

}
