package com.zapdos7.designpatterns.structural.challenge3;

public class NonfictionBook implements Book{

  String title;
  boolean isCheckedOut;

  public NonfictionBook(String title) {
    this.title = title;
    isCheckedOut = false;
  }

  public void checkout() {
    if(!isCheckedOut) {
      System.out.println("Checking out " + title + "\n");
      isCheckedOut = true;
    } else {
      System.out.println(title + " is already checked out\n");
    }
  }

  public void returnBook() {
    if(isCheckedOut) {
      System.out.println("Returning " + title + "\n");
      isCheckedOut = false;
    } else {
      System.out.println(title + " is not checked out\n");
    }
  }
}
