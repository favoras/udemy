package com.company.day3;

public class SpeedConverter {
    public static void main(String[] args) {


        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.62);
        printConversion(75.114);


    }
    public static long toMilesperHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else {
            double miles = kilometersPerHour / 1.609;
            long roundedMiles = Math.round(miles);
            return roundedMiles;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid value");
        }else {
            long milesPerHour = toMilesperHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
