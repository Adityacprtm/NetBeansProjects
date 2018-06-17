package array.s;

import java.util.Scanner;

public class MatriksJumlah {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        //input A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                A[i][j] = in.nextInt();
            }
        }
        //input B
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.println("[" + (k + 1) + "]" + "[" + (l + 1) + "]");
                B[k][l] = in.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((A[i][j] + " "));
            }
            System.out.println("");
        }
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print((B[k][l] + " "));
            }
            System.out.println("");
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                C[x][y] = A[x][y] + B[x][y];
            }
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print((C[x][y]) + " ");
            }
            System.out.println("");
        }
    }
}
