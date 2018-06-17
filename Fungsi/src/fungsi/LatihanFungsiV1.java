package fungsi;

import java.util.Scanner;

public class LatihanFungsiV1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama = ");
        String nama = in.nextLine();
        System.out.print("NIM = ");
        String nim = in.next();
        System.out.println();
        System.out.println(mk(2));
        System.out.println(mk(3));
        System.out.println(mk(4));
    }

    static int mk(int n) {
        Scanner in = new Scanner(System.in);
        System.out.print("Matkul = ");
        String matkul = in.nextLine();
        System.out.print("Jumlah SKS = ");
        int sks = in.nextInt();
        System.out.print("nilai = ");
        int nilai = in.nextInt();
        if (nilai > 80 && nilai <= 100) {
            nilai = 4;
            System.out.println("Bobot A");
        } else if (nilai > 70 && nilai <= 80) {
            nilai = 3;
            System.out.println("Bobot B");
        } else if (nilai > 60 && nilai <= 70) {
            nilai = 2;
            System.out.println("Bobot C");
        } else if (nilai > 50 && nilai <= 60) {
            nilai = 1;
            System.out.println("Bobot D");
        } else if (nilai >= 0 && nilai <= 50) {
            nilai = 0;
            System.out.println("Bobot E");
        }
        int a = nilai;
        int b = sks;
        System.out.println();
        return n;
    }
}
