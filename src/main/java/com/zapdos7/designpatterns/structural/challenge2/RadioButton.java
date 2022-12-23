package com.zapdos7.designpatterns.structural.challenge2;

public class RadioButton extends Button {

  ButtonSize buttonSize;

  public RadioButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.getSize();
    System.out.println("Drawing a radio button.\n");
  }

}
