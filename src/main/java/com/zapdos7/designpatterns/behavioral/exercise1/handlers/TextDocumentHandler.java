package com.zapdos7.designpatterns.behavioral.exercise1.handlers;

public class TextDocumentHandler extends DocumentHandler {

  public TextDocumentHandler(DocumentHandler handler) {
    super(handler);
  }

  public void openDocument(String fileExtension) {
    if(fileExtension.equals("txt")) {
      System.out.println("Opening text document");
    } else {
      super.openDocument(fileExtension);
    }
  }

}
