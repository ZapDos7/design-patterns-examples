package com.zapdos7.behavioraldesignpatterns.exercise3;

public class NameNotPrimitiveType implements Expression {

  public String interpret(String context) {
    if(context.equals("int") || context.equals("boolean") || context.equals("double")) {
      context = context + "1";
    }
    return context;
  }

}
