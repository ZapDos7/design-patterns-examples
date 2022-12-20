package com.zapdos7.designpatterns.creational.exercise1b;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author bethan
 */
public interface Builder {

    Builder setCeilingHeight(int ceilingHeight);

    Builder setDimensions(Dimension dimensions);

    Builder setFloorNumber(int floorNumber);

    Builder setNumberOfDoors(int numberOfDoors);

    Builder setNumberOfWindows(int numberOfWindows);
    
    Builder setWallColor(Color wallColor);
    
}
