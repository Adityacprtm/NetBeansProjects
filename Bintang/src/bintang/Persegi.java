package bintang;

import java.util.Scanner;

public class Persegi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, n;
        System.out.print("n : ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
