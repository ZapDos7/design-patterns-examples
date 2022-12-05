package com.zapdos7.behavioraldesignpatterns.exercise3;

public class FirstLetterNotUnderscore implements Expression {

  private FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

  public String interpret(String context) {
    if(context.startsWith("_")) {
      context = context.substring(1);
    }
    return firstLetterIsLowerCase.interpret(context);
  }
}
