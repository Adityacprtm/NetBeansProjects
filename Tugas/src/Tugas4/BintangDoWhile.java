package Tugas4;

import java.util.Scanner;

public class BintangDoWhile {

    public static void main(String[] args) {
        int i = 1, j = 1, angka;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        angka = in.nextInt();
        while (i <= angka) {
            while (j <= i) {
                System.out.print(" * ");
                j++;
            }
            System.out.print(" * ");
            i++;
            System.out.println();
        }
    }
}
