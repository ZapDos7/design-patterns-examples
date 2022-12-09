package com.zapdos7.behavioraldesignpatterns.exercise5;

public class Driver {

  public void deliver(String item, int amount, Customer customer) {
    System.out.println(amount + " " + item + " out for delivery to " + customer.getAddress());
  }

}
