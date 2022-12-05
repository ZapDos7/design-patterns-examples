package com.zapdos7.behavioraldesignpatterns.exercise1;

import com.zapdos7.behavioraldesignpatterns.exercise1.handlers.DocumentHandler;
import com.zapdos7.behavioraldesignpatterns.exercise1.handlers.SlideshowHandler;
import com.zapdos7.behavioraldesignpatterns.exercise1.handlers.SpreadsheetHandler;
import com.zapdos7.behavioraldesignpatterns.exercise1.handlers.TextDocumentHandler;

public class Client {

  public static void main(String[] args) {
    DocumentHandler chain = new SlideshowHandler(new SpreadsheetHandler(new TextDocumentHandler(null)));
    chain.openDocument("ppt");
    chain.openDocument("txt");
  }

}
