package com.zapdos7.behavioraldesignpatterns.exercise10;

public class Main {

  public static void main(String[] args) {
    VegetarianPizza vegetarian = new VegetarianPizza();
    vegetarian.printInstructions();

    MeatFeastPizza meatFeast = new MeatFeastPizza();
    meatFeast.printInstructions();
  }

}
