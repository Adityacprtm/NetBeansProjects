package Looping;

import java.util.Scanner;

public class AKotak {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = in.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == (n - (n - 1)) || i == n-n/2 || j == (n - (n - 1)) || j == n) {
                    System.out.print(" A");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
