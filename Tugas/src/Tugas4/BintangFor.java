package Tugas4;

import java.util.Scanner;

public class BintangFor {

    public static void main(String[] args) {
        int i, j, angka;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        angka = in.nextInt();
        for (i = 1; i <= angka; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
