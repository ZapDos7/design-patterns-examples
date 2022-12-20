package com.zapdos7.designpatterns.creational.exercise4c;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class CandyFactory {

    public abstract Candy getCandy(String type);

    public ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
