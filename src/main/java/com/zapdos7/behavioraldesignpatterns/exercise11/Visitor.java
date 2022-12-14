package com.zapdos7.behavioraldesignpatterns.exercise11;

public interface Visitor {

  void visit(Bread bread);
  void visit(Milk milk);
  void visit(GroceryList groceryList);

}
