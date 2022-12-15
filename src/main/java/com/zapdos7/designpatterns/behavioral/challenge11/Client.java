package com.zapdos7.designpatterns.behavioral.challenge11;

public class Client {

  public static void main(String[] args) {
    StaffList staffList = new StaffList();
    System.out.println("Total amount paid to staff: " + staffList.getSalary());
    staffList.accept(new SalaryVisitor());
    System.out.println("New amount paid to staff: " + staffList.getSalary());
  }

}
