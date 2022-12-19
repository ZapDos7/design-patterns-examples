package com.zapdos7.designpatterns.creational.exercise1a;

import java.awt.Color;
import java.awt.Dimension;


public class Architect {
    
    public static void main(String[] args) {
        Bedroom room1 = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(3).setFloorNumber(2).setWallColor(Color.WHITE).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(false).createRoom();
        Bedroom room2 = new BedroomBuilder().setDimensions(new Dimension(300, 250)).createRoom();

        System.out.println("Room1: " + room1 + "\nRoom2: " + room2);
    }
    
}
