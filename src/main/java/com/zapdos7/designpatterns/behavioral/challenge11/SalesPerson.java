package com.zapdos7.designpatterns.behavioral.challenge11;

public class SalesPerson implements Employee {

  private int salary = 50000;

  public void setSalary(int price) {
    this.salary = price;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
