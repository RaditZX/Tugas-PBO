import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kalimat");
        String operation = sc.nextLine();

        String[] operations = operation.split("\\s+");

        switch (operations[1]){
            case "+":
                System.out.println(Integer.parseInt(operations[0]) + Integer.parseInt(operations[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(operations[0]) - Integer.parseInt(operations[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(operations[0]) * Integer.parseInt(operations[2]));

            case "/":
                System.out.println(Integer.parseInt(operations[0]) / Integer.parseInt(operations[2]));
            case "%":
                System.out.println(Integer.parseInt(operations[0]) % Integer.parseInt(operations[2]));
                break;
                default:
                    break;

        }

    }
}
