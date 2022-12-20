
package com.zapdos7.designpatterns.creational.exercise5b;

/**
 *
 * @author bethan
 */
public class MountainBikeFactory extends BikeFactory {
    
    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }
    
    @Override
    public Handlebar createHandlebar() {
        return new MountainBikeHandlebar();
    }
    
}
