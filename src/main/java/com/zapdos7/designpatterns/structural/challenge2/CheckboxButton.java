package com.zapdos7.designpatterns.structural.challenge2;

public class CheckboxButton extends Button {

  ButtonSize buttonSize;

  public CheckboxButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.getSize();
    System.out.println("Drawing a checkbox button.\n");
  }

}