package com.zapdos7.designpatterns.structural.challenge4;

public class Main {

  public static void main(String[] args) {
    order(new PizzaMargherita());
    order(new PizzaHawaiian());
    order(new PizzaPepperoni());
    // print the added functionality
    order(new PizzaExtraCheese(new PizzaMargherita()));
    order(new PizzaExtraCheese(new PizzaHawaiian()));
    order(new PizzaExtraCheese(new PizzaPepperoni()));
    // TODO: fix - prints the original pizza's toppings twice
  }

  public static void order(Pizza pizza) {
    System.out.println("You have ordered a " + pizza.getName() +
        " pizza. The toppings are " + pizza.getToppings() + ".");
  }

}
