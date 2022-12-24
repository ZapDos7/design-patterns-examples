package com.zapdos7.designpatterns.structural.challenge3;

public class LibraryClient {

  public static void main(String[] args) {

    NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
    FictionBook fictionBookOne = new FictionBook("Hamlet", true);
    FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addNonfictionBook(nonfictionBook);
    bookCollection.addFictionBook(fictionBookOne);
    bookCollection.addFictionBook(fictionBookTwo);

    checkoutNonfictionBook(nonfictionBook);
    checkoutFictionBook(fictionBookOne);
    checkoutBookCollection(bookCollection);

    returnNonfictionBook(nonfictionBook);
    returnFictionBook(fictionBookOne);
    returnBookCollection(bookCollection);

  }

  public static void checkoutNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBook.checkout();
  }

  public static void checkoutFictionBook(FictionBook fictionBook) {
    fictionBook.checkout();
  }

  public static void checkoutBookCollection(BookCollection bookCollection) {
    bookCollection.checkout();
  }

  public static void returnNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBook.returnBook();
  }

  public static void returnFictionBook(FictionBook fictionBook) {
    fictionBook.returnBook();
  }

  public static void returnBookCollection(BookCollection bookCollection) {
    bookCollection.returnBook();
  }

}
