package com.zapdos7.behavioraldesignpatterns.challenge1;
public class BasicAuthenticationHandler extends AuthenticationHandler {

  public BasicAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(RequestTypeEnums requestType) {
    if(RequestTypeEnums.BASIC.equals(requestType)) {
      System.out.println("Handling basic authentication request");
    } else {
      super.handleRequest(requestType);
    }
  }

}
