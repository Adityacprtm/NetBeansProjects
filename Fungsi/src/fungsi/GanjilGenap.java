package fungsi;

import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("angka = ");
        a = in.nextInt();
        ganjilgenap(a);
    }

    static void ganjilgenap(int a) {
        int ganjilgenap;
        if (a % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
