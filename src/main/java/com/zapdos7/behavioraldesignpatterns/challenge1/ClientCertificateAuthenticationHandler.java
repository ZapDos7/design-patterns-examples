package com.zapdos7.behavioraldesignpatterns.challenge1;
public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(RequestTypeEnums requestType) {
    if(RequestTypeEnums.CLIENT_CERTIFICATE.equals(requestType)) {
      System.out.println("Handling client certificate authentication request");
    } else {
      super.handleRequest(requestType);
    }
  }

}
