package com.zapdos7.behavioraldesignpatterns.challenge10;

public abstract class Toon {
    public void pickUpWeapon() {}

    public void defenseAction(){}
  
    public void moveToSafety(){}
  
    public void defendAgainstAttack() {
      pickUpWeapon();
      defenseAction();
      moveToSafety();
      System.out.println();
    }
}
