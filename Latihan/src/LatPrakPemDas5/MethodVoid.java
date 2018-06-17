package LatPrakPemDas5;

import java.util.Scanner;

public class MethodVoid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 3;
        do {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Luas dan Keliling Segitiga Sembarang");
            System.out.println("2. Luas, Sisi Miring dan Keliling Segitiga Siku-siku");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    volSegitigaSembarang();
                    break;
                case 2:
                    segitigaSiku();
                    break;
            }
        } while (pilih != 3);
    }

    private static void volSegitigaSembarang() {
        int a, b, c;
        double keliling, luas, s;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan sisi a : ");
        a = in.nextInt();
        System.out.print("Masukan sisi b : ");
        b = in.nextInt();
        System.out.print("Masukan sisi c : ");
        c = in.nextInt();
        keliling = (float) a + c + b;
        s = (float) 0.5 * keliling;
        luas = Math.sqrt((float) s * (s - a) * (s - b) * (s - c));
        System.out.printf("%s%.2f%s\n", "Luas segitiga sembarang : ", luas, " cm2");
        System.out.printf("%s%.2f%s\n\n", "keliling segitiga :  ", keliling, " cm");
    }

    static void segitigaSiku() {
        Scanner in = new Scanner(System.in);
        double alas, tinggi, sisimiring, luas, keliling;
        System.out.print("Masukkan alas segitiga siku-siku : ");
        alas = in.nextDouble();
        System.out.print("Masukkan tinggi segitiga siku-siku : ");
        tinggi = in.nextDouble();
        luas = (float) 1 / 2 * alas * tinggi;
        System.out.printf("%s%.2f\n", "luas segitiga siku-siku : ", luas);
        sisimiring = Math.sqrt((float) (alas * alas) + (tinggi * tinggi));
        System.out.printf("%s%.2f\n", "Sisi Miring segitiga siku-siku : ", sisimiring);
        keliling = (float) alas + tinggi + sisimiring;
        System.out.printf("%s%.2f\n\n", "Keliling segitiga siku-siku ", keliling);
    }
}
