
package com.zapdos7.designpatterns.creational.exercise1c;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author bethan
 */
public class Room {
   
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    
    
    public Room(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }
    
}
