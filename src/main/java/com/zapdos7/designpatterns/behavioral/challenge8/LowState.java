package com.zapdos7.designpatterns.behavioral.challenge8;

public class LowState implements State {

  @Override
  public void turnUp(Fan fan) {
    fan.setState(new MediumState());
    System.out.println("Fan is on medium");
  }

  @Override
  public void turnDown(Fan fan) {

  }
}
