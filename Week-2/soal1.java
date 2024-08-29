import java.math.BigInteger;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object[] numbers = new Object[5];
        hasilSoal1[] results = new hasilSoal1[5];

        System.out.print("Masukkan nilai (maximum 5 baris) : ");
        numbers[0] = new BigInteger(sc.next());
        numbers[1] = new BigInteger(sc.next());
        numbers[2] = new BigInteger(sc.next());
        numbers[3] = new BigInteger(sc.next());
        numbers[4] = new BigInteger(sc.next());

        int count = 0;
        for (Object number : numbers) {
            if (number instanceof BigInteger) {
                BigInteger bigIntValue = (BigInteger) number;
                boolean fitsShort = bigIntValue.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && bigIntValue.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0;
                boolean fitsInt = bigIntValue.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && bigIntValue.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0;
                boolean fitsLong = bigIntValue.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && bigIntValue.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0;


                results[count] = new hasilSoal1(bigIntValue.toString(), fitsShort, fitsInt, fitsLong);
            }
            count++;
        }

        // Print the results
        for (hasilSoal1 result : results) {
            result.printResult();
        }
    }
}
