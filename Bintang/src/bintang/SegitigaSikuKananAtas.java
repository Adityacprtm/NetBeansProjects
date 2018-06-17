package bintang;

import java.util.Scanner;

public class SegitigaSikuKananAtas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
