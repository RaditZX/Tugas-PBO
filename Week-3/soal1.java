import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kalimat");
        String word = sc.nextLine();

        String tanpaTandaBaca = word.replaceAll("[\\p{Punct}]", "\n");
        String[] words = tanpaTandaBaca.split("\\s+");

        System.out.println(words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
