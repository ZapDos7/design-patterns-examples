package com.zapdos7.designpatterns.structural.exercise5;

import java.time.LocalDate;

public class VacationClient {

  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2021, 8, 1);
    LocalDate endDate = LocalDate.of(2021, 8, 15);

    VacationFaçade façade = new VacationFaçade();
    façade.book(startDate, endDate);
  }

}
