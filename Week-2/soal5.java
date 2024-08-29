import java.math.BigInteger;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[2];
        hasilSoal1[] results = new hasilSoal1[5];
        int wordSum;
        int compareResult;

        System.out.print("Masukkan 2 kata lalu tekan enter: ");
        words[0] = sc.next();
        words[1] = sc.next();

        //sum 2 letter size
        wordSum = words[0].length() + words[1].length();

        //compare two word by lexiographicly
        compareResult = words[0].compareTo(words[1]);

        words[0] = words[0].substring(0,1).toUpperCase() + words[0].substring(1);
        words[1] = words[1].substring(0,1).toUpperCase() + words[1].substring(1);

        System.out.println("\n"+wordSum);
        System.out.println(compareResult > 0 ? "yes" : "no");
        System.out.println(words[0] + " " + words[1]);


    }
}
