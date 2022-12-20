
package com.zapdos7.designpatterns.creational.exercise5b;

/**
 *
 * @author bethan
 */
public class RoadBikeFactory extends BikeFactory {
    
    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }
    
    @Override
    public Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }
    
}
