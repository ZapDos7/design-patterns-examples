package com.zapdos7.designpatterns.creational.exercise1b;

import java.awt.Color;
import java.awt.Dimension;


/**
 *
 * @author bethan
 */
public class Architect {
    
    public static void main(String[] args) {
        Bedroom room = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(3).setFloorNumber(2).setWallColor(Color.WHITE).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(false).createBedroom();
        Bedroom room2 = new BedroomBuilder().setDimensions(new Dimension(300, 250)).createBedroom();
    }
    
}
