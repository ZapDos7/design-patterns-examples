package com.zapdos7.designpatterns.structural.challenge7;

import java.util.ArrayList;

public class SuperstoreInventory implements Inventory {

  ArrayList<Item> inventory = new ArrayList<>();

  public SuperstoreInventory() {
    inventory.add(new Item("Bread", 1, 500));
    inventory.add(new Item("Milk", 0.5, 400));
    inventory.add(new Item("Eggs", 0.7, 300));
    inventory.add(new Item("Coffee", 4, 100));
    inventory.add(new Item("Ham", 2, 300));
    inventory.add(new Item("Orange juice", 0.2, 400));
    inventory.add(new Item("Cereal", 1, 400));
    inventory.add(new Item("Butter", 0.3, 300));
    inventory.add(new Item("Pasta", 1, 300));
    inventory.add(new Item("Apples", 0.2, 200));
    inventory.add(new Item("Bananas", 0.2, 200));
    inventory.add(new Item("Onions", 0.1, 500));
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

}
