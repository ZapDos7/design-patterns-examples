package com.zapdos7.designpatterns.behavioral.exercise9;

public class Main {

  public static void main(String[] args) {
    File file = new File("test.pdf");
    AESEncryptor aesEncryptor = new AESEncryptor();
    file.encrypt(aesEncryptor);
  }

}
