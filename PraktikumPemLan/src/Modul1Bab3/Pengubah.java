package Modul1Bab3;
public class Pengubah {
    public static String[] teks = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas", "seratus"};
    public static int[] bilangan = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100};
    //bilangan ke tes
    public static void overloadingMeth(int a) {
        if (a >= 0 && a <= 100) {
            for (int i = 0; i < teks.length; i++) {
                if (a == bilangan[i]) {
                    System.out.println(teks[i]);
                    break;
                } else if (a == 20 || a == 30 || a == 40 || a == 50 || a == 60 || a == 70 || a == 80 || a == 90) {
                    System.out.println(teks[a / 10] + " puluh");
                    break;
                } else if (a > 11 && a < 20) {
                    System.out.println(teks[a - 10] + " belas");
                    break;
                } else if (a > 20 && a < 100) {
                    System.out.println(teks[a / 10] + " puluh " + teks[a % 10]);
                    break;
                }
            }
        } else {
            System.out.println("\nBilangan yang anda masukkan tidak tersedia");
        }
    }
    //teks ke bilangan
    public static int overloadingMeth(String s) {
        String pecah[] = new String[4];
        for (int i = 0; i < teks.length; i++) {
            if (s.equals(teks[i])) {
                return bilangan[i];
            }
        }
        pecah = s.split(" ");
        if (pecah.length == 2) {
            if (pecah[1].equalsIgnoreCase("belas")) {
                return 10 + Pengubah.overloadingMeth(pecah[0]);
            } else if (pecah[1].equalsIgnoreCase("Puluh")) {
                return Pengubah.overloadingMeth(pecah[0]) * 10;
            } else {
                return 9999;
            }
        } else {
            if (!pecah[1].equals("puluh")) {
                return 9999;
            } else {
                return (Pengubah.overloadingMeth(pecah[0]) * 10) + Pengubah.overloadingMeth(pecah[2]);
            }
        }
    }
}
