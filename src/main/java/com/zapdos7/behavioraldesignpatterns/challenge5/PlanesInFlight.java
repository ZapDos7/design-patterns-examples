package com.zapdos7.behavioraldesignpatterns.challenge5;

import java.util.ArrayList;

public class PlanesInFlight {

  ArrayList<Plane> planes = new ArrayList<>();

  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  public void removePlane(Plane plane) {
    planes.remove(plane);
  }

}
