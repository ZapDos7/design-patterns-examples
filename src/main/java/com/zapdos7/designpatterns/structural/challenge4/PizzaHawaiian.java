package com.zapdos7.designpatterns.structural.challenge4;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza {

  static ArrayList<String> toppings = new ArrayList<>();
  static String name = "Hawaiian";

  public PizzaHawaiian() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("ham");
    toppings.add("pineapple");
  }


  public ArrayList<String> getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }

}
