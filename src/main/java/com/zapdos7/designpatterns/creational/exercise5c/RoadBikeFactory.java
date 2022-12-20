
package com.zapdos7.designpatterns.creational.exercise5c;

/**
 *
 * @author bethan
 */
public class RoadBikeFactory extends BikeFactory {

    @Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new RoadBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new RoadBikeHandlebar();
        } else {
            return null;
        }
    }
    
}
