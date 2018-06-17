package Modul2Bab5;
import java.util.Scanner;
public class MainPenghitung {
    public static void main(String[] args) {
        int nil1, nil2;
        Scanner input = new Scanner(System.in);
        //menggunakan method static
        System.out.print("Masukan nilai 1   : ");
        nil1 = input.nextInt();
        System.out.print("Masukan nilai 2   : ");
        nil2 = input.nextInt();
        Penghitung.penjumlahan(nil1, nil2);
        System.out.print("Masukan nilai 1   : ");
        nil1 = input.nextInt();
        System.out.print("Masukan nilai 2   : ");
        nil2 = input.nextInt();
        Penghitung.pengurangan(nil1, nil2);
        //menggunakan method non-static
        Penghitung a = new Penghitung();
        System.out.print("Masukan nilai 1   : ");
        nil1 = input.nextInt();
        System.out.print("Masukan nilai 2   : ");
        nil2 = input.nextInt();
        a.perkalian(nil1, nil2);
        System.out.print("Masukan nilai 1   : ");
        nil1 = input.nextInt();
        System.out.print("Masukan nilai 2   : ");
        nil2 = input.nextInt();
        a.pembagian(nil1, nil2);
        System.out.print("Masukan nilai 1   : ");
        nil1 = input.nextInt();
        System.out.print("Masukan nilai 2   : ");
        nil2 = input.nextInt();
        a.sederhana(nil1, nil2);
        System.out.println("=========================================");
        System.out.println("             155150207111081");
        System.out.println(">> copyright© by Aditya Chamim Pratama <<");
        System.out.println("=========================================");
    }
}
