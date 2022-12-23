package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Graphics;

public class Triangle extends Shape {

  ColorShape colorShape;

  public Triangle(ColorShape colorShape) {
    this.colorShape = colorShape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    int[] x = {200, 250, 150};
    int[] y = {15, 65, 65};
    int n = 3;
    graphics.fillPolygon(x, y, n);
  }

}