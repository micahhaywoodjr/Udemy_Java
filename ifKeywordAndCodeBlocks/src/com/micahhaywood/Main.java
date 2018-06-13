package com.micahhaywood;

public class Main {

	public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        if (score <= 5000 && score >1000) {
//		    less than or equal to greater than 1000
//			System.out.println("Your score was less 5000");
//			}else if (score < 1000){
//            System.out.println("Your score is less than 1000 ");
//        }else {
//            System.out.println("Got here");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Your final Score was " + finalScore);

        }

//        boolean newGameOver = true;
//        int secondScore = 10000;
//        int levelUp = 8;
//        int bonusUp = 200;
//        if(newGameOver){
//            int totalScore = secondScore + (levelUp * bonusUp);
//            System.out.println("Your Final Score was " + totalScore);
//
//        }
//
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score was " + finalScore);
        }

    }
}
