package com.zapdos7.designpatterns.behavioral.challenge4;

public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList staffList = new StaffList(zak, sarah, anna);
    StaffListIterator iterator = new StaffListIterator(staffList);

    while (iterator.hasNext()) {
      Employee employee = iterator.next();
      System.out.println(employee.getName());
    }
  }

}
