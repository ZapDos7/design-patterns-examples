package com.zapdos7.behavioraldesignpatterns.exercise8;

public class MediaPlayer {

  private State state = new PausedState();
  private String icon = "play button";

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public void play() {
    getState().play(this);
  }

  public void pause() {
    getState().pause(this);
  }

}
