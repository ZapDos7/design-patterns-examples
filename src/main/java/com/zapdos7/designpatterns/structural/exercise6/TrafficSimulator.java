package com.zapdos7.designpatterns.structural.exercise6;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficSimulator {

  static ArrayList<Vehicle> vehicles = new ArrayList<>();

  public static void main(String[] args) {

    Runnable createVehicles = new Runnable() {
      public void run() {
        createRandomCar();
      }
    };

    Runnable removeVehicles = new Runnable() {
      public void run() {
        removeCar();
      }
    };

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(createVehicles, 0, 3, TimeUnit.SECONDS);
    executor.scheduleAtFixedRate(removeVehicles, 5, 5, TimeUnit.SECONDS);
  }

  private static void createRandomCar() {
    Random random = new Random();
    int randInt = random.nextInt(2);
    Vehicle vehicle = null;
    if(randInt == 0) {
      vehicle = new Car();
    } else if(randInt == 1) {
      vehicle = new Truck();
    }
    vehicle.setLocation(random.nextInt(1000), random.nextInt(1000));
    System.out.println("Creating " + vehicle + ", type: " + vehicle.getType() +
        ", location: " + vehicle.getLocation()[0] + " " + vehicle.getLocation()[1]);
    vehicles.add(vehicle);
  }

  private static void removeCar() {
    System.out.println("Removing " + vehicles.get(0));
    vehicles.remove(0);
  }

}
