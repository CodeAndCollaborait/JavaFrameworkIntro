package com.designpattern.JavaDesignPattern.designPattern.Adapter_Pattern;

//A calculator that naturally implements Base
public class SumCalculator implements Base {
    int num;
    int sum = 0;

    public int addNum(int num) {
        sum += num;
        return sum;
    }

    public int subNum(int num) {
        sum -= num;
        return sum;
    }
}
