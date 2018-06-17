package latihan3;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A = ");
        int A = in.nextInt();
        System.out.print("B = ");
        int B = in.nextInt();
        System.out.print("Operator = ");
        String operator = in.next();

        switch (operator) {
            case "+":
                System.out.println(A + B);
                break;
            case "-":
                System.out.println(A - B);
                break;
            case "x":
                System.out.println(A * B);
                break;
            case "/":
                System.out.println(A / B);
                break;
        }
    }
}
