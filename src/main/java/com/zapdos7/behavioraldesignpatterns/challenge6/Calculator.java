package com.zapdos7.behavioraldesignpatterns.challenge6;

public class Calculator {

  public static void main(String[] args) {
    Adder adder = new Adder();
    adder.add(10);
    System.out.println(adder.getResult());

   adder.save();
   adder.add(20);
   System.out.println(adder.getResult());
   adder.undo();
   System.out.println(adder.getResult());
  }

}
