package ScalaBasics

object WhileLoopDoWhileLoop {
  def main(args : Array[String]): Unit = {
    // Implementation of While and Do-While Loop in Scala

    /*
    Statments like X++ or X-- are not allowed in Scala
    only X += 1 or X -= 1 are allowed in Scala
     */

    //While Loop -> Entry Control Loop
    var x = 0
    while (x < 10) {
      println("x = " + x)
      x += 1
    }

    //Do-While Loop -> Exit Control Loop
    var y=0
    do {
      println("y = " + y)
      y += 1
    } while(y < 10) ;

    //Do-While Loop -> Executes once even if condition is false
    var z = 0
    do {
      println("z = " + z)
    } while(z < 0);
  }

}
