package com.zapdos7.designpatterns.structural.exercise3;

public class Salesperson {

  private String name;

  private Manager manager;

  public Salesperson(String name, Manager manager) {
    this.name = name;
    this.manager = manager;
  }

  public void payExpenses(int amount) {
    System.out.println(name + " has been paid $" + amount);
  }

}
