package micahhaywoodjr;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Tim",500);
        System.out.println("New Score "+ newScore);
        calculateScore(75);
        calculateScore();
        double centimeeters = calcFeetAndInchesToCentimeters(-16,0);
        if(centimeeters<0.0){
            System.out.println("Invalid Parameter");
        }
        calcFeetAndInchesToCentimeters(356);

  }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName+" scored " +score+ " points");
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " +score+ " points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No Player scored no" + "points");
        return 0;
    }



    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 22))) {
            System.out.println("Invalid Feet and Inches Parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches + 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " CM");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remaingIches = (int) inches % 12;
        System.out.println(inches+" inches is equal to " + feet + "feet and " + remaingIches + " Remaing Inches");
        return calcFeetAndInchesToCentimeters(feet, remaingIches);
        }
    }
