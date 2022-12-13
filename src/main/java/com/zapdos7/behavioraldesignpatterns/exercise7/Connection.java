package com.zapdos7.behavioraldesignpatterns.exercise7;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {

  private String status = "";
  private PropertyChangeSupport support = new PropertyChangeSupport(this);

  public void setStatus(String status) {
    support.firePropertyChange("status", this.status, status); //name of the property, old value, new value
    this.status = status;
  }

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

}
