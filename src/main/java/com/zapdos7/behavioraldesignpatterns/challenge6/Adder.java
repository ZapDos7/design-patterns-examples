package com.zapdos7.behavioraldesignpatterns.challenge6;

public class Adder {

  private int result;
  private Memento memento = new Memento(result);

  public void add(int newNumber) {
    result += newNumber;
  }

  public int getResult() {
    return result;
  }

  public void save() {
    memento.setState(result);
  }

  public void undo() {
    result = memento.getState();
  }
}
