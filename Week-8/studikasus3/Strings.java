package studikasus3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
            String[] strlist;
            int size;

            Scanner scan = new Scanner(System.in);
            System.out.print("\nHow many String do you want to sort?");
            size = scan.nextInt();
            strlist = new String[size];

            System.out.println("\n Enter the String....");
            for (int i = 0; i < size; i++){
                strlist[i] = scan.next();
            }
            Sorting.selectionSort(strlist);

            System.out.println("\nYour String in sorted order...");
            for(int i = 0 ; i < size; i++){
                System.out.print(strlist[i] + " ");
            }
            System.out.println();
    }
}
