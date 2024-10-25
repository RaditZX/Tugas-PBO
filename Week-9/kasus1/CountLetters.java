import java.util.Scanner;

public class CountLetters {
   public static void main(String[] args) {
      int[] counts = new int[26];
      Scanner scan = new Scanner(System.in);

      // get word from user
      System.out.print("Enter a single word (letters only, please): ");
      String word = scan.nextLine();

      // convert to all upper case
      word = word.toUpperCase();

      
         // Count frequency of each letter in the string
      for (int i = 0; i < word.length(); i++) {
         try {
            char currentChar = word.charAt(i);
            if (currentChar < 'A' || currentChar > 'Z') {
               throw new ArrayIndexOutOfBoundsException("Not a letter \nCharacter that make out of bonds: '" + currentChar +  "' at index: " + i  );
            }
            counts[currentChar - 'A']++; 
         } catch (ArrayIndexOutOfBoundsException tx) {
            System.out.println("error info: " + tx.getMessage());
         }
      }

         // Print frequencies
      System.out.println();
      for (int i = 0; i < counts.length; i++) {
         if (counts[i] != 0) {
            System.out.println((char) (i + 'A') + ": " + counts[i]);
         }
      }
   }
}