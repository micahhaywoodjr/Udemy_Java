public class isLeapYear {

    public static void main(String[] args) {
        isLeapYear(-1600);
    }

     public static boolean isLeapYear(int year) {

            if (year < 1 ||year > 9999) {
                System.out.println("false");
                return false;
            }
            else if ((year % 4) == 0 && (year % 100) != 0) {
                System.out.println("true");
                return true;
            }

            else if ((year % 400) == 0) {
                System.out.println("true");
                return true;
            }
            System.out.println("false");
            return false;

        }
        //int validYear = Year;
//        int z = 2000;
//        if ((Year > 1)||(Year < 9999)) {
//            if (validYear / 4 == z) {
//                System.out.println("Micah is Cool");
//            } else if (validYear / 100 == z) {
//                System.out.println("False");
//            }
//                if(Year/4F!=z){
//                    System.out.println("IsLeapYear("  +validYear+ ")");
//                }else
//                    System.out.println("Invalid Function");
//               }
//            if(Year<9999){
//                if(Year/400!=z){
//                    System.out.println("IsLeapYear("  +validYear+ ")");
//                }else
//                    System.out.println("Invalid Function");
//            }
//            if(Year<9999){
//                if(Year/100!=z){
//                    System.out.println("IsLeapYear("  +validYear+ ")");
//                }else
//                    System.out.println("Invalid Function");
//            }

    }


