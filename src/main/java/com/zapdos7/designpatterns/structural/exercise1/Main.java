package com.zapdos7.designpatterns.structural.exercise1;

public class Main {

  public static void main(String[] args) {
    CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford", 3);
    printVehiclePrice(carPriceCalculator);

    TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
    printVehiclePrice(truckPriceCalculator);

  }

  public static void printVehiclePrice(PriceCalculator calculator) {
    String price = calculator.calculatePrice();
    System.out.println("The price of vehicle is: " + price);
  }

}
