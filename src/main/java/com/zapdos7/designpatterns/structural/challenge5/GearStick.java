package com.zapdos7.designpatterns.structural.challenge5;

public class GearStick {

  private int gear = 0;

  public void changeGear(int gear) {
    System.out.println("Changing gear to " + gear);
    this.gear = gear;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  
}
