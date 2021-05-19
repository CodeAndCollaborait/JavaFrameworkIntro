package com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern;

public class Dealership {
    private String model;
    private String power;
    private String color;
    private String companyName;

    public Dealership( String companyName, String model, String power, String color) {
        this.companyName = companyName;
        this.model = model;
        this.power = power;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Company Name = ' " + this.companyName + '\'' +
                "model='" + model + '\'' +
                ", power='" + power + '\'' +
                ", color='" + color + '\'';
    }
}
