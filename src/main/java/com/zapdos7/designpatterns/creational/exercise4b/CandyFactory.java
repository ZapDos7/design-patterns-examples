package com.zapdos7.designpatterns.creational.exercise4b;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class CandyFactory {

    public Candy getCandy(String section) {
        switch (section) {
            case "dark":
                return new Chocolate_dark();
            case "white":
                return new Chocolate_white();
            case "milk":
                return new Chocolate_milk();
            case "candycane":
                return new HardCandy_CandyCane();
            case "lollipop":
                return new HardCandy_Lollipop();
            case "peppermint":
                return new HardCandy_Peppermint();
            default:
                return new Chocolate_milk();
        }
    }

    public ArrayList getCandyPackage(int quantity, String type, String section) {
        Candy candy = getCandy(type);
        
        if (section.equals("hard candy")) {
            if (quantity % 10 != 0) {
                System.out.println("Hard candy must be packaged in multiples of 10.");
                return null;
            }
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
