package Tugas1;

import java.util.Scanner;

public class MainPeternakanSketsa {

    public static void main(String[] args) {

        System.out.println("> DATA <");
        System.out.println("--------");
        //data hewan1
        Peternakan hewan1 = new Peternakan();
        hewan1.jenis = "sapi";
        hewan1.harga = 5000;
        hewan1.jumlah = 5;
        hewan1.tampilkanData();
        System.out.println("=================");

        //data hewan2
        Peternakan hewan2 = new Peternakan();
        hewan2.jenis = "ayam";
        hewan2.harga = 2000;
        hewan2.jumlah = 15;
        hewan2.tampilkanData();
        System.out.println("=================");

        //data hewan3
        Peternakan hewan3 = new Peternakan();
        hewan3.jenis = "kambing";
        hewan3.harga = 7000;
        hewan3.jumlah = 10;
        hewan3.tampilkanData();
        System.out.println("=================");

        //////////////////////////////////////////////////////////      
        System.out.println("");
        System.out.println("> PENJUALAN <");
        System.out.println("-------------");
        //penjualan hewan1
        System.out.println(">> Penjualan Sukses");
        System.out.println(">> Data Diupdate");
        hewan1.penjualan(2);
        hewan1.tampilkanUntung();
        System.out.println("--------------------");
        //penjualan hewan2
        System.out.println(">> Penjualan Sukses");
        System.out.println(">> Data Diupdate");
        hewan2.penjualan(2);
        hewan2.tampilkanUntung();
        System.out.println("--------------------");
        //penjualan hewan3
        System.out.println(">> Penjualan Sukses");
        System.out.println(">> Data Diupdate");
        hewan3.penjualan(2);
        hewan3.tampilkanUntung();
        System.out.println("--------------------");
        
        /////////////////////////////////////////////////  

        System.out.println("");
        System.out.println("> PENAMBAHAN <");
        System.out.println("--------------");
        //melahirkan hewan1
        System.out.println(">> Melahirkan Sukses");
        System.out.println(">> Data Diupdate");
        hewan1.melahirkan(5);
        hewan1.tampilkanData();
        System.out.println("--------------------");
        //melahirkan hewan2
        System.out.println(">> Melahirkan Sukses");
        System.out.println(">> Data Diupdate");
        hewan2.melahirkan(5);
        hewan2.tampilkanData();
        System.out.println("--------------------");
        //melahirkan hewan3
        System.out.println(">> Melahirkan Sukses");
        System.out.println(">> Data Diupdate");
        hewan3.melahirkan(5);
        hewan3.tampilkanData();
        System.out.println("--------------------");
    }
}
