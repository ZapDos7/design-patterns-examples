package com.zapdos7.designpatterns.behavioral.exercise9b;

public interface Encryptor {

  String encryptFile();

  Encryptor aesEncryptor = () -> "Applying AES encryption";
  Encryptor rsaEncryptor = () -> "Applying RSB encryption";

}
