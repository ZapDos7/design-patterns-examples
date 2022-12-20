
package com.zapdos7.designpatterns.creational.exercise5c;

/**
 *
 * @author bethan
 */
public class MountainBikeFactory extends BikeFactory {
    
    @Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new MountainBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new MountainBikeHandlebar();
        } else {
            return null;
        }
    }
    
}
