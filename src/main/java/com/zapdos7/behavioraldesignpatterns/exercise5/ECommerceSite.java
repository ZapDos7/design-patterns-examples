package com.zapdos7.behavioraldesignpatterns.exercise5;

import java.util.HashMap;

public class ECommerceSite {

  private Customer customer;
  private Driver driver;
  private HashMap<String, Integer> stock;


  public ECommerceSite(Customer customer) {
    this.customer = customer;
    this.driver = new Driver();
    stock = new HashMap();
    stock.put("pens", 100);
    stock.put("pencils", 50);
    stock.put("erasers", 75);
  }

  public boolean checkInStock(String item, int quantity) {
    if (stock.containsKey(item) && stock.get(item) > quantity) {
      return true;
    } else {
      return false;
    }
  }

  public void sell(String item, int quantity) {

    int newQuantity = stock.get("pens") - quantity;
    stock.put(item, newQuantity);

    driver.deliver(item, quantity, customer);
  }



}
