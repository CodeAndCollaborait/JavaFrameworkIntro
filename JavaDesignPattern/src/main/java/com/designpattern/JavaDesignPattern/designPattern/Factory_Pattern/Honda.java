package com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern;

public class Honda extends Dealership implements Vehicle{
    //private String companyName;

    public Honda(String companyName, String model, String power, String color){
        super(companyName,model,power,color);
    }

    public String toString(){

        return  super.toString();
    }

    @Override
    public void vehicleInfo() {
        System.out.println("from Honda class ....");
    }
}
