package Tugas5;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        int angka = in.nextInt();

        int i = 0, n1 = 0, n2 = 1, n12;
        while (i < angka) {
            if (i <= 1) {
                n12 = i;
            } else {
                n12 = n1 + n2;
                n1 = n2;
                n2 = n12;
            }
            System.out.print(n12 + " ");
            i++;
        }
    }
}
