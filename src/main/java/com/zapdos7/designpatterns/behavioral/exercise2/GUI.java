package com.zapdos7.designpatterns.behavioral.exercise2;

public class GUI {

  private static Document document = new Document();

  public static void main(String[] args) {

    Button saveButton = new Button("Save");
    Button printButton = new Button("Print");

    saveButton.click(new SaveCommand(document));
    printButton.click(new PrintCommand(document));

  }


}
