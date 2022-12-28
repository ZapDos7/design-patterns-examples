package com.zapdos7.designpatterns.structural.challenge4;

import java.util.ArrayList;

public class PizzaExtraCheese implements Pizza {

  ArrayList<String> toppings;
  Pizza pizza;

  public PizzaExtraCheese(Pizza pizza) {
    this.pizza = pizza;
    toppings = pizza.getToppings();
    toppings.add("extra cheese");
  }

  public ArrayList<String> getToppings() {
    return this.toppings;
  }

  public String getName() {
    return pizza.getName();
  }

}
