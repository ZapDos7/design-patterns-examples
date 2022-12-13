package com.zapdos7.behavioraldesignpatterns.exercise8;

public class PlayingState implements State {

  public void pause(MediaPlayer player) {
    player.setState(new PausedState());
    player.setIcon("play button");
    System.out.println("Video paused, icon set to " + player.getIcon());
   }

  public void play(MediaPlayer player) {
    // do nothing
  }

}
