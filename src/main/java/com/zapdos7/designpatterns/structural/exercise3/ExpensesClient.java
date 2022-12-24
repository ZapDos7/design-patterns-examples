package com.zapdos7.designpatterns.structural.exercise3;

public class ExpensesClient {

  public static void main(String[] args) {
    Manager jane = new Manager("Jane");
    Salesperson bob = new Salesperson("Bob", jane);
    Salesperson sue = new Salesperson("Sue", jane);

    SalesTeam team = new SalesTeam();
    team.addManager(jane);
    team.addSalesperson(bob);
    team.addSalesperson(sue);

    payManager(jane, 100);
    paySalesperson(bob, 300);
    payTeam(team, 200);

  }

  private static void payManager(Manager manager, int amount) {
    System.out.println("Expenses have been requested");
    manager.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

  private static void paySalesperson(Salesperson salesperson, int amount) {
    System.out.println("Expenses have been requested");
    salesperson.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

  private static void payTeam(SalesTeam team, int amount) {
    System.out.println("Expenses have been requested");
    team.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

}
