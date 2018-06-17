package latihan1;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("angka 1 = ");
        int a = in.nextInt();
        System.out.print("angka 2 = ");
        int b = in.nextInt();
        System.out.print("angka 3 = ");
        int c = in.nextInt();

        int max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        int min = (a < b && a < c) ? a : (b < a && b < c) ? b : c;
        int tengah = (b > a && a > c || c > a && a > b) ? a : (a > b && b > c || c > b && b > a) ? b : c;

        System.out.println("======================================");
        System.out.println("max\t= " + max);
        System.out.println("min\t= " + min);
        System.out.printf("%s%d%5d%5d\n", "urut\t= ", min, tengah, max);
    }
}
