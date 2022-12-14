package com.zapdos7.behavioraldesignpatterns.exercise11;

import java.util.ArrayList;

public class GroceryList implements Groceries {

  ArrayList<Groceries> groceries = new ArrayList<Groceries>();

  public GroceryList() {
    Bread bread = new Bread();
    Bread bread2 = new Bread();
    Milk milk = new Milk();
    groceries.add(bread);
    groceries.add(milk);
    groceries.add(bread2);
  }

  public double getPrice() {
    return groceries.stream().mapToDouble(Groceries::getPrice).sum();
  }

}
