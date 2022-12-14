package com.zapdos7.behavioraldesignpatterns.challenge10;

public class Troll {

  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  public void defenseAction() {
    System.out.println("Defend with club");
  }

  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }

  public void defendAgainstAttack() {
    pickUpWeapon();
    defenseAction();
    moveToSafety();
    System.out.println();
  }

}
