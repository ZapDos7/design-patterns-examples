package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Color;
import java.awt.Graphics;

public class RedColorShape implements ColorShape {

  public void setColor(Graphics graphics) {
    graphics.setColor(Color.RED);
  }

}