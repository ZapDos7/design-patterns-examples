package com.zapdos7.designpatterns.behavioral.challenge5;

import java.util.ArrayList;

public abstract class PlaneList {
    ArrayList<Plane> planes = new ArrayList<>();

    public void addPlane(Plane plane) {
      planes.add(plane);
    }
  
    public void removePlane(Plane plane) {
      planes.remove(plane);
    }
  
}
