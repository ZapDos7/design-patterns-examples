package com.zapdos7.behavioraldesignpatterns.challenge9;

public interface Account {
    void makePayment(int amount);
    
    Account bankAccount = (int amount) -> System.out.println("Payment of $" + amount + " made from bank account.");
    Account payPalAccount = (int amount) -> System.out.println("Payment of $" + amount + " made from PayPal account.");
}
