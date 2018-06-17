package LatPrakPemDas5;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan tgl : ");
        String tgl = in.nextLine();
        
        int jumlah = tgl.length();
        int tahun = Integer.parseInt(tgl.substring(6, 10));
        System.out.println(tahun);
    }
}
