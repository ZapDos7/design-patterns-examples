package com.zapdos7.designpatterns.structural.exercise6;

import java.util.HashMap;

public class VehicleFactory {
    private HashMap<Integer, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicle(int type) {
      if(vehicles.containsKey(type)) {
        return vehicles.get(type);
      } else {
        Vehicle vehicle = null;
        if(type == 0) {
          vehicle = new Car();
        } else if(type == 1) {
          vehicle = new Truck();
        }
        vehicles.put(type, vehicle);
        return vehicle;
      }
    }
}
