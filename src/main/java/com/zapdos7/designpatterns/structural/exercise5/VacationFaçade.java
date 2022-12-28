package com.zapdos7.designpatterns.structural.exercise5;

import java.time.LocalDate;

public class VacationFaçade {
    public void book(LocalDate startDate, LocalDate endDate) {
        Flight flight = new Flight();
        flight.bookOutwardJourney(startDate);
        flight.bookReturnJourney(endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);
    }
}
