package com.zapdos7.designpatterns.behavioral.exercise4;

public class Main {

  public static void main(String[] args) {

    Item pens = new Item("pens", 175);
    Item pencils = new Item("pencils", 0);
    Item paper = new Item("paper", 500);

    Inventory inventory = new Inventory(pens, pencils, paper);

    StockIterator stockIterator = inventory.iterator();

    while (stockIterator.hasNext()) {
      System.out.println(stockIterator.next().getName());
    }
  }

}
