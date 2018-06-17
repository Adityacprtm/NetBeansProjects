package Tugas2;

import java.util.Scanner;

public class Tugas2_1 {

    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        System.out.print("Masukan angka1    = ");
        int a = qwerty.nextInt();
        System.out.print("Masukan angka2    = ");
        int b = qwerty.nextInt();
        System.out.print("Masukan angka3    = ");
        int c = qwerty.nextInt();
        int max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        System.out.println("Terbesar    = " + max);
        int min = (a < b && a < c) ? a : (b < a && b < c) ? b : c;
        System.out.println("Terkecil    = " + min);
        double average = (double) (a + b + c) / 3;
        System.out.println("Rata-rata   = " + average);
    }
}
