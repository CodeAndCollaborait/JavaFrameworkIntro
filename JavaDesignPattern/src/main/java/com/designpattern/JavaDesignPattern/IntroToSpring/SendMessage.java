package com.designpattern.JavaDesignPattern.IntroToSpring;

public class SendMessage {
  
  private String message;
  
  public String getMessage() {
	return message;
  }
  
  public void setMessage(String message) {
	this.message = message;
  }
  
  @Override
  public String toString() {
	return "SendMessage{" +
			"message='" + message + '\'' +
			'}';
  }
}
