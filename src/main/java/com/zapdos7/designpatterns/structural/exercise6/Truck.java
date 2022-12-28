package com.zapdos7.designpatterns.structural.exercise6;

public class Truck implements Vehicle {

  private int[] location = new int[2];

  public String getType() {
    return "Truck";
  }

  public void setLocation(int latitude, int longitude) {
    location[0] = latitude;
    location[1] = longitude;
  }

  public int[] getLocation() {
    return location;
  }

}
