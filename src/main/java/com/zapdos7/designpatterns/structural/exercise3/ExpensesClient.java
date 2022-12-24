package com.zapdos7.designpatterns.structural.exercise3;

public class ExpensesClient {

  public static void main(String[] args) {
    Manager jane = new Manager("Jane");
    Salesperson bob = new Salesperson("Bob", jane);
    Salesperson sue = new Salesperson("Sue", jane);

    SalesTeam team = new SalesTeam();
    team.addTeamMember(jane);
    team.addTeamMember(bob);
    team.addTeamMember(sue);

    payPayee(jane, 100);
    payPayee(bob, 300);
    payPayee(team, 200);

  }

  private static void payPayee(Payee payee, int amount) {
    System.out.println("Expenses have been requested");
    payee.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

}
