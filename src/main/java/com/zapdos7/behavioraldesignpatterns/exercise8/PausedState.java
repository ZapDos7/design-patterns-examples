package com.zapdos7.behavioraldesignpatterns.exercise8;

public class PausedState implements State {

  public void pause(MediaPlayer player) {
    // do nothing
  }

  public void play(MediaPlayer player) {
    player.setState(new PlayingState());
    player.setIcon("pause button");
    System.out.println("Video playing, icon set to " + player.getIcon());
  }


}
