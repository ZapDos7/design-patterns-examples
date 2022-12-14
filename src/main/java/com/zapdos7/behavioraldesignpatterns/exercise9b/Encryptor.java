package com.zapdos7.behavioraldesignpatterns.exercise9b;

public interface Encryptor {

  String encryptFile();

  Encryptor aesEncryptor = () -> "Applying AES encryption";
  Encryptor rsaEncryptor = () -> "Applying RSB encryption";

}
