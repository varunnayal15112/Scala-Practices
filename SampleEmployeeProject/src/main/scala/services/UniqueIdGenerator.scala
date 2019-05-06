package services

import utils.EmployeesCount

object UniqueIdGenerator {

  def generateUniqueId() : String = {
    EmployeesCount.incrementEmployeeCount()
    "EMP_" + EmployeesCount.getNumberOfEmployees().toString()
  }
}
