package com.zapdos7.designpatterns.structural.challenge3;

import java.util.ArrayList;

public class BookCollection {

  private ArrayList<NonfictionBook> nonfictionBooks = new ArrayList();
  private ArrayList<FictionBook> fictionBooks = new ArrayList();

  public void addNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBooks.add(nonfictionBook);
  }

  public void addFictionBook(FictionBook fictionBook) {
    fictionBooks.add(fictionBook);
  }

  public void checkout() {
    nonfictionBooks.forEach(NonfictionBook::checkout);
    fictionBooks.forEach(FictionBook::checkout);
  }

  public void returnBook() {
    nonfictionBooks.forEach(NonfictionBook::returnBook);
    fictionBooks.forEach(FictionBook::returnBook);
  }


}
