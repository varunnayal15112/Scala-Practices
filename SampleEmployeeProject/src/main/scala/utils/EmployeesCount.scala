package utils

object EmployeesCount {
  var numberOfEmployees = 0;

  def incrementEmployeeCount(): Unit = {
    numberOfEmployees += 1
  }

  def getNumberOfEmployees() : Int = {
    numberOfEmployees
  }
}
