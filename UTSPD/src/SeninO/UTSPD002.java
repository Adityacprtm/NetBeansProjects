package SeninO;

import java.util.Scanner;

public class UTSPD002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama Mahasiswa = ");
        String nama = in.nextLine();
        System.out.print("NIM Mahasiswa = ");
        String nim = in.nextLine();
        System.out.print("Nilai Tugas = ");
        double tugas = in.nextDouble();
        System.out.print("Nilai Kuis = ");
        double kuis = in.nextDouble();
        System.out.print("Nilai UTS = ");
        double uts = in.nextDouble();
        System.out.print("Nilai UAS = ");
        double uas = in.nextDouble();

        double nilaitugas = tugas * 0.4;
        double nilaikuis = kuis * 0.1;
        double nilaiuts = uts * 0.2;
        double nilaiuas = uas * 0.3;

        double nilaiangka = nilaitugas + nilaikuis + nilaiuts + nilaiuas;

        if (nilaiangka > 75 && nilaiangka <= 100) {
            System.out.println("A");
        } else if (nilaiangka > 65 && nilaiangka <= 75) {
            System.out.println("B");
        } else if (nilaiangka > 55 && nilaiangka <= 65) {
            System.out.println("C");
        } else if (nilaiangka > 40 && nilaiangka <= 55) {
            System.out.println("D");
        } else if (nilaiangka <= 40) {
            System.out.println("E");
        } else {
            System.out.println("Nilai salah");
        }
    }
}
