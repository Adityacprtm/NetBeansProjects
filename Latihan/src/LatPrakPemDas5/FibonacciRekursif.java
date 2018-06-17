package LatPrakPemDas5;
import java.util.Scanner;
public class FibonacciRekursif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan,i;
        System.out.print("Masukan bilangan : ");
        bilangan = in.nextInt();
        for (i = 0; i < bilangan; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    private static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return (fibonacci(i - 2) + fibonacci(i - 1));
        }
    }
}
