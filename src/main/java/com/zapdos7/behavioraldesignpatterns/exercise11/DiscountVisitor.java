package com.zapdos7.behavioraldesignpatterns.exercise11;

public class DiscountVisitor implements Visitor {

  public void visit(Bread bread) {
    bread.setPrice(0.9);
  }

  public void visit(Milk milk) {
    milk.setPrice(1.6);
  }

  public void visit(GroceryList groceryList) {
    System.out.println("Discounts have been applied to your grocery list");
  }

}
