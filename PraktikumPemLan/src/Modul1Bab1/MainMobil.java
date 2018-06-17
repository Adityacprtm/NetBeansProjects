package Modul1Bab1;

import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kecepatan;
        String merek, noplat, warna, ubah;
        //instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukan Kecepatan Mobil : ");
        kecepatan = input.nextInt();
        m1.setKecepatan(kecepatan);
        System.out.print("Masukan Merk Mobil      : ");
        merek = input.next();
        m1.setManufaktur(merek);
        System.out.print("Masukan No Plat Mobil   : ");
        noplat = input.next();
        m1.setNoPlat(noplat);
        System.out.print("Masukan Warna Mobil     : ");
        warna = input.next();
        m1.setWarna(warna);
        System.out.print("Masukan waktu (satuan jam) : ");
        double waktu = input.nextDouble();
        m1.setWaktu(waktu);
        m1.hitungJarak();
        m1.displayMessage();
        System.out.println("================");
        //instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukan Kecepatan Mobil : ");
        kecepatan = input.nextInt();
        m2.setKecepatan(kecepatan);
        System.out.print("Masukan Merk Mobil      : ");
        merek = input.next();
        m2.setManufaktur(merek);
        System.out.print("Masukan No Plat Mobil   : ");
        noplat = input.next();
        m2.setNoPlat(noplat);
        System.out.print("Masukan Warna Mobil     : ");
        warna = input.next();
        m2.setWarna(warna);
        m2.displayMessage();
        System.out.println("================");
        //merubah warna dari objek m1
        System.out.print("Ingin merubah warna mobil m1 y/n? ");
        ubah = input.next();
        System.out.println("================");
        if (ubah.equals("y")) {
            System.out.print("Masukan warna       : ");
            warna = input.next();
            System.out.println("mobil pada objek m1 di rubah menjadi warna " + warna);
            m1.setWarna(warna);
            //menampilkan hasil perubahan
            m1.displayMessage();
        } else {
            m1.displayMessage();
        }
    }
}
