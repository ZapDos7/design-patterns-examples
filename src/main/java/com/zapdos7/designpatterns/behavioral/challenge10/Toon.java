package com.zapdos7.designpatterns.behavioral.challenge10;

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
