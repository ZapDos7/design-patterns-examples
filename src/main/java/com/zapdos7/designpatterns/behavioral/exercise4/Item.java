package com.zapdos7.designpatterns.behavioral.exercise4;

public class Item {

  private String name;
  private int quantity;

  public Item(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isStocked() {
    return this.quantity > 0;
  }
  
}
