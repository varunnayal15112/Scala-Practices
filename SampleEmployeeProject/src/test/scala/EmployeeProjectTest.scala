import models.{BankAccount, Employee}
import org.scalatest.FunSuite
import utils.{EmployeeTeam, EmployeeType}

class EmployeeProjectTest extends FunSuite{

  val employee1 = new Employee("Varun Nayal","Software Developer",
    EmployeeType.interns,EmployeeTeam.tempus,new BankAccount("20241557172",0,15000))
  val employee2 = new Employee("Ved Pal","Platform Engineer",
    EmployeeType.interns,EmployeeTeam.murphy,new BankAccount("12345678901",0,15000))
  val employee3 = new Employee("Harish Sharma","Web Designer",
    EmployeeType.freshers,EmployeeTeam.cons,new BankAccount("09876543210",0,15000))

  val bankCustomer1 = new BankAccount("20241557172",0,15000)

  test("Employee.printDetailsOfEmployee") {
    employee1.printDetailsOfEmployee()
    employee2.printDetailsOfEmployee()
    employee3.printDetailsOfEmployee()
  }

  test("BankAccount.salaryCredit") {
    val expectedBalanceAfterSalaryCredit = bankCustomer1.getCurrentBalance()+bankCustomer1.getEmployeeSalary()
    bankCustomer1.salaryCredit()
    assert(bankCustomer1.getCurrentBalance() === expectedBalanceAfterSalaryCredit)
  }

  test("BankAccount.withdrawBalance") {
    val amountToBeWithdrawn = 5000
    val expectedBalanceAfterWithdrawn = bankCustomer1.getCurrentBalance() - amountToBeWithdrawn
    expectedBalanceAfterWithdrawn match {
      case x if x < 0 => assert(bankCustomer1.withdrawBalance(amountToBeWithdrawn) === false)
      case _  => assert(bankCustomer1.withdrawBalance(amountToBeWithdrawn) === true)
    }
  }
}
