package micahhaywoodjr;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
    String myString = "This is a string";
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to + " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to + " + myString);

        double myInt = 250.55;
        double myNewInt = myInt + 49.95;
        System.out.println("This result is : " + myInt);

         String lastString =  "10";
        int myLastInt = 50;
        lastString =  lastString + myLastInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value :" + lastString );

        boolean isAliean = false;
        if(isAliean == true)
            System.out.println("It is not an alian");

        int topScore = 80;
        if(topScore < 100)
            System.out.println("You get the high score!");

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second tops core and less than 100");

        if((topScore > 90) ||(secondTopScore <90))
            System.out.println("One of these test is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is tue");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is True");

        double firstValue = 20d;
        double secondValue = 80;
        double myTotal = (firstValue + secondValue) * 25;
        System.out.println("myTotal :" + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("theRemainder :" + theRemainder);
        if(theRemainder <= 20)
        System.out.println("Total was over the limit");



    }
}
