package com.zapdos7.behavioraldesignpatterns.challenge1;
public class Client {

  public static void main(String[] args) {
    AuthenticationHandler chain = new BasicAuthenticationHandler(new DigestAuthenticationHandler(new ClientCertificateAuthenticationHandler(null)));
    chain.handleRequest(RequestTypeEnums.BASIC);
    chain.handleRequest(RequestTypeEnums.DIGEST);
    chain.handleRequest(RequestTypeEnums.CLIENT_CERTIFICATE);
  }

}
