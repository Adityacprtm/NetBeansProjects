package TugasPrakPemDas4;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] data = new String[][]{
            {"Ekonomi", "50000", "2%", "Tidak ada", "Tidak ada"},
            {"Bisnis", "100000", "5%", "Ada", "Tidak ada"},
            {"Eksekutif", "200000", "7%", "Ada", "Tidak ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };
        int n, jml = 0, total = 0;
        String kereta = null;
        do {
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.print("Masukkan pilihan : ");
            n = input.nextInt();
            switch (n) {
                case 1:
                    tampil(data);
                    break;
                case 2:
                    ac(data);
                    break;
                case 3:
                    colokan(data);
                    break;
                case 4:
                    System.out.print("Pilih kereta (Ekonomi, Bisnis, Eksekutif, Pariwisata) :");
                    kereta = input.next();
                    System.out.print("Masukkan jumlah tiket : ");
                    jml = input.nextInt();
                    total = pesan(data, jml, kereta);
                    break;
                case 5:
                    if (kereta != null) {
                        System.out.println("Kereta pilihan\t: " + kereta);
                        System.out.println("Jumlah tiket \t: " + jml);
                        System.out.println("Total harga  \t: Rp." + total + ",-");
                    } else {
                        System.out.println("Belum memesan.");
                    }
                    break;
            }
        } while (n >= 1 && n <= 5);
        System.out.println("Program Berakhir.");
    }

    public static void tampil(String[][] data) {
        System.out.printf("%s%13s%16s%11s%20s\n", "Kereta", "Harga", "Diskon", "AC", "Colokan");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 5; j++) {
                int tmp = data[i][j].length();
                int a = 10 - tmp + 5;
                System.out.printf("%s%" + a + "c", data[i][j], '|');
                if (j == 4) {
                    System.out.println("");
                }
            }
        }
    }

    public static void ac(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i][3].equals("Ada")) {
                System.out.println(data[i][0] + " ");
            }
        }
    }

    public static void colokan(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i][4].equals("Ada")) {
                System.out.println(data[i][0] + " ");
            }
        }
    }

    public static int pesan(String[][] data, int jml, String kereta) {
        int harga, total, dis;
        if (kereta.equalsIgnoreCase(data[0][0])) {
            harga = 50000 * jml;
            dis = (2 * harga) / 100;
            total = harga - dis;
            return total;
        } else if (kereta.equalsIgnoreCase(data[1][0])) {
            harga = 100000 * jml;
            dis = (5 * harga) / 100;
            total = harga - dis;
            return total;
        } else if (kereta.equalsIgnoreCase(data[2][0])) {
            harga = 200000 * jml;
            dis = (7 * harga) / 100;
            total = harga - dis;
            return total;
        } else {
            harga = 300000 * jml;
            dis = (10 * harga) / 100;
            total = harga - dis;
            return total;
        }
    }
}
