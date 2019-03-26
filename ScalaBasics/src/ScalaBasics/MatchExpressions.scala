package ScalaBasics

object MatchExpressions {
  def main(args: Array[String]): Unit = {
    /*
    Match Expressions is just like a "Switch" Statement
    "match" keyword is used
    syntax :
    < argument > match {
      case xyz => statements;
      case abc => statements;
      case _ => default case;
    }
     */

    // Match as "Statements"
    val grade : String = "O";
    grade match {
        case "O" => println("First Class with Distinction");
        case "A" => println("First Class");
        case "B" => println("Second Class");
        case _ => println("Fail");
    }

    // Match as "Expression"
    val response : String = grade match {
      case "O" => "First Class with Distinction";
      case "A" => "First Class";
      case "B" => "Second Class";
      case _ => "Fail";
    }

    println("Result is " + response)

    val i : Int = 5
    i match {
        case 1|3|5|7|9 => println("Odd Number")
        case 2|4|6|8|10 => println("Even Number")
        case _ => println("Not in Range (1,10)")
    }



  }

}
