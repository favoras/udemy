package com.company.day5;

public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(23,15,42));

    }


    public static boolean hasTeen(int a, int b, int c){
        if(a >= 13 && a <= 19){
            return true;
        }
        else if(b >= 13 && b <= 19){
            return true;
        }
        else return c >= 13 && c <= 19;
    }

    public static boolean isTeen(int a){
        return a >= 13 && a <= 19;
    }
}
