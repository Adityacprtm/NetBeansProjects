package LatPrakPemDas5;

import java.util.Scanner;

public class MethodRekursif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hasil, bilangan;
        System.out.print("Masukan Bilangan : ");
        bilangan = in.nextInt();
        hasil = faktorial(bilangan);
        System.out.println("Nilai dari " + bilangan + "! adalah " + hasil);
    }

    private static int faktorial(int bil) {
        if (bil == 0) {
            return 1;
        } else {
            return (bil * faktorial(bil - 1));
        }
    }
}
