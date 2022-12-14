package com.zapdos7.behavioraldesignpatterns.challenge9;

public class Customer {

  public void makeBankAccountPayment(int amount) {
    System.out.println("Payment of $" + amount + " made from bank account.");
  }

  public void makePayPalPayment(int amount) {
    System.out.println("Payment of $" + amount + " made from PayPal.");
  }


}
