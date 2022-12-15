package com.zapdos7.designpatterns.behavioral.challenge7;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class TrafficUpdates implements PropertyChangeListener {

  private ArrayList<String> updates = new ArrayList<>();

  public void getUpdates() {
    updates.forEach(System.out::println);
  }

  @Override
  public void propertyChange(PropertyChangeEvent arg0) {
    updates.add((String) arg0.getNewValue());
  }

}
