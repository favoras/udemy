package com.company.day1;

public class Main {

    public static void main(String[] args) {
        System.out.println("First day of Udemy");

        int firstNumber = 10;
        int secondNumber = 65;
        int thirdNumber = 5;
        int total = firstNumber + secondNumber + thirdNumber;
        System.out.println(total);

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum = " + myMinIntValue);
        System.out.println("Integer maximum = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue+1));
        System.out.println("Busted max value = " + (myMinIntValue-1));
    }
}
