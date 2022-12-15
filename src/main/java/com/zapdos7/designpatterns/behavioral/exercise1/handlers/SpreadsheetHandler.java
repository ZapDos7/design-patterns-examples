package com.zapdos7.designpatterns.behavioral.exercise1.handlers;

public class SpreadsheetHandler extends DocumentHandler {

  public SpreadsheetHandler(DocumentHandler handler) {
    super(handler);
  }

  public void openDocument(String fileExtension) {
    if(fileExtension.equals("xlsx")) {
      System.out.println("Opening spreadsheet document");
    } else {
      super.openDocument(fileExtension);
    }
  }

}
