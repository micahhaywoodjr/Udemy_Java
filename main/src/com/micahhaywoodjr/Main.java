package com.micahhaywoodjr;

public class Main {

    public static void main(String[] args) {


        calculateHighScorePosition( );


    }

    public static void displayHighScorePosition(int highScorePosition,String playerName){

        System.out.println("Managed to get into position " + playerName +" "+ highScore + " on the high score table");


    }

    public static int calculateHighScorePosition(int playerScore){
        if(highScore>1000){
            return = 1;
            System.out.println(highScore);
        }else if(highScore>500 && highScore <1000){
            return = 2;
        }else if(highScore>100 && highScore<500){
            return = 3;
        }else {
            return 4;
        }
    }
}
