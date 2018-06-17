package Modul1Bab3;
import java.util.Scanner;
public class PengubahMain {
    public static void main(String[] args) {
        String teks;
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka (0-100)");
        System.out.println("===========================================");
        System.out.println("Bilangan -> Teks");
        System.out.print("Bilangan  : ");
        bilangan = input.nextInt();
        System.out.print("Teks      : ");
        Pengubah.overloadingMeth(bilangan);
        System.out.println("===========================================");
        System.out.println("Teks -> Bilangan");
        System.out.print("Teks      : ");
        teks = input.nextLine();
        teks = input.nextLine();
        System.out.print("Bilangan  : ");
        int x = Pengubah.overloadingMeth(teks);
        if (x == 9999) {
            System.out.println("-\nTeks yang di masukkan salah");
        } else {
            System.out.println(x);
        }
        System.out.println("===========================================");
        System.out.println("\n155150207111081");
        System.out.println(">> copyright© by Aditya Chamim Pratama <<");
    }
}
