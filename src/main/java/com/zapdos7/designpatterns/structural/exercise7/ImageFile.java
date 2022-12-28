package com.zapdos7.designpatterns.structural.exercise7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageFile implements DisplayObject {

  BufferedImage image;

  public ImageFile(String path) {
    image = load(path);
  }

  public void display() {
    ImageIcon icon = new ImageIcon(image);
    JLabel label = new JLabel(icon);
    JOptionPane.showMessageDialog(null, label);
  }

  BufferedImage load(String path) {
    BufferedImage image = null;
    try {
      image = ImageIO.read(new File(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return image;
  }


}
