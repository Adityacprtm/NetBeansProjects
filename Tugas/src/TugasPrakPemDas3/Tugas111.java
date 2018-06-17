package TugasPrakPemDas3;

import java.util.Scanner;

public class Tugas111 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = in.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = (n - 1); j >= i; j--) {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
