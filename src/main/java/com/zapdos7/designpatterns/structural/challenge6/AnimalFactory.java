package com.zapdos7.designpatterns.structural.challenge6;

import java.util.HashMap;

public class AnimalFactory {

  private HashMap<Integer, Animal> animals = new HashMap<>();

  public Animal getAnimal(int type) {
    if(animals.containsKey(type)) {
      return animals.get(type);
    } else {
      Animal animal = null;
      if(type == 0) {
        animal = new Lion();
      } else if(type == 1) {
        animal = new Tiger();
      }
      animals.put(type, animal);
      return animal;
    }
  }

}
