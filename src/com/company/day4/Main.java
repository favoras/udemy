package com.company.day4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Day 4");

        int number = 0;
        while(number < 15){
            number++;

            if(number <= 5){
                System.out.println("Skipping number " + number);
                continue;
            }

            System.out.println("number=" + number);

            if (number >= 10){
                System.out.println("Breaking at " + number);
                break;
            }
        }

    }
}
