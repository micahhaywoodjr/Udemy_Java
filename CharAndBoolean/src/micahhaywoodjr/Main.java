package micahhaywoodjr;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
	    char myChart = '\u00A9';
        System.out.println("Unicode output was : " + myChart);

        boolean myBoolean = false;
        boolean isMale = true;

        char myNewChart = '\u00AE';
        System.out.println("Registered Symbol = " + myNewChart);
    }
}
