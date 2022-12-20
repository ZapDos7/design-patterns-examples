
package com.zapdos7.designpatterns.creational.exercise2a;

/**
 *
 * @author bethan
 */
public class ResourceManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {            

        // we cannot use the constructor as it is private
        PrintSpooler spooler = PrintSpooler.getInstance();
    }

}
