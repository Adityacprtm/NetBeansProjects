package TugasPrakPemDas2;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        long jk, upah, lembur, denda, total;
        System.out.print("Masukan jam kerja per minggu\t= ");
        jk = masuk.nextLong();
        upah = jk * 5000;
        if (jk >= 50 && jk <= 60) {
            lembur = jk * 0;
            denda = jk * 0;
        } else if (jk > 60) {
            upah = (jk * 5000) - ((jk - 60) * 5000);
            lembur = (jk - 60) * 6000;
            denda = jk * 0;
        } else {
            lembur = jk * 0;
            denda = (50 - jk) * 1000;
        }
        total = upah + lembur - denda;
        System.out.printf("%s%d\n", "Jam kerja : ", jk);
        System.out.printf("%s%s%6d\n", "Upah\t= ", "Rp. ", upah);
        System.out.printf("%s%s%6d\n", "Lembur\t= ", "Rp. ", lembur);
        System.out.printf("%s%s%6d\n", "Denda\t= ", "Rp. ", denda);
        System.out.println("---------------------");
        System.out.printf("%s%s%6d\n", "Total\t= ", "Rp. ", total);
    }
}