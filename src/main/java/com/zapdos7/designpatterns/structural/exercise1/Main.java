package com.zapdos7.designpatterns.structural.exercise1;

import org.example.UKCarPriceCalculator;

public class Main {

  public static void main(String[] args) {
    CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford", 3);
    printVehiclePrice(carPriceCalculator);

    TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
    printVehiclePrice(truckPriceCalculator);

    UKCarPriceCalculator uKCarPriceCalculator = new UKCarPriceCalculator("BMW", 7);
    // we can't call printVehiclePrice() as it expects a PriceCalculator

    // solution: Adapter!
    Adapter adapter = new Adapter(uKCarPriceCalculator);
    printVehiclePrice(adapter);
  }

  public static void printVehiclePrice(PriceCalculator calculator) {
    String price = calculator.calculatePrice();
    System.out.println("The price of vehicle is: " + price);
  }

}
