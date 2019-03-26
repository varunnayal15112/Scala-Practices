import org.scalatest.FunSuite

class MathsOperationTest extends FunSuite{

  test("MathsOperation.addition") {
    assert(MathsOperation.addition(10,5) === 15)
  }

  test("MathsOperation.subtraction") {
    assert(MathsOperation.subtraction(10,5) === 5)
  }

  test("MathsOperation.multiplication") {
    assert(MathsOperation.multiplication(10,5) === 50)
  }

  test("MathsOperation.division") {
    assert(MathsOperation.division(10,5) === 2)
  }

  test("MathsOperation.square") {
    assert(MathsOperation.square(5) === 25)
  }

  test("MathsOperation.cube") {
    assert(MathsOperation.cube(3) === 27)
  }
}
