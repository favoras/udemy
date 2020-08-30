package com.company.day3;

public class Main {
    public static void main(String[] args) {

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        int highScore = calculateScore(true, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

//        highScore = calculateScore(true, score, levelCompleted, bonus);
//        calculateHighScorePosition(highScore);


        displayHighScorePosition("Edgar", calculateHighScorePosition(1500));
        displayHighScorePosition("Dave", calculateHighScorePosition(900));
        displayHighScorePosition("Steve", calculateHighScorePosition(400));
        displayHighScorePosition("Jack", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + "  managed to get into position " + position + "  on the high score table");
    }

    public static int calculateHighScorePosition(int highScore){

        int position = 4; // base return

        if(highScore >= 1000){
            position = 1;
        }else if (highScore >= 500){
            position = 2;
        }else if (highScore >= 100){
            position = 3;
        }
        return position;



//        if(highScore >= 1000){
//            return 1;
//        }else if (highScore >= 500){
//            return 2;
//        }else if (highScore >= 100){
//            return 3;
//        }
//        return 4;
    }
}
