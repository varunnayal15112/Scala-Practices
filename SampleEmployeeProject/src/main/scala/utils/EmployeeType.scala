package utils

object EmployeeType extends Enumeration {
  type EmployeeType = Value

  val fullTimeEmployee = Value("FTE")
  val freshers = Value("FRE")
  val interns = Value("INT")
}
