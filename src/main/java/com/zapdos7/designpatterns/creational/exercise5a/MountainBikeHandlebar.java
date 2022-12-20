
package com.zapdos7.designpatterns.creational.exercise5a;

/**
 *
 * @author bethan
 */
public class MountainBikeHandlebar extends Handlebar {
    
    private static String type = "FLAT";
    
    @Override
    public void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
    
}
