package com.zapdos7.designpatterns.behavioral.challenge11;

public class SalaryVisitor implements Visitor {

  public void visit(Manager manager) {
    manager.setSalary(50000);
  }

  public void visit(SalesPerson salesPerson) {
    salesPerson.setSalary(70000);
  }

  public void visit(StaffList staffList) {
    System.out.println("Salary changes applied");
  }

}
