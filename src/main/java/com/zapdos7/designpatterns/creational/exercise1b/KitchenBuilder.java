package com.zapdos7.designpatterns.creational.exercise1b;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author bethan
 */
public class KitchenBuilder implements Builder{
    
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;
    
    public KitchenBuilder() {}
    
    @Override
    public KitchenBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    @Override
    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public KitchenBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }
    
    
}
