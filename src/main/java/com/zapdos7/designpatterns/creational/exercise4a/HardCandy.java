
package com.zapdos7.designpatterns.creational.exercise4a;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class HardCandy extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            Chocolate chocolate = new Chocolate();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " hard candy has been made!");
        return chocolatePackage;

    }

}
