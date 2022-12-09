package com.zapdos7.behavioraldesignpatterns.exercise6;

public class DocumentViewer {

  private static TextDocument textDocument = new TextDocument();

  public static void main(String[] args) {
    textDocument.write("hello");
    textDocument.print();
    textDocument.write(" world");
    textDocument.print();
  }

}
