package com.zapdos7.designpatterns.structural.challenge7;

public class Item {

  private String name;
  private double price;
  private int quantity;

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return name + ", price: $" + price + ", quantity: " + quantity;
  }

}
