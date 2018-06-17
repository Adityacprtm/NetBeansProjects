package array.s;

import java.util.Scanner;

public class TransposArrayMatriks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Kasus : ");
        int kasus = in.nextInt();

        for (int i = 0; i < kasus; i++) {
            System.out.print("baris : ");
            int kolom = in.nextInt();
            System.out.print("kolom : ");
            int baris = in.nextInt();

            int matriks[][] = new int[baris][kolom];
            int transpose[][] = new int[kolom][baris];

            for (int j = 0; j < matriks.length; j++) {
                for (int k = 0; k < matriks[0].length; k++) {
                    matriks[j][k] = in.nextInt();
                }
            }
            for (int l = 0; l < matriks.length; l++) {
                for (int m = 0; m < matriks[0].length; m++) {
                    transpose[l][m] = matriks[m][l];
                }
            }
            for (int n = 0; n < transpose.length; n++) {
                for (int p = 0; p < transpose[0].length; p++) {
                    System.out.print(transpose[n][p] + " ");
                }
                System.out.println();
            }
            if (i != kasus) {
            }
        }
    }
}
