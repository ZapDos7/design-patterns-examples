package com.zapdos7.behavioraldesignpatterns.exercise8;

public class MediaPlayer {

  private String state = "paused";
  private String icon = "play button";

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public void play() {
    switch (state) {
      case "paused":
        setState("playing");
        setIcon("pause button");
        System.out.println("Video playing, icon set to " + getIcon());
        break;
      case "playing":
        break;
    }
  }

  public void pause() {
    switch (state) {
      case "paused":
        break;
      case "playing":
        setState("paused");
        setIcon("play button");
        System.out.println("Video paused, icon set to " + getIcon());
        break;
    }
  }

}
