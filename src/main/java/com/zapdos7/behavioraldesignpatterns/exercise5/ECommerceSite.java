package com.zapdos7.behavioraldesignpatterns.exercise5;

import java.util.HashMap;

public class ECommerceSite {

  private HashMap<String, Integer> stock;

  public ECommerceSite() {
    stock = new HashMap();
    stock.put("pens", 100);
    stock.put("pencils", 50);
    stock.put("paper", 500);
  }

  public void sell(String item, int amount) {
    int newAmount = stock.get("pens") - amount;
    stock.put(item, newAmount);
  }

  public boolean checkInStock(String item, int amount) {
    if (stock.containsKey(item) && stock.get(item) > amount) {
      return true;
    } else {
      return false;
    }
  }
}
