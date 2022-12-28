package com.zapdos7.designpatterns.structural.challenge7;

public class Store {

  private String name;
  private String location;
  private Inventory inventory;

  public Store(String name, String location, Inventory inventory) {
    this.name = name;
    this.location = location;
    this.inventory = inventory;
  }

  public void printName() {
    System.out.println(name);
  }

  public void printLocation() {
    System.out.println(location);
  }

  public void printInventory() {
    for(Item item : inventory.getInventory()) {
      System.out.println(item);
    }
  }

}
