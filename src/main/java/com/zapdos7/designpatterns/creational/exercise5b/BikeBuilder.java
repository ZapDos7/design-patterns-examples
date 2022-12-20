
package com.zapdos7.designpatterns.creational.exercise5b;

/**
 *
 * @author bethan
 */
public class BikeBuilder {    

    public static void main(String[] args) {
        
        createBikeWithoutAbstractFactory();              
        
        createBikeWithAbstractFactory("mountain bike");
        
    }
    
    public static void createBikeWithoutAbstractFactory() {
        
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();        
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();  
        
    }
    
    public static void createBikeWithAbstractFactory(String type) {
        
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);        
        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        Handlebar handlebar = bikeFactory.createHandlebar();
        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();  
        System.out.println();
        
    }
    
}
