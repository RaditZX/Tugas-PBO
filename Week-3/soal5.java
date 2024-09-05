import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan plat number 4 mobil : ");
        String plat = sc.nextLine();

        String[] plats = plat.split("\\s+");

        long hasil = (Long.parseLong((plats[0] +plats[1]+plats[2] + plats[3])) -  999999) % 5;

        System.out.println(hasil != 0 ? "berhenti" : "jalan");
    }
}
