package tutorial1;

import java.util.Date;

public class NewClass {

    public static String[] teks = {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
    public static int[] bilangan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static int pengubah(String a) {
        for (int i = 0; i < teks.length; i++) {
            if (a.equals(teks[i])) {
                return bilangan[i];
            }
        }
        return 0;
    }

    public static void penjumlahan(String a, String b) {
        int x = pengubah(a);
        int y = pengubah(b);
        System.out.println(x + y);
        Date tgl = new Date();
        System.out.println(tgl);
    }

    public static void main(String[] args) {
        penjumlahan("tiga", "enam");
    }
}
