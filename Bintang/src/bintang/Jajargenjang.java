package bintang;

import java.util.Scanner;

public class Jajargenjang {

    public static void main(String[] args) {
        int n, baris, kolom, bintang;
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        n = in.nextInt();

        for (baris = 1; baris <= n; baris++) {
            for (kolom = n; kolom > baris; kolom--) {
                System.out.print(" ");
            }
            for (bintang = 1; bintang <= n; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
