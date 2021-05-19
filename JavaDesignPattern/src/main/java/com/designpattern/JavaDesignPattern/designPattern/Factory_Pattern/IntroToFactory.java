package com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern;

public class IntroToFactory {

    // getVehicle method uses to get objects of Vehicle
    public Vehicle getVehicle(String vehicleType){

        if (vehicleType.equalsIgnoreCase("motorcycle")){
            return new Motorcycle();
        }
        else if (vehicleType.equalsIgnoreCase("truck")){
            return new Truck();
        }
        else if (vehicleType.equalsIgnoreCase("Automobile")){
            return new Automobile();
        }
        return null;
    }
}

class Motorcycle implements Vehicle{

    @Override
    public void vehicleInfo() {
        System.out.println("Motorcycle is a vehicle ....");
    }
}

class Truck implements Vehicle{
    @Override
    public void vehicleInfo() {
        System.out.println("Truck is a vehicle ....");
    }
}

class Automobile implements Vehicle{
    @Override
    public void vehicleInfo() {
        System.out.println("Automobile is a vehicle ....");
    }
}