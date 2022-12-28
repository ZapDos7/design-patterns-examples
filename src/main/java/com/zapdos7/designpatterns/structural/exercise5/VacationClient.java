package com.zapdos7.designpatterns.structural.exercise5;

import java.time.LocalDate;

public class VacationClient {

  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2021, 8, 1);
    LocalDate endDate = LocalDate.of(2021, 8, 15);

    Flight flight = new Flight();
    flight.bookOutwardJourney(startDate);
    flight.bookReturnJourney(endDate);

    Hotel hotel = new Hotel();
    hotel.book(startDate, endDate);

    CarRental carRental = new CarRental();
    carRental.book(startDate, endDate);
  }

}
