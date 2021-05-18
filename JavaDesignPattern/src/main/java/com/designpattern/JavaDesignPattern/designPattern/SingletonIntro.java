package com.designpattern.JavaDesignPattern.designPattern;

public class SingletonIntro {

 
  private static volatile SingletonIntro instance = null;
  
  //private constructor
  private SingletonIntro() {
  }
  
  public static SingletonIntro getInstance(){
    if (instance == null){
      synchronized (SingletonIntro.class){
        if (instance == null){
          instance = new SingletonIntro();
        }
       
      }
    }
    return instance;
  }
  
}
