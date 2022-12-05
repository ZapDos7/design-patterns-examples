package com.zapdos7.behavioraldesignpatterns.challenge1;
public abstract class AuthenticationHandler {
  private AuthenticationHandler next;

  public AuthenticationHandler(AuthenticationHandler next) {
    this.next = next;
  }

  public void handleRequest(RequestTypeEnums requestType) {
    if(next != null) {
      next.handleRequest(requestType);
    }
  }
}
