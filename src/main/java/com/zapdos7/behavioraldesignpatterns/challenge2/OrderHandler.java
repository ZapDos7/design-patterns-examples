package com.zapdos7.behavioraldesignpatterns.challenge2;

public class OrderHandler {

  public void invoke(Command command) {
    command.execute();
  }

}
