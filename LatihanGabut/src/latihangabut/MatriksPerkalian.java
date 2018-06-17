package latihangabut;

import java.util.Scanner;

public class MatriksPerkalian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kasus = ");
        int kasus = in.nextInt();
        for (int i = 0; i < kasus; i++) {
            System.out.println("");
            System.out.println("Kasus " + (i + 1));
            System.out.print("Baris = ");
            int baris = in.nextInt();
            System.out.print("Kolom = ");
            int kolom = in.nextInt();
            int matriks1[][] = new int[baris][kolom];
            int matriks2[][] = new int[baris][kolom];
            int hasil[][] = new int[baris][kolom];
            System.out.println("Matrik 1");
            for (int j = 0; j < matriks1.length; j++) {
                for (int k = 0; k < matriks1[0].length; k++) {
                    matriks1[j][k] = in.nextInt();
                }
            }
            System.out.println("Matrik 2");
            for (int j = 0; j < matriks2.length; j++) {
                for (int k = 0; k < matriks2[0].length; k++) {
                    matriks2[j][k] = in.nextInt();
                }
            }
            System.out.println("Matrik 1 X matrik 2");
            for (int j = 0; j < hasil.length; j++) {
                for (int k = 0; k < hasil.length; k++) {
                    hasil[j][k] = 0;
                    for (int l = 0; l < hasil.length; l++) {
                        hasil[j][k] = hasil[j][k] + matriks1[j][l] * matriks2[l][k];
                    }
                    System.out.print(hasil[j][k] + " ");
                }
                System.out.println("");
            }
            if (i != kasus) {
            }
        }
    }
}
