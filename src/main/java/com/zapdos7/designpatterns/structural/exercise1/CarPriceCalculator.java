package com.zapdos7.designpatterns.structural.exercise1;

public class CarPriceCalculator implements PriceCalculator {

  private int age;
  private String model;
  public static int averageCarPrice = 6000;

  public CarPriceCalculator(String model, int age) {
    this.model = model;
    this.age = age;
  }

  public int getRetailPrice() {
    switch (model) {
      case "Ford":
        return 3000;
      case "Audi":
        return 5000;
      case "BMW":
        return 7000;
      case "Tesla":
        return 10000;
      default:
        return averageCarPrice;
    }
  }

  @Override
  public String calculatePrice() {
    int price = Math.max(getRetailPrice() - (age * 100), 0);
    return price + "USD";
  }

}
