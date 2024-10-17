package studikasus3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
            Integer[] intlist;
            int size;

            Scanner scan = new Scanner(System.in);
            System.out.print("\nHow many Integers do you want to sort?");
            size = scan.nextInt();
            intlist = new Integer[size];

            System.out.println("\n Enter the Numbers....");
            for (int i = 0; i < size; i++){
                intlist[i] = scan.nextInt();
            }
            Sorting.selectionSort(intlist);
            Sorting.insertionSort(intlist);

            System.out.println("\nYour numbers in sorted order...");
            for(int i = 0 ; i < size; i++){
                System.out.print(intlist[i] + " ");
            }
            System.out.println();
    }
}
