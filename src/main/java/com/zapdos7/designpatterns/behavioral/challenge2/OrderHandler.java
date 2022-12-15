package com.zapdos7.designpatterns.behavioral.challenge2;

public class OrderHandler {

  public void invoke(Command command) {
    command.execute();
  }

}
