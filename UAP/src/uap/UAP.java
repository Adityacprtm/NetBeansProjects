package uap;

import java.util.Scanner;

public class UAP {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, k, l, m, banyak1 = 0, banyak2 = 0, banyak3 = 0;

        int matriks[][] = new int[4][4];
        int ganjil[] = new int[4];
        int genap[] = new int[4];
        int prima[] = new int[4];

        for (i = 0; i < matriks.length; i++) {
            for (j = 0; j < matriks.length; j++) {
                matriks[i][j] = in.nextInt();
            }
        }
        for (k = 0; k < matriks.length; k++) {
            banyak1 = 0;
            banyak2 = 0;
            banyak3 = 0;
            for (l = 0; l < matriks.length; l++) {
                if (matriks[k][l] % 2 == 1) {
                    banyak1 = banyak1 + 1;
                }
                if (matriks[k][l] % 2 == 0) {
                    banyak2 = banyak2 + 1;
                }
                for (m = 2; m < matriks[k][l]; m++) {
                    if (matriks[k][l] % m == 0) {
                        banyak3 = banyak3 + 0;
                    } else {
                        banyak3 = banyak3 + 1;
                    }
                }
            }
            ganjil[k] = banyak1;
            genap[k] = banyak2;
            prima[k] = banyak3;
            System.out.println(ganjil[k] + "  " + genap[k] + "  " + prima[k]);
        }
    }
}
