object ForLoop {
  def main(args : Array[String]): Unit = {
    // Implementation of For Loop in Scala

    /*
    Structure of For Loop in Scala
    for (< variable name > < generator denoted by "<-" >  < range >) {
      statements();
     }
     */

    /*
    There are two ways of defining the range in for loop in scala
    1. using "to" keyword
    2. using "until" keyword

    using "to" keyword --
    "1 to 5" means (1,2,3,4,5)
    actually to is a method which is used internally as <starting index>.to(ending index) for example 1.to(5)

    using "until" keyword --
    "1 until 5" means (1,2,3,4)
    actually until is a method which is used internally same as "to" method <starting index>.until(ending index)
    but it does not include the last index of range
     */

    for(a <- 1 to 5) {
      println("a using to " + a)
    }

    for(a <- 1 until 5) {
      println("a using until " + a)
    }

    for(a <- 1.to(5)) {
      println("a using to " + a)
    }

    for(a <- 1.until(5)) {
      println("a using until " + a)
    }

    /*
    Nested for loops in scala
    means defining multiple ranges

    for(outer range act as outer loop ; inner range act as inner loop) {
      statements();
    }
     */
    for(i <- 1 to 5; j <- 1 to 3) {
      println("(i,j) is (" + i + "," + j + ")")
    }

    /*
    for loop to iterate over list
     */
    val my_list = List(1,2,3,4,5,6,7,8,9,10);
    for(i <- my_list) {
      println("i using list my_list -> " + i)
    }

    /*
    Filtering Condition can also be provided in the for loop to filter some elements based on some condition
    for(range ; filter condition) {
      statements();
    }
     */
    for(i <- my_list ; if i<=5) {
      println("i using filters is " + i)
    }

    /*
    Till now we see the usage of for loops in executing statements. For loops can also be used in expressions
    var response = for { range ; filter condition if any} yield { result on each iteration }
     */
    var response = for {i <- my_list ; if i < 6} yield { i*i }
    println(response)

  }
}
