package latihan1;

import java.util.Scanner;

public class No6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jam 1 = ");
        int j1 = in.nextInt();
        System.out.print("Menit 1 = ");
        int m1 = in.nextInt();
        System.out.print("Detik 1 = ");
        int d1 = in.nextInt();
        System.out.println(j1 + " : " + m1 + " : " + d1);

        System.out.print("Jam 2 = ");
        int j2 = in.nextInt();
        System.out.print("Menit 2 = ");
        int m2 = in.nextInt();
        System.out.print("Detik 2 = ");
        int d2 = in.nextInt();
        System.out.println(j2 + " : " + m2 + " : " + d2);

        int a, b, c, cm, cj;
        if ((d1 + d2) > 60) {
            a = (d1 + d2) - 60;
            cm = 1;
        } else {
            a = (d1 + d2);
            cm = 0;
        }
        if ((m1 + m2) > 60) {
            b = (m1 + m2) - 60;
            cj = 1;
        } else {
            b = (m1 + m2);
            cj = 0;
        }
        if ((j1 + j2) > 24) {
            c = (j1 + j2) - 24;
        } else {
            c = (j1 + j2);
        }
        System.out.println("=======================");
        System.out.println((c + cj) + " : " + (b + cm) + " : " + a);
    }
}
