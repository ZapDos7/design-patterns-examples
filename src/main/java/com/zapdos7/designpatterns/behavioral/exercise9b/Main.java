package com.zapdos7.designpatterns.behavioral.exercise9b;

public class Main {

  public static void main(String[] args) {
    File file = new File("test.pdf");
    file.encrypt(Encryptor.aesEncryptor);
  }

}
