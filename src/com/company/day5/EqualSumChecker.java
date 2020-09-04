package com.company.day5;

public class EqualSumChecker {
    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,2,1));

    }


    public static boolean hasEqualSum(int a, int b, int c){
        int sum = a + b;
        return sum == c;
    }
}
