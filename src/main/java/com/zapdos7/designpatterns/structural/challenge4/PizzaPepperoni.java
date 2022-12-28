package com.zapdos7.designpatterns.structural.challenge4;

import java.util.ArrayList;

public class PizzaPepperoni implements Pizza {

  static ArrayList<String> toppings = new ArrayList<>();
  static String name = "Pepperoni";

  public PizzaPepperoni() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("pepperoni");
  }


  public ArrayList<String> getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }

}
