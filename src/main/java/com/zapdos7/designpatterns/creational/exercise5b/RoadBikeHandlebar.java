package com.zapdos7.designpatterns.creational.exercise5b;

/**
 *
 * @author bethan
 */
public class RoadBikeHandlebar extends Handlebar {

    private static String type = "DROP";

    @Override
    public void getDescription() {
        System.out.println("Road bike handlebar. Type: " + type);
    }

}
