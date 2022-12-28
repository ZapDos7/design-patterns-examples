package com.zapdos7.designpatterns.structural.challenge4;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza {

  static ArrayList toppings = new ArrayList<String>();
  static String name = "Margherita";

  public PizzaMargherita() {
    toppings.add("cheese");
    toppings.add("tomato");
  }


  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }



}
