package com.zapdos7.designpatterns.structural.challenge6;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PopulationSimulator {

  static ArrayList<Animal> animals = new ArrayList<>();
  private static AnimalFactory animalFactory = new AnimalFactory();

  public static void main(String[] args) {

    Runnable createAnimals = new Runnable() {
      public void run() {
        createRandomAnimal();
      }
    };

    Runnable removeAnimals = new Runnable() {
      public void run() {
        removeAnimal();
      }
    };

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(createAnimals, 0, 3, TimeUnit.SECONDS);
    executor.scheduleAtFixedRate(removeAnimals, 5, 5, TimeUnit.SECONDS);
  }

  private static void createRandomAnimal() {
    Random random = new Random();
    int randInt = random.nextInt(2);
    Animal animal = null;
    if(randInt == 0) {
      animal = new Lion();
    } else if(randInt == 1) {
      animal = new Tiger();
    }
    animal.setLocation(random.nextInt(1000), random.nextInt(1000));
    System.out.println("Creating " + animal + ", type: " + animal.getAnimalType() +
        ", location: " + animal.getLocation()[0] + " " + animal.getLocation()[1]);
    animals.add(animal);
  }

  private static void removeAnimal() {
    System.out.println("Removing " + animals.get(0));
    animals.remove(0);
  }

}
