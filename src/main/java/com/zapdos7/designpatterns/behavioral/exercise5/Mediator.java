package com.zapdos7.designpatterns.behavioral.exercise5;

public class Mediator {

  private Customer customer;
  private ECommerceSite site;
  private Driver driver;

  public Mediator() {
    customer = new Customer("123 Sunny Street");
    site = new ECommerceSite();
    driver = new Driver();
  }

  public void buy(String item, int amount) {
    if(site.checkInStock(item, amount)) {
      site.sell(item, amount);
      driver.deliver(item, amount, customer);
    }
  }
}
