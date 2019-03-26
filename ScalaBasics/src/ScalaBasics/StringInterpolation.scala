package ScalaBasics

object StringInterpolation {
  def main(args: Array[String]) {
    println("Hello, World !")
    val name = "Varun Nayal"
    val age = 22
    //Concatenation Interpolation
    println(name + " is " + age + " years old !")

    //s-string interpolation
    println(s"$name is $age years old !")

    //f-string interpolation
    println(f"$name%s is $age%d years old !")

    //s-string interpolation
    println(s"Varun Nayal \nArmy Institute of Technology Pune")

    //raw-string interpolation
    println(raw"Varun Nayal \nArmy Institute of Technology Pune")

    // single line comment

    /*

      Multiple lines comment

     */
  }
}
