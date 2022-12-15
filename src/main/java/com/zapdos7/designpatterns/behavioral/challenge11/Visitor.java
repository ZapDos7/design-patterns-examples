package com.zapdos7.designpatterns.behavioral.challenge11;

public interface Visitor {

  void visit(Manager manager);
  void visit(SalesPerson salesPerson);
  void visit(StaffList staffList);

}
