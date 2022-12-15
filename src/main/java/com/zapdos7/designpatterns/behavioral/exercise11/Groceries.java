package com.zapdos7.designpatterns.behavioral.exercise11;

public interface Groceries {

  double getPrice();
  void accept(Visitor visitor);
}
