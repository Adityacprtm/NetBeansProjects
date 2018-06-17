package Tugas4;

import java.util.Scanner;

public class AngkaHari {

    public static void main(String[] args) {
        int i = 1, j = 1, n;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        n = in.nextInt();
        while (i <= n) {
            if ((i % 7) == 0) {
                j = 0;
                System.out.print((j + 7) + " ");
            } else {
                System.out.print(j + " ");
            }
            i++;
            j++;
        }
    }
}
