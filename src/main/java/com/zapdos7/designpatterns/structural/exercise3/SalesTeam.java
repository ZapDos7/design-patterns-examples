package com.zapdos7.designpatterns.structural.exercise3;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam {

  private List<Manager> managers = new ArrayList<>();
  private List<Salesperson> salespeople = new ArrayList<>();

  void addManager(Manager manager) {
    managers.add(manager);
  }
  void addSalesperson(Salesperson salesperson) {
    salespeople.add(salesperson);
  }

  public void payExpenses(int amount) {
    managers.forEach(manager -> manager.payExpenses(amount));
    salespeople.forEach(salesperson -> salesperson.payExpenses(amount));
  }

}
