package com.designpattern.JavaDesignPattern.designPattern.Prototype_Pattern;
import java.util.ArrayList;
import java.util.List;
//Source Code From : https://thecodingsimplified.com/prototype-design-pattern/
public class IntroToPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle a = new Vehicle();
        a.insertData();

        Vehicle b = (Vehicle) a.clone();
        List<String> list = b.getVehicleList();
        list.add("Honda new Amaze");

        Vehicle c = (Vehicle) a.clone();
        List<String> list1 = c.getVehicleList();
        list1.add("BMW 5series");

        System.out.println(a.getVehicleList());
        System.out.println(list);
        System.out.println(list1);
    }
}
    class Vehicle implements Cloneable {
        private List<String> vehicleList;

        public Vehicle() {
            this.vehicleList = new ArrayList<String>();
        }

        public Vehicle(List<String> list) {
            this.vehicleList = list;
        }

        public void insertData() {
            vehicleList.add("Honda amaze");
            vehicleList.add("Audi A4");
            vehicleList.add("Hyundai Creta");
            vehicleList.add("Maruti Baleno");
            vehicleList.add("Renault Duster");
        }

        public List<String> getVehicleList() {
            return this.vehicleList;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            List<String> tempList = new ArrayList<String>();

            for(String s : this.getVehicleList()) {
                tempList.add(s);
            }

            return new Vehicle(tempList);
        }
    }

