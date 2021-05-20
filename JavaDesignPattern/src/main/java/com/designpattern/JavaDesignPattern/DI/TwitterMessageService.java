package com.designpattern.JavaDesignPattern.DI;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TwitterMessageService implements MessageService {
  @Override
  public void sendMessage(String msg) {
	System.out.println(msg);
  }
}
