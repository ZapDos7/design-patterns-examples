package com.zapdos7.designpatterns.creational.exercise4c;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class HardCandyFactory extends CandyFactory {

    @Override
    public Candy getCandy(String type) {
        switch (type) {
            case "candycane":
                return new HardCandy_CandyCane();
            case "lollipop":
                return new HardCandy_Lollipop();
            case "peppermint":
                return new HardCandy_Peppermint();
            default:
                return new HardCandy_CandyCane();
        }

    }

    @Override
    public ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        if(quantity % 10 != 0) {
            System.out.println("Hard candy must be packaged in multiples of 10.");
            return null;
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
