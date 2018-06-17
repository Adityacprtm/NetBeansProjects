package Tugas1;

import java.util.Scanner;

public class MainPeternakan {

    public static void main(String[] args) {
        int pilih, pilihan, pilihan1, jual, tambah;
        Scanner input = new Scanner(System.in);
        //data hewan1
        Peternakan hewan1 = new Peternakan();
        hewan1.jenis = "Sapi";
        hewan1.harga = 5000000;
        hewan1.jumlah = 10;
        //data hewan2
        Peternakan hewan2 = new Peternakan();
        hewan2.jenis = "Ayam";
        hewan2.harga = 50000;
        hewan2.jumlah = 20;
        //data hewan3
        Peternakan hewan3 = new Peternakan();
        hewan3.jenis = "Kambing";
        hewan3.harga = 1000000;
        hewan3.jumlah = 10;
        //data hewan4
        Peternakan hewan4 = new Peternakan();
        hewan4.jenis = "Bebek";
        hewan4.harga = 70000;
        hewan4.jumlah = 20;
        //data hewan5
        Peternakan hewan5 = new Peternakan();
        hewan5.jenis = "Rusa";
        hewan5.harga = 2000000;
        hewan5.jumlah = 10;
        do {
            System.out.println("1. Tampilkan Hewan\n2. Penjualan Hewan\n3. Penambahan Hewan\n4. keluar");
            System.out.println("Keuntungan Total : " + (hewan1.untung + hewan2.untung + hewan3.untung + hewan4.untung + hewan5.untung));
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            System.out.println("");
            switch (pilih) {
                case 1:
                    System.out.println("> Data Hewan <");
                    System.out.println("==================");
                    hewan1.tampilkanData();
                    System.out.println("==================");
                    hewan2.tampilkanData();
                    System.out.println("==================");
                    hewan3.tampilkanData();
                    System.out.println("==================");
                    hewan4.tampilkanData();
                    System.out.println("==================");
                    hewan5.tampilkanData();
                    System.out.println("==================");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Pilih hewan yang dijual :\n1. Sapi\n2. Ayam\n3. Kambing\n4. Bebek\n5. Rusa");
                    System.out.print("Pilihan : ");
                    pilihan = input.nextInt();
                    System.out.print("Banyak hewan : ");
                    jual = input.nextInt();
                    if (pilihan == 1) {
                        hewan1.penjualan(jual);
                        hewan1.tampilkanUntung();
                    } else if (pilihan == 2) {
                        hewan2.penjualan(jual);
                        hewan2.tampilkanUntung();
                    } else if (pilihan == 3) {
                        hewan3.penjualan(jual);
                        hewan3.tampilkanUntung();
                    } else if (pilihan == 4) {
                        hewan4.penjualan(jual);
                        hewan4.tampilkanUntung();
                    } else if (pilihan == 5) {
                        hewan5.penjualan(jual);
                        hewan5.tampilkanUntung();
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Pilih hewan yang ditambah :\n1. Sapi\n2. Ayam\n3. Kambing\n4. Bebek\n5. Rusa");
                    System.out.print("Pilihan : ");
                    pilihan1 = input.nextInt();
                    System.out.print("Banyak Hewan : ");
                    tambah = input.nextInt();
                    if (pilihan1 == 1) {
                        hewan1.melahirkan(tambah);
                        hewan1.tampilkanData();
                    } else if (pilihan1 == 2) {
                        hewan2.melahirkan(tambah);
                        hewan2.tampilkanData();
                    } else if (pilihan1 == 3) {
                        hewan3.melahirkan(tambah);
                        hewan3.tampilkanData();
                    } else if (pilihan1 == 4) {
                        hewan4.melahirkan(tambah);
                        hewan4.tampilkanData();
                    } else if (pilihan1 == 5) {
                        hewan5.melahirkan(tambah);
                        hewan5.tampilkanData();
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    System.out.println("");
                    break;
            }
        } while (pilih != 4);
    }
}
