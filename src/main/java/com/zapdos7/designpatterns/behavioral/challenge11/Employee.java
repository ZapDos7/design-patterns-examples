package com.zapdos7.designpatterns.behavioral.challenge11;

public interface Employee {

  int getSalary();
  void accept(Visitor visitor);
  
}
