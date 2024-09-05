import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[3];

        System.out.println("Masukkan kalimat");
        words[0] = sc.nextLine();
        words[1] = sc.nextLine();
        words[2] = sc.nextLine();

        String[] words1 = words[0].split("\\s+");
        String[] words2 = words[1].split("\\s+");
        String[] words3 = words[2].split("\\s+");

        System.out.println("===========================");
        System.out.printf("%-15s %s\n",words1[0], Integer.parseInt(words1[1]) < 100 ? "0" + words1[1] : words1[1]);
        System.out.printf("%-15s %s\n",words2[0], Integer.parseInt(words2[1]) < 100 ? "0" + words2[1] : words2[1]);
        System.out.printf("%-15s %s\n",words3[0], Integer.parseInt(words3[1]) < 100 ? "0" + words3[1] : words3[1]);
        System.out.println("===========================");

    }
}
