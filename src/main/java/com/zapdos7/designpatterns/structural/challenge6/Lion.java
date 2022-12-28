package com.zapdos7.designpatterns.structural.challenge6;

public class Lion implements Animal {

  private int[] location = new int[2];

  public String getAnimalType() {
    return "Lion";
  }

  public void setLocation(int latitude, int longitude) {
    location[0] = latitude;
    location[1] = longitude;
  }

  public int[] getLocation() {
    return location;
  }

}
