package com.designpattern.JavaDesignPattern.designPattern.Adapter_Pattern;

public class IntroToAdapter {
     public static void main(String[] args) {
         CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
         System.out.println(calculatorAdapter.addNum(5));
         System.out.println(calculatorAdapter.subNum(5));
         System.out.println(calculatorAdapter.multNum(5));
         System.out.println(calculatorAdapter.divNum(5));

    }
}

