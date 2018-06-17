package Tugas3;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        int nilai, sisa;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nilai angka: ");
        nilai = masukan.nextInt();

        sisa = nilai % 2;
        switch (sisa) {
            case 0:
                System.out.println("genap");
                break;
            default:
                System.out.println("ganjil");
                break;
        }
    }
}
