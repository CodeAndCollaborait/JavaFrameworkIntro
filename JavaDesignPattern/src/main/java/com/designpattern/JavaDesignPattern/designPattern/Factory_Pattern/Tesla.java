package com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern;

public  class Tesla extends Dealership implements Vehicle{
    public Tesla(String companyName, String model, String power, String color){
        super(companyName, model,power,color);
    }

    public String toString(){
        return super.toString();
    }

    @Override
    public void vehicleInfo() {
        System.out.println("from Tesla class ....");

    }
}
