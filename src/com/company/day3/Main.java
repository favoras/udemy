package com.company.day3;

public class Main {
    public static void main(String[] args) {

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println(calculateScore(false, score, levelCompleted, bonus));
        // calculateScore(true, 800, 5, 100);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(true, score, levelCompleted, bonus);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score: " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
