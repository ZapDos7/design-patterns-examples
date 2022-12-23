package com.zapdos7.designpatterns.structural.exercise2;

import java.awt.Color;
import java.awt.Graphics;

public class GreenColorShape implements ColorShape {

  public void setColor(Graphics graphics) {
    graphics.setColor(Color.GREEN);
  }

}