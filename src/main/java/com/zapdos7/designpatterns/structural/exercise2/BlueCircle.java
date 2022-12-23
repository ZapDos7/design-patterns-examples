package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Color;
import java.awt.Graphics;

public class BlueCircle extends Circle {

  public void draw(Graphics graphics) {
    graphics.setColor(Color.BLUE);
    super.draw(graphics);
  }

}