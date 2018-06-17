package LatPrakPemDas1;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.println("maka hasil : " + hasil);
        String nama;
        long nim;
        System.out.print("Masukan Nama    : ");
        nama = input.next();
        System.out.print("Masukan NIM     : ");
        nim = input.nextLong();
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
    }

}
