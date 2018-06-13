public class AreaCalculator {

    public static void main(String[] args) {
        area(20)
    }

    private static double area (double radius){
        if(radius <0){
            return -1;
        }

        double rectangleArea = radius * radius
                return rectangleArea;
    }
}


    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMintes = minutes % 60;

        String hoursString = hours + "h";
        if(hours<10){
            hoursString = "0" + hoursString;
        }
        String minutesString = hours + "m";
        if(remainingMintes<10){
            minutesString = "0" + minutesString;
        }
        String secondsString = hours + "s";
        if(seconds<10){
            secondsString = "0" + secondsString;
        }
        return hoursString + "" + minutesString + "" + secondsString + "";

    }

    private static String getDurationsString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSecond = seconds % 60;

        return getDurationString(minutes,seconds);
    }
}