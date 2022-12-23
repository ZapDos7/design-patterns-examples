package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Graphics;

public class Circle extends Shape{

  ColorShape colorShape;

  public Circle(ColorShape colorShape) {
    this.colorShape = colorShape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    graphics.fillOval(75, 15, 50, 50);
  }



}