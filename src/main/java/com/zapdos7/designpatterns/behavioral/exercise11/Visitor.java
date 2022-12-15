package com.zapdos7.designpatterns.behavioral.exercise11;

public interface Visitor {

  void visit(Bread bread);
  void visit(Milk milk);
  void visit(GroceryList groceryList);

}
