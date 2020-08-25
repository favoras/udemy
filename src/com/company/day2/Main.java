package com.company.day2;

public class Main {
    public static void main(String[] args) {
        String day2 = "Day 2 of Udemy";
        System.out.println(day2);
        day2 = day2 + ", how to Add text to String";
        System.out.println(day2);

        String firstTextNumber = "10";
        int myInt = 50;
        firstTextNumber = firstTextNumber + myInt;
        System.out.println("1050??  " + firstTextNumber);

        boolean isAlien = false;
        if(!isAlien){
            System.out.println("It is not an alien!");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        int age = 22;
        boolean isAgeOver18 = (age >= 18) ? true : false; // age >= 18;
        System.out.println(isAgeOver18);

        //challenge
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double sum = (firstDouble + secondDouble) * 100.00;
        System.out.println(sum);
        double theRemainder = sum % 40.00;
        System.out.println(theRemainder);
        boolean isNoRemainder = (theRemainder == 0)? true : false;
        System.out.println(isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }
}
