package TugasPrakPemDas1;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int a, b;
        System.out.print("Masukan operator pertama\t= ");
        a = masuk.nextInt();
        System.out.print("Masukan operator kedua\t\t= ");
        b = masuk.nextInt();
        int jumlah = a + b;
        int kurang = a - b;
        int kali = a * b;
        double bagi = (double) a / b;
        System.out.println("Hasil penjumlahan\t\t= " + jumlah);
        System.out.println("Hasil pengurangan\t\t= " + kurang);
        System.out.println("Hasil perkalian\t\t\t= " + kali);
        System.out.println("Hasil pembagian\t\t\t= " + bagi);
    }
}