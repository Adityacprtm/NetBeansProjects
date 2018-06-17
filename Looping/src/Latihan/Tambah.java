package Latihan;

import java.util.Scanner;

public class Tambah {

    public static void main(String[] args) {
        int j = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            j = j + i;
        }
        System.out.println("\n" + j);
    }
}
