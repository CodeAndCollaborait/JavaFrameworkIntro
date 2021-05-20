package com.designpattern.JavaDesignPattern.IntroToSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {
  
  @Bean
  public SendMessage sendMessage(){
    SendMessage sendMessage = new SendMessage();
    sendMessage.setMessage("Sample message");
    return sendMessage;
  }
  
}
