package com.zapdos7.designpatterns.behavioral.exercise2;

public class Button {

  String text;

  public Button(String text) {
    this.text = text;
  }

  public void click(Command command) {
    command.execute();
  }


}
