package Tugas4;

import java.util.Scanner;

public class BintangWhile {

    public static void main(String[] args) {
        int i = 1, n;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        n = in.nextInt();
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
