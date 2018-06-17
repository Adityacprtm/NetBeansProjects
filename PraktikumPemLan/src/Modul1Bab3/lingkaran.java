package Modul1Bab3;

public class lingkaran {

    int alas, tinggi;
    public static String[] teks = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas", "seratus"};
    public static int[] bilangan = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100};

    public lingkaran(int alas) {
        this.alas = alas;
    }

    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public lingkaran(String alas, String tinggi) {
        this.alas = parsing(alas);
        this.tinggi = parsing(tinggi);
    }

    private void parsing(String a, String b) {
        this.alas = Integer.parseInt(a);
        this.tinggi = Integer.parseInt(b);
    }

    private static int parsing(String s) {
        String pecah[] = new String[4];
        for (int i = 0; i < teks.length; i++) {
            if (s.equals(teks[i])) {
                return bilangan[i];
            }
        }
        pecah = s.split(" ");
        if (pecah.length == 2) {
            if (pecah[1].equalsIgnoreCase("belas")) {
                return 10 + lingkaran.parsing(pecah[0]);
            } else if (pecah[1].equalsIgnoreCase("Puluh")) {
                return lingkaran.parsing(pecah[0]) * 10;
            } else {
                return 9999;
            }
        } else {
            if (!pecah[1].equals("puluh")) {
                return 9999;
            } else {
                return (lingkaran.parsing(pecah[0]) * 10) + lingkaran.parsing(pecah[2]);
            }
        }
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}
