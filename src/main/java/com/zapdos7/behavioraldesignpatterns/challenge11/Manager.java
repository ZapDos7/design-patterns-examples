package com.zapdos7.behavioraldesignpatterns.challenge11;

public class Manager implements Employee {

  private int salary = 60000;

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

}
