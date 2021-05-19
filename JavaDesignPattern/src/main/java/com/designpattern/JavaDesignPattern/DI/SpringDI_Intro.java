package com.designpattern.JavaDesignPattern.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpringDI_Intro {
  
  /*
    Types of DI
    1. Constructor base DI
    2. Setter DI
   */
  @Autowired
  private MessageService messageService; // is interface
  
  
  public SpringDI_Intro(MessageService messageService) {
    super();
	this.messageService = messageService;
  }
  
  public void processMessage(String messageText){
    messageService.sendMessage(messageText);
  }
}
