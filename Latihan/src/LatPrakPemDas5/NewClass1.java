package LatPrakPemDas5;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan x : ");
        x = in.nextInt();
        System.out.print("Masukan y : ");
        y = in.nextInt();
        System.out.println(hitungFPB(x, y));
    }

    public static int hitungFPB(int x, int y) {
        if (x > y) {
            if (x % y == 0) {
                return y;
            } else {
                return hitungFPB(y, x % y);
            }
        } else {
            if (y % x == 0) {
                return x;
            } else {
                return hitungFPB(x, y % x);
            }
        }
    }
}
