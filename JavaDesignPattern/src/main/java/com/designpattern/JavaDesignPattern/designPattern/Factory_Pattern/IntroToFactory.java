package com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern;

public class IntroToFactory {

    // getVehicle method uses to get objects of Vehicle
    public Vehicle getVehicle(String vehicleType,String companyName, String model, String power, String color){

        if(vehicleType == null){
            System.out.println("no vehicle type found ...");
            return null;
        }
        if (vehicleType.equalsIgnoreCase("honda")){
            Honda honda = new Honda(companyName,model,power,color);
            honda.toString();
            return honda;
            //return new Honda(companyName,model,power,color);
        }
        else if (vehicleType.equalsIgnoreCase("tesla")){
            Tesla tesla = new Tesla(companyName,model,power,color);
            tesla.toString();
            return tesla;
            //return new Tesla(companyName,model,power,color);
        }
        else if (vehicleType.equalsIgnoreCase("toyota")){
            Toyota toyota = new Toyota(companyName,model,power,color);
            toyota.toString();
            return toyota;
            //return new Toyota(companyName,model,power,color);
        }
        return null;
    }
}

/*class Motorcycle implements Vehicle{

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
}*/