package com.zapdos7.designpatterns.structural.exercise5;

import java.time.LocalDate;

public class Hotel {

  public void book(LocalDate checkinDate, LocalDate checkoutDate) {
    System.out.println("Booking hotel for " + checkinDate + " to " + checkoutDate);
  }

}
