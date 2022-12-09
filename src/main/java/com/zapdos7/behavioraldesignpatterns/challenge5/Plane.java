package com.zapdos7.behavioraldesignpatterns.challenge5;

public class Plane {

  private boolean isInTheAir;
  private int id;

  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
  }

  public boolean isInTheAir() {
    return isInTheAir;
  }

  public void setInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
