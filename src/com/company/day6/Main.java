package com.company.day6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Day 6 : Classes, Constructors and Inheritance");

        Car McLaren = new Car();
        Car Audi = new Car();
        McLaren.setModel("720s");
        Audi.setModel("R8 V10+");

        System.out.println(McLaren);
        System.out.println(Audi);
    }
}


class Car{

    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String color;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
