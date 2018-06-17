package TugasPrakPemDas5;

import java.util.Scanner;

public class PermutasiKombinasi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukan Pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    permutation();
                    break;
                case 2:
                    combination();
                    break;
                case 3:
                    System.out.println("Program dihentikan...");
                    break;
                default:
                    System.out.println("Pilihan salah\n");
                    break;
            }
        } while (pilihan != 3);
    }

    static void permutation() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        long n = in.nextLong();
        System.out.print("Masukan nilai r : ");
        long r = in.nextLong();
        System.out.println("        n!");
        System.out.println("nPr = ------ = " + (faktorial(n) / faktorial(n - r)));
        System.out.println("      (n-r)!");
        System.out.println("Maka Hasil Permutasinya Adalah : " + (faktorial(n) / faktorial(n - r)) + "\n");
    }

    static void combination() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        long n = in.nextLong();
        System.out.print("Masukan nilai r : ");
        long r = in.nextLong();
        System.out.println("          n!");
        System.out.println("nPr = ----------- = " + (faktorial(n) / ((faktorial(n - r)) * faktorial(r))));
        System.out.println("      (n-r)! x r!");
        System.out.println("Maka Hasil Kombinasinya Adalah : " + (faktorial(n) / ((faktorial(n - r)) * faktorial(r))) + "\n");
    }

    static long faktorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * faktorial(n - 1));
        }
    }
}
