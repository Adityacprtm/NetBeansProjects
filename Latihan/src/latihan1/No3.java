package latihan1;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        double na;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nama\t= ");
        String nama = in.nextLine();
        System.out.print("Masukan NIM\t= ");
        long nim = in.nextLong();
        System.out.print("Masukan kelas\t= ");
        String kelas = in.next();

        System.out.print("Nilai matkul v\t= ");
        String v = in.next();
        System.out.print("SKS matkul v\t= ");
        int v1 = in.nextInt();
        if (v.equals("A")) {
            na = 4.0;
        } else if (v.equals("B+")) {
            na = 3.5;
        } else if (v.equals("B")) {
            na = 3.0;
        } else if (v.equals("C+")) {
            na = 2.5;
        } else if (v.equals("C")) {
            na = 2.0;
        } else if (v.equals("D+")) {
            na = 1.5;
        } else if (v.equals("D")) {
            na = 1.0;
        } else {
            na = 0;
        }

        System.out.print("Nilai matkul w\t= ");
        String w = in.next();
        System.out.print("SKS matkul w\t= ");
        int w1 = in.nextInt();
        if (w.equals("A")) {
            na = 4.0;
        } else if (w.equals("B+")) {
            na = 3.5;
        } else if (w.equals("B")) {
            na = 3.0;
        } else if (w.equals("C+")) {
            na = 2.5;
        } else if (w.equals("C")) {
            na = 2.0;
        } else if (w.equals("D+")) {
            na = 1.5;
        } else if (w.equals("D")) {
            na = 1.0;
        } else {
            na = 0;
        }

        System.out.print("Nilai matkul x\t= ");
        String x = in.next();
        System.out.print("SKS matkul x\t= ");
        int x1 = in.nextInt();
        if (x.equals("A")) {
            na = 4.0;
        } else if (x.equals("B+")) {
            na = 3.5;
        } else if (x.equals("B")) {
            na = 3.0;
        } else if (x.equals("C+")) {
            na = 2.5;
        } else if (x.equals("C")) {
            na = 2.0;
        } else if (x.equals("D+")) {
            na = 1.5;
        } else if (x.equals("D")) {
            na = 1.0;
        } else {
            na = 0;
        }

        System.out.print("Nilai matkul y\t= ");
        String y = in.next();
        System.out.print("SKS matkul y\t= ");
        int y1 = in.nextInt();
        if (y.equals("A")) {
            na = 4.0;
        } else if (y.equals("B+")) {
            na = 3.5;
        } else if (y.equals("B")) {
            na = 3.0;
        } else if (y.equals("C+")) {
            na = 2.5;
        } else if (y.equals("C")) {
            na = 2.0;
        } else if (y.equals("D+")) {
            na = 1.5;
        } else if (y.equals("D")) {
            na = 1.0;
        } else {
            na = 0;
        }

        System.out.print("Nilai matkul z\t= ");
        String z = in.next();
        System.out.print("SKS matkul z\t= ");
        int z1 = in.nextInt();
        if (z.equals("A")) {
            na = 4.0;
        } else if (z.equals("B+")) {
            na = 3.5;
        } else if (z.equals("B")) {
            na = 3.0;
        } else if (z.equals("C+")) {
            na = 2.5;
        } else if (z.equals("C")) {
            na = 2.0;
        } else if (z.equals("D+")) {
            na = 1.5;
        } else if (z.equals("D")) {
            na = 1.0;
        } else {
            na = 0;
        }
        System.out.println(na);
    }
}
