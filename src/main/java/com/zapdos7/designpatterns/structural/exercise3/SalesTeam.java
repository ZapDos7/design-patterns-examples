package com.zapdos7.designpatterns.structural.exercise3;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {

  private List<Payee> payees = new ArrayList<>();

  public void payExpenses(int amount) {
    payees.forEach(payee -> payee.payExpenses(amount));
  }

  void addTeamMember(Payee payee) {
    payees.add(payee);
  }

}
