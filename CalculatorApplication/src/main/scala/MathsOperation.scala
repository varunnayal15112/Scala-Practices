object MathsOperation {

  def mathsOperation(x : Int, y : Int, definedFunction : (Int, Int) => Int) : Int = definedFunction(x,y)

  def addition(x : Int, y : Int) : Int = {
    mathsOperation(x,y,_ + _)
  }

  def subtraction(x : Int, y : Int) : Int = {
    mathsOperation(x,y,_ - _)
  }

  def multiplication(x : Int, y : Int) : Int = {
    mathsOperation(x,y,_ * _)
  }

  def division(x : Int, y : Int) : Int = {
    mathsOperation(x,y,_ / _)
  }

  def square(x : Int) : Int = {
    mathsOperation(x,x,_ * _)
  }

  def cube(x : Int) : Int = {
    mathsOperation(x,mathsOperation(x,x,_ * _),_ * _)
  }
}
