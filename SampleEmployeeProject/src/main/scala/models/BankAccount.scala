package models

class BankAccount(private var accountNumber : String,
                  private var currentBalance : Int,
                  private var employeeSalary : Int) {

  def printDetailsOfBankAccount(): Unit = {
    println("Account Number : " + accountNumber)
    println("Current Balance : " + currentBalance)
    println("Current Salary : " + employeeSalary)
  }

  def genericOperation(x:Int,y:Int,definedFunction:(Int,Int)=>Int):Int = definedFunction(x,y)

  def updateSalaryOfEmployee(hikePercentage : Int): Boolean = {
    employeeSalary = genericOperation(employeeSalary,hikePercentage,(x,y)=>x+((y*x)/100))
    true
  }

  def salaryCredit(): Boolean= {
    currentBalance = genericOperation(currentBalance,employeeSalary,(x,y)=>x+y)
    true
  }

  def withdrawBalance(amountToBeWithdrawn : Int): Boolean = {
    if(currentBalance<amountToBeWithdrawn) {
      println("Cannot Process the Transaction <Invalid Transaction>")
      false
    }
    else
    currentBalance = genericOperation(currentBalance,amountToBeWithdrawn,(x,y)=>x-y)
    true
  }

  def getEmployeeSalary() : Int = {
    employeeSalary
  }

  def getCurrentBalance() : Int = {
    currentBalance
  }
}