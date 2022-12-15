package com.zapdos7.designpatterns.behavioral.challenge5;

public class Mediator {
    private Plane plane;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;
    private Runway runway;


    public Mediator() {
        plane = new Plane(123);
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
        runway = new Runway();
    }

    public Mediator(int id) {
        plane = new Plane(id);
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
        runway = new Runway();
    }

    public void takeOff() {
        if(!plane.isInTheAir() && runway.getIsAvailable()) {
          System.out.println("Plane " + plane.getId() + " is taking off...");
          planesOnGround.removePlane(plane);
          planesInFlight.addPlane(plane);
          plane.setInTheAir(true);
          runway.setIsAvailable(false);
        }
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public PlanesInFlight getPlanesInFlight() {
        return planesInFlight;
    }

    public void setPlanesInFlight(PlanesInFlight planesInFlight) {
        this.planesInFlight = planesInFlight;
    }

    public PlanesOnGround getPlanesOnGround() {
        return planesOnGround;
    }

    public void setPlanesOnGround(PlanesOnGround planesOnGround) {
        this.planesOnGround = planesOnGround;
    }

    public Runway getRunway() {
        return runway;
    }

    public void setRunway(Runway runway) {
        this.runway = runway;
    }

    
}
