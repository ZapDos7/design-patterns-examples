package com.zapdos7.behavioraldesignpatterns.challenge7;

import java.util.ArrayList;

public class TrafficUpdates {

  private ArrayList<String> updates = new ArrayList<>();

  public void getUpdates() {
    updates.forEach(System.out::println);
  }

}
