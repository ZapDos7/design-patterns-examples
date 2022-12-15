package com.zapdos7.designpatterns.behavioral.exercise10;

public class VegetarianPizza extends Pizza{

  public void addToppings() {
    super.addToppings();
    System.out.println("Add peppers");
    System.out.println("Add olives");
  }

  public void cook() {
    System.out.println("Cook in the oven for 15 minutes");
  }


}
