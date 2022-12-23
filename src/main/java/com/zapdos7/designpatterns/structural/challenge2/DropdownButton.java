package com.zapdos7.designpatterns.structural.challenge2;

public class DropdownButton extends Button {

  ButtonSize buttonSize;

  public DropdownButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.getSize();
    System.out.println("Drawing a dropdown button.\n");
  }

}