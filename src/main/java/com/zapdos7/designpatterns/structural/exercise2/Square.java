package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Graphics;

public class Square extends Shape {

  ColorShape colorShape;

  public Square(ColorShape colorShape) {
    this.colorShape = colorShape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    graphics.fillRect(5, 15, 50, 50);
  }

}