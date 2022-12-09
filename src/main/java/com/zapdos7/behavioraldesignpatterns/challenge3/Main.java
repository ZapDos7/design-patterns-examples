package com.zapdos7.behavioraldesignpatterns.challenge3;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    // check 1: first letter of the sentence is uppercase
    BeginsWithUppercase beginsWithUppercase = new BeginsWithUppercase();
    context = beginsWithUppercase.interpret(context);
    System.out.println(context);
  }

}
