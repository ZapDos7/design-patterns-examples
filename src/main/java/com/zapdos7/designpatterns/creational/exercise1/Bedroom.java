package com.zapdos7.designpatterns.creational.exercise1;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author bethan
 */
public class Bedroom {  
    
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;
    
    public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite){
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;        
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;        
    }
    
}
