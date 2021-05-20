package com.designpattern.JavaDesignPattern.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Component
public class TextMessageService implements MessageService {
  @Override
  public void sendMessage(String msg) {
	System.out.println(msg);
  }
}
