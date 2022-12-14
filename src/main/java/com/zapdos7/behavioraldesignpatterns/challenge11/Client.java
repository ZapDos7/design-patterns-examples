package com.zapdos7.behavioraldesignpatterns.challenge11;

public class Client {

  public static void main(String[] args) {
    StaffList staffList = new StaffList();
    System.out.println("Total amount paid to staff: " + staffList.getSalary());
  }

}
