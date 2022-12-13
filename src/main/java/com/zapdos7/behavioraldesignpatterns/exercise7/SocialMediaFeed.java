package com.zapdos7.behavioraldesignpatterns.exercise7;

import java.util.ArrayList;

public class SocialMediaFeed {

  private ArrayList<String> statuses = new ArrayList<>();

  public void printStatuses() {
    statuses.forEach(System.out::println);
  }

}
