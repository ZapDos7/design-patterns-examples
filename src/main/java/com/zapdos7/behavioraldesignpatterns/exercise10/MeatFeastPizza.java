package com.zapdos7.behavioraldesignpatterns.exercise10;

public class MeatFeastPizza extends Pizza {

  public void addToppings() {
    super.addToppings();
    System.out.println("Add pepperoni");
    System.out.println("Add ham");
    System.out.println("Add chicken");
  }

  public void cook() {
    System.out.println("Cook in the oven for 20 minutes");
  }

}
