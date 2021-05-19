package com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern;

public class Toyota extends Dealership implements Vehicle{
    public Toyota(String companyName,String model, String power, String color){
        super(companyName, model,power,color);
    }

    public String toString(){
        return super.toString();
    }

    @Override
    public void vehicleInfo() {
        System.out.println("from Toyota class ....");

    }
}
