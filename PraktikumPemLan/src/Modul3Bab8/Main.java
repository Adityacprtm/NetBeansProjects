package Modul3Bab8;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Rectangle kotak =new Rectangle();
        kotak.setWarna("Hijau");
        kotak.howToColor();
        kotak.compareTo(9);
        
//        Rectangle kotak1 = new Rectangle("merah");
//        Rectangle kotak2 = new Rectangle();
//        Rectangle kotak3 = new Rectangle();
//        kotak1.howToColor();
//        kotak2.howToColor();
//        kotak3.compareTo(4);
    }
}
//        Scanner input = new Scanner(System.in);
//        int i = 0, jml, kategori;
//        String warna;
//        System.out.print("Jumlah kotak : ");
//        jml = input.nextInt();
//        Rectangle[] kotak = new Rectangle[jml];
//        do {
//            jml -= 1;
//            System.out.print("Masukan warna : ");
//            warna = input.next();
//            System.out.print("Ukuran kategori : ");
//            kategori = input.nextInt();
//            kotak[i] = new Rectangle(warna);
//            kotak[i].howToColor();
//            kotak[i].compareTo(kategori);
//            System.out.println();
//        } while (jml != 0);
