package com.zapdos7.behavioraldesignpatterns.challenge11;

public interface Visitor {

  void visit(Manager manager);
  void visit(SalesPerson salesPerson);
  void visit(StaffList staffList);

}
