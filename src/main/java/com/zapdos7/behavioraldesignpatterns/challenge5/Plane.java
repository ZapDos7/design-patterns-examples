package com.zapdos7.behavioraldesignpatterns.challenge5;

public class Plane {

  private boolean isInTheAir;
  private int id;
  private Runway runway;
  private PlanesInFlight planesInFlight;
  private PlanesOnGround planesOnGround;


  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
    runway = new Runway();
    planesInFlight = new PlanesInFlight();
    planesOnGround = new PlanesOnGround();
    planesOnGround.addPlane(this);
  }

  public void takeOff() {
    if(!isInTheAir && runway.getIsAvailable()) {
      System.out.println("Plane " + id + " is taking off...");
      planesOnGround.removePlane(this);
      planesInFlight.addPlane(this);
      isInTheAir = true;
      runway.setIsAvailable(false);
    }

  }

  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  public int getId() {
    return id;
  }
}
