package com.company.day5;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println(isLeapYear(1800));

    }


    public static boolean isLeapYear(int year){
        if(year <= 0 || year > 9999){
            return false;
        }
        if (year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
