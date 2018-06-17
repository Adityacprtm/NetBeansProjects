package latihan;

import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {
        String nama, nim, knama, knim, haha, hehe;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan nama\t= ");
        nama = masuk.nextLine();
        System.out.print("Masukan nim\t= ");
        nim = masuk.nextLine();
        System.out.print("Konfirmasi nama\t= ");
        knama = masuk.nextLine();
        System.out.print("Konfirmasi nim\t= ");
        knim = masuk.nextLine();
        hehe = "\nBiodata : "
                + "\nNama\t= Aditya Chamim Pratama"
                + "\nkelas\t= K"
                + "\nNim\t= 155150207111081"
                + "\nMahasiswa FILKOM 2015\n";
        haha = (knama.equals(nama)) ? ((knim.equals(nim)) ? hehe
                : "\nData tidak ditemukan") : "\nData tidak ditemukan";
        System.out.println(haha);
    }
}
