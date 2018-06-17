package latihan1;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nama\t= ");
        String nama = in.next();
        System.out.print("Masukan NIM\t= ");
        long nim = in.nextLong();
        System.out.print("Masukan kelas\t= ");
        String kelas = in.next();

        System.out.print("Nilai matkul v\t= ");
        String v = in.next();
        System.out.print("SKS matkul v\t= ");
        int v1 = in.nextInt();

        System.out.print("Nilai matkul w\t= ");
        String w = in.next();
        System.out.print("SKS matkul w\t= ");
        int w1 = in.nextInt();

        System.out.print("Nilai matkul x\t= ");
        String x = in.next();
        System.out.print("SKS matkul x\t= ");
        int x1 = in.nextInt();

        System.out.print("Nilai matkul y\t= ");
        String y = in.next();
        System.out.print("SKS matkul y\t= ");
        int y1 = in.nextInt();

        System.out.print("Nilai matkul z\t= ");
        String z = in.next();
        System.out.print("SKS matkul z\t= ");
        int z1 = in.nextInt();

        double na;
        String h;
        h = v;

        if (h.equals("A")) {
            na = 4.0;
        } else if (h.equals("B+")) {
            na = 3.5;
        } else if (h.equals("B")) {
            na = 3.0;
        } else if (h.equals("C+")) {
            na = 2.5;
        } else if (h.equals("C")) {
            na = 2.0;
        } else if (h.equals("D+")) {
            na = 1.5;
        } else if (h.equals("D")) {
            na = 1.0;
        } else if (h.equals("E")) {
            na = 0;
        } 
        System.out.println("ip = " + h);
    }
}
