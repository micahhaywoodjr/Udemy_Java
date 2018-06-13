public class MegaByteConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int MB,KB;
        if(kiloBytes >= 0) {
           int mB = kiloBytes/1024;
           int kB = kiloBytes%1024;
            System.out.println(kiloBytes + "KB = "+mB+" MB and "+kB+" KB");

            }else
            System.out.println("Invalid Value");


    }
}
