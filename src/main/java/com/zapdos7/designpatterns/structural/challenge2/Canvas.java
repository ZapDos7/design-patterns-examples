package com.zapdos7.designpatterns.structural.challenge2;

public class Canvas {

  public static void main(String[] args) {

    // CheckboxButton checkboxButton = new SmallCheckboxButton();
    // checkboxButton.draw();

    // RadioButton radioButton = new MediumRadioButton();
    // radioButton.draw();

    // DropdownButton dropdownButton = new LargeDropdownButton();
    // dropdownButton.draw();

    CheckboxButton checkboxButton = new CheckboxButton(new SmallButtonSize());
    checkboxButton.draw();

    RadioButton radioButton = new RadioButton(new MediumButtonSize());
    radioButton.draw();

    DropdownButton dropdownButton = new DropdownButton(new LargeButtonSize());
    dropdownButton.draw();

  }

}
