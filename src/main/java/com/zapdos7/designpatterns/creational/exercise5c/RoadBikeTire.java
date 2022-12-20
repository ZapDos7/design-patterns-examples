
package com.zapdos7.designpatterns.creational.exercise5c;

/**
 *
 * @author bethan
 */
public class RoadBikeTire extends Tire {
    
    private static final String width = "NARROW";
    private static final String pressure = "HIGH";
    
    @Override
    public void getDescription() {
        System.out.println("Road bike tire width: " + width + ", pressure: " + pressure);        
    }
    
}
