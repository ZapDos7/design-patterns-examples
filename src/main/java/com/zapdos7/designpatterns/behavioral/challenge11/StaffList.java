package com.zapdos7.designpatterns.behavioral.challenge11;

import java.util.ArrayList;

public class StaffList implements Employee {

  ArrayList<Employee> salaries = new ArrayList<Employee>();

  public StaffList() {
    Manager manager = new Manager();
    SalesPerson salesPerson1 = new SalesPerson();
    SalesPerson salesPerson2 = new SalesPerson();
    salaries.add(manager);
    salaries.add(salesPerson1);
    salaries.add(salesPerson2);
  }

  public int getSalary() {
    return salaries.stream().mapToInt(Employee::getSalary).sum();
  }

  @Override
  public void accept(Visitor visitor) {
    salaries.forEach(s -> s.accept(visitor));
    visitor.visit(this);
  }

}
