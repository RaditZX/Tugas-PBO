package kasus3;

// **************************************************************** 
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "Y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("Y") || keepGoing.equals("Y")) {
            try{
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
                System.out.print("Another factorial? (y/n) ");
                keepGoing = scan.next();
            }catch(IllegalArgumentException e){}
        }
    }
}
