package fungsi;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        double angka1, angka2;
        int pilihan;
        String ulang;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Angka 1 = ");
            angka1 = in.nextInt();
            System.out.print("Angka 2 = ");
            angka2 = in.nextInt();

            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.print("Pilihan Menu : ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    penjumlahan(angka1, angka2);
                    break;
                case 2:
                    pengurangan(angka1, angka2);
                    break;
                case 3:
                    perkalian(angka1, angka2);
                    break;
                case 4:
                    pembagian(angka1, angka2);
                    break;
                default:
                    System.out.println("Pilihan salah...");
            }
            System.out.print("Ulangi (Y/N) : ");
            ulang = in.next();
            ulang = ulang.toUpperCase();
            System.out.println();
        } while (ulang.equals("Y"));
    }

    static void penjumlahan(double angka1, double angka2) {
        double jumlah = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + jumlah);
    }

    static void pengurangan(double angka1, double angka2) {
        double jumlah = angka1 - angka2;
        System.out.println(angka1 + " - " + angka2 + " = " + jumlah);
    }

    static void perkalian(double angka1, double angka2) {
        double jumlah = angka1 * angka2;
        System.out.println(angka1 + " x " + angka2 + " = " + jumlah);
    }

    static void pembagian(double angka1, double angka2) {
        double jumlah = angka1 / angka2;
        System.out.println(angka1 + " / " + angka2 + " = " + jumlah);
    }
}
