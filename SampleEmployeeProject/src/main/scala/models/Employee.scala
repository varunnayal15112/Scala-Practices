package models

import services.UniqueIdGenerator
import utils.EmployeeTeam.EmployeeTeam
import utils.EmployeeType.EmployeeType

class Employee(private var employeeName : String,
               private var employeeDepartment : String,
               private var employeeType : EmployeeType,
               private var employeeTeam : EmployeeTeam,
               private var employeeBankAccount: BankAccount) {

  private var employeeID : String = UniqueIdGenerator.generateUniqueId()

  def printDetailsOfEmployee()= {
    println("Employee Name : " + employeeName)
    println("Employee ID : " + employeeID)
    println("Employee Department : " + employeeDepartment)
    println("Employee Type : " + employeeType)
    println("Employee Team : " + employeeTeam)
    employeeBankAccount.printDetailsOfBankAccount()
  }
}
