package com.zapdos7.designpatterns.structural.challenge1;


public class Adapter implements City {

    City city;
  
    public Adapter (AsianCity city) {
      this.city = city;
    }
  
    public String getName() {
      return city.getName();
    }
  
    public double getTemperature() {
      double temperature = city.getTemperature();
      return temperature * 1.8 + 32; //Formula: (0°C × 9/5) + 32 = 32°F
    }
  
    public String getTemperatureScale() {
      return "Fahrenheit";
    }
  
    public boolean getHasWeatherWarning() {
      return city.getHasWeatherWarning();
    }
  
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
      city.setHasWeatherWarning(hasWeatherWarning);
    }
  
}  