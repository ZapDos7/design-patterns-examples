package com.zapdos7.behavioraldesignpatterns.challenge10;

public class Pirate {

  public void pickUpWeapon() {
    System.out.println("Pick up sword");
  }

  public void defenseAction() {
    System.out.println("Defend with sword");
  }

  public void moveToSafety() {
    System.out.println("Return to the ship");
  }

  public void defendAgainstAttack() {
    pickUpWeapon();
    defenseAction();
    moveToSafety();
    System.out.println();
  }

}
