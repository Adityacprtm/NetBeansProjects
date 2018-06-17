package TugasPrakPemDas2;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        final double phi = 3.14;
        System.out.println("Menu\t:");
        System.out.println("1.	menghitung luas dan keliling persegi panjang ");
        System.out.println("2.	menghitung luas dan keliling lingkaran ");
        System.out.println("3.	menghitung luas dan keliling segitiga ");
        System.out.print("Pilihan anda : ");
        int pilihan = masuk.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukan p\t= ");
                int panjang = masuk.nextInt();
                System.out.print("Masukan l\t= ");
                int lebar = masuk.nextInt();
                int luasp = panjang * lebar;
                int kelilingp = 2 * (panjang + lebar);
                System.out.println("Luas persegi panjang\t\t= " + luasp + " cm2");
                System.out.println("Keliling persegi panjang\t= " + kelilingp + " cm");
                break;
            case 2:
                System.out.print("Masukan r\t= ");
                int jarijari = masuk.nextInt();
                double luaslingkaran = phi * jarijari * jarijari;
                double kelilinglingkaran = 2 * phi * jarijari;
                System.out.println("Luas lingkaran\t\t= " + luaslingkaran + " cm2");
                System.out.println("keliling lingkaran\t= " + kelilinglingkaran + " cm");
                break;
            case 3:
                System.out.print("Masukan a\t= ");
                int a = masuk.nextInt();
                System.out.print("Masukan b\t= ");
                int b = masuk.nextInt();
                System.out.print("Masukan r\t= ");
                int c = masuk.nextInt();
                int kelilingsegitiga = a + c + b;
                double s = 0.5 * kelilingsegitiga;
                double luassegitiga = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Luas segitiga\t\t= " + luassegitiga + " cm2");
                System.out.println("keliling segitiga\t= " + kelilingsegitiga + " cm");
                break;
            default:
                System.out.println("Data tidak ditemukan, program dihentikan...");
        }
    }
}