package com.zapdos7.designpatterns.creational.exercise4b;

/**
 *
 * @author bethan
 */
public class CandyStore {
    
    private static final CandyFactory candyFactory = new CandyFactory();    

    public static void main(String[] args) {      
        candyFactory.getCandyPackage(12, "white", "chocolate");
        candyFactory.getCandyPackage(7, "dark", "chocolate");   
        candyFactory.getCandyPackage(14, "lollipop", "hard candy");
        candyFactory.getCandyPackage(20, "peppermint", "hard candy");
    }


}
