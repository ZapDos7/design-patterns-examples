package com.zapdos7.designpatterns.behavioral.challenge1;

public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(RequestTypeEnums requestType) {
    if(RequestTypeEnums.DIGEST.equals(requestType)) {
      System.out.println("Handling digest authentication request");
    } else {
      super.handleRequest(requestType);
    }
  }

}
