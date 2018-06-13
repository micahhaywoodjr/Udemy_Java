public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){
        long year = minutes / 525600;
        long days = (minutes % 525600) / 1440;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
