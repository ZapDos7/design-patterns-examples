
package com.zapdos7.designpatterns.creational.exercise4c;

import java.util.ArrayList;

/**
 *
 * @author betha
 */
public class HardCandy_Lollipop extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            HardCandy_Lollipop lollipop = new HardCandy_Lollipop();
            hardCandyPackage.add(lollipop);
        }

        System.out.println("One package of " + quantity + " hard candy has been made!");
        return hardCandyPackage;

    }

}
