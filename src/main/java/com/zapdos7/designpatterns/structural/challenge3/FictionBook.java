package com.zapdos7.designpatterns.structural.challenge3;

public class FictionBook implements Book {

  private String title;
  private boolean isCheckedOut;
  private boolean isAPlay;

  public FictionBook(String title, boolean isAPlay) {
    this.title = title;
    this.isAPlay = isAPlay;
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
