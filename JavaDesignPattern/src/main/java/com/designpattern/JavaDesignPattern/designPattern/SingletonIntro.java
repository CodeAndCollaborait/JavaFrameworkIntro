package com.designpattern.JavaDesignPattern.designPattern;

public class SingletonIntro {

 
  private static volatile SingletonIntro instance =
		  new SingletonIntro();
  
  //private constructor
  private SingletonIntro() {
  }
  
  public static SingletonIntro getInstance(){
    return instance;
  }
  
}
