package com.designpattern.JavaDesignPattern.designPattern.Adapter_Pattern;

//a calculator that cannot run the interface Base
public class MultiplyCalculator{
    int sum = 0;

    public int multNum(int num) {
        sum *= num;
        return sum;
    }

    public int divNum(int num) {
        sum /= num;
        return sum;
    }
}
