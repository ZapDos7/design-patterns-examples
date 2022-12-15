package com.zapdos7.designpatterns.behavioral.challenge8;

public class Fan {

  private State state = new LowState();

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void turnUp() {
    getState().turnUp(this);
  }

  public void turnDown() {
    getState().turnDown(this);
  }

}
