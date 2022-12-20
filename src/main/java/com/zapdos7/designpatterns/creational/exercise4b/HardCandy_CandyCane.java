package com.zapdos7.designpatterns.creational.exercise4b;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class HardCandy_CandyCane extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            HardCandy_CandyCane candyCane = new HardCandy_CandyCane();
            hardCandyPackage.add(candyCane);
        }

        System.out.println(quantity + " packages of 10 candy canes has been made!");
        return hardCandyPackage;

    }

}
