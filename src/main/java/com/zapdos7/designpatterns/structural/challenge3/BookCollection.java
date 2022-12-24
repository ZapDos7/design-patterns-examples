package com.zapdos7.designpatterns.structural.challenge3;

import java.util.ArrayList;

public class BookCollection implements Book {

  private ArrayList<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public void checkout() {
    books.forEach(Book::checkout);
  }

  public void returnBook() {
    books.forEach(Book::returnBook);
  }
}
