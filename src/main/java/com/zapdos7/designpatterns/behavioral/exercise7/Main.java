package com.zapdos7.designpatterns.behavioral.exercise7;

public class Main {

  public static void main(String[] args) {
    Connection sally = new Connection();
    Connection bob = new Connection();
    SocialMediaFeed feed = new SocialMediaFeed();

    sally.addPropertyChangeListener(feed);
    bob.addPropertyChangeListener(feed);

    sally.setStatus("going for a walk");
    bob.setStatus("eating my lunch");

    feed.printStatuses();
  }


}
