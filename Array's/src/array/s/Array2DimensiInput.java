package array.s;

import java.util.Scanner;

public class Array2DimensiInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan baris : ");
        int baris = in.nextInt();
        System.out.print("Masukan kolom : ");
        int kolom = in.nextInt();
        int matriks[][] = new int[baris][kolom];
        int a = 1;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                matriks[i][j] = a;
                a++;
            }
        }
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
