package com.zapdos7.behavioraldesignpatterns.exercise11;

public class Client {

  public static void main(String[] args) {
    GroceryList groceryList = new GroceryList();
    System.out.println("Total price of grocery list: " + groceryList.getPrice());
  }

}