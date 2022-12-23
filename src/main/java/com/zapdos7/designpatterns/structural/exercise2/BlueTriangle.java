package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Color;
import java.awt.Graphics;

public class BlueTriangle extends Triangle {

  public void draw(Graphics graphics) {
    graphics.setColor(Color.BLUE);
    super.draw(graphics);
  }

}
