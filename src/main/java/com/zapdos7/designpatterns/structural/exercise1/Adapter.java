package com.zapdos7.designpatterns.structural.exercise1;

import org.example.UKCarPriceCalculator;

public class Adapter implements PriceCalculator {

  UKCarPriceCalculator calculator;

  public Adapter(UKCarPriceCalculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public String calculatePrice() {
    return calculator.getPrice() + " GBP";
  }
}
