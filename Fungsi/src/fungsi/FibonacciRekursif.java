package fungsi;

import java.util.Scanner;

public class FibonacciRekursif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        int f;
        if (n == 1) {
            f = 0;
        } else if (n == 2) {
            f = 1;
        } else {
            f = fibonacci(n - 2) + fibonacci(n - 1);
        }
        return f;
    }
}
