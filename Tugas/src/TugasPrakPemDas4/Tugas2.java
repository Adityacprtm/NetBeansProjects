package TugasPrakPemDas4;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan, tiket = 0, total = 0, harga, disc;
        String jenis = null, nama = null, tanggal = null;
        String data[][] = new String[][]{
            {"Ekonomi  ", "50000", "2%", "Tidak ada", "Tidak ada"},
            {"Bisnis  ", "100000", "5%", "Ada", "Tidak ada"},
            {"Eksekutif", "200000", "7%", "Ada", "Tidak ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };
        do {
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.print("Masukkan nilai : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Jenis Kereta");
                    for (int i = 0; i < data.length; i++) {
                        System.out.println("|" + data[i][0] + "\t|");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Jenis kereta yang ada AC");
                    for (int i = 0; i < data.length; i++) {
                        if (data[i][3] == "Ada") {
                            System.out.println("|" + data[i][0] + "\t|");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Jenis kereta yang ada Colokan");
                    for (int i = 0; i < data.length; i++) {
                        if (data[i][4] == "Ada") {
                            System.out.println("|" + data[i][0] + "\t|");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Nama Pemesan : ");
                    nama = in.next();
                    System.out.print("Tanggal Keberangkatan (DD/MM/YYYY) : ");
                    tanggal = in.next();
                    System.out.print("Pilih Jenis KA (Ekonomi, Bisnis, Eksekutif, Pariwisata) :");
                    jenis = in.next();
                    System.out.print("Masukkan Banyaknya tiket : ");
                    tiket = in.nextInt();
                    if (jenis.equalsIgnoreCase(data[0][0])) {
                        harga = 50000 * tiket;
                        disc = (harga * 2) / 100;
                        total = harga - disc;
                    } else if (jenis.equalsIgnoreCase(data[1][0])) {
                        harga = 100000 * tiket;
                        disc = (harga * 5) / 100;
                        total = harga - disc;
                    } else if (jenis.equalsIgnoreCase(data[2][0])) {
                        harga = 200000 * tiket;
                        disc = (harga * 7) / 100;
                        total = harga - disc;
                    } else {
                        harga = 300000 * tiket;
                        disc = (harga * 10) / 100;
                        total = harga - disc;
                    }
                    System.out.println("Silahkan Lihat Pesanan Tiket\n");
                    break;
                case 5:
                    if (jenis != null) {
                        System.out.println("Nama Pemesan\t\t: " + nama);
                        System.out.println("Tanggal Keberangkatan\t: " + tanggal);
                        System.out.println("Jenis Kereta Api\t: " + jenis);
                        System.out.println("Banyak tiket\t\t: " + tiket);
                        System.out.println("Total Harga\t\t: " + "Rp " + total);
                        System.out.println();
                    } else {
                        System.out.println("Belum Memesan Tiket Kereta Api\n");
                    }
                    break;
            }
        } while (pilihan >= 1 && pilihan <= 5);
    }
}
