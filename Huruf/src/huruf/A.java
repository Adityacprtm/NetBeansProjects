package Huruf;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, k, n;
        System.out.print("Masukan n = ");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("A");
            if (i >= 2) {
                for (k = 2; k < 2 * i - 1; k++) {
                    if (i == n / 2 + 1) {
                        System.out.print("A");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
