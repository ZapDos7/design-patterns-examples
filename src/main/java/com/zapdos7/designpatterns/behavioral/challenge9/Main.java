package com.zapdos7.designpatterns.behavioral.challenge9;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.makePayment(Account.bankAccount,100);
  }

}
