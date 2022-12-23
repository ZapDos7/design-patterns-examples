package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Graphics;

public abstract class Triangle extends Shape {

  public void draw(Graphics graphics) {
    int[] x = {200, 250, 150};
    int[] y = {15, 65, 65};
    int n = 3;
    graphics.fillPolygon(x, y, n);
  }

}
