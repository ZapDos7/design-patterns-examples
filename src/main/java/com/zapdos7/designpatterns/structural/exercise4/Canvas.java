package com.zapdos7.designpatterns.structural.exercise4;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canvas extends JPanel {

  Component circle1 = new Circle(15, 15);
  Component circle2 = new Circle(75, 15);
  Component circle3 = new Circle(135, 15);

  public static void main(String[] args) {
    // Creates a canvas to draw on
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.add(new Canvas());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public void paint(Graphics graphics) {
    circle1.draw(graphics);
    circle2 = new ComponentsWithRedBorder(circle2);
    circle2.draw(graphics);
    circle3.draw(graphics);
  }

}
