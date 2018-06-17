package latihan;

import java.util.Scanner;

public class ConditionalS {

    public static void main(String[] args) {
        String s = "filkom";
        String val = (s == "filkom") ? "Brawijaya" : "null";
        System.out.println(s + " " + val);

        String nama, namasaya, nim, nimsaya;
        namasaya = "Aditya";
        nimsaya = "155150207111081";
        Scanner mlebu = new Scanner(System.in);
        System.out.print("Masukan Nama\t= ");
        nama = mlebu.nextLine();
        System.out.print("Masukan NIM\t= ");
        nim = mlebu.nextLine();
        System.out.println("------------------------------");
        String haha = (nama.equals(namasaya)) ? nama : "input nama salah";
        System.out.println("Nama\t\t= " + haha);
        String hehe = (nim.equals(nimsaya)) ? nim : "input NIM salah";
        System.out.println("NIM\t\t= " + hehe);
    }
}
