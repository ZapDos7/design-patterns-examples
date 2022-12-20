package com.zapdos7.designpatterns.structural.challenge1;

public class WeatherWarnings {

  public static double MAX_TEMPERATURE = 100;
  public static double MIN_TEMPERATURE = 16;


  public void postWarning(City city) {
    if(city.getTemperature() >= MAX_TEMPERATURE || city.getTemperature() <= MIN_TEMPERATURE) {
      System.out.println("Warning! Current temperature in " +city.getName()
      + " is " + city.getTemperature() + " " + city.getTemperatureScale());
      city.setHasWeatherWarning(true);
    } else {
      System.out.println("Temperature in " + city.getName() + " is OK.");
    }

  }

}
