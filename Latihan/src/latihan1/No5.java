package latihan1;

import java.util.Scanner;

public class No5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan a = ");
        int a = in.nextInt();
        System.out.print("Masukan b = ");
        int b = in.nextInt();
        System.out.print("Masukan c = ");
        int c = in.nextInt();

        double d = (b * b) - 4 * a * c;

        if (d == 0) {
            System.out.println("Akar kembar");
            System.out.println("X = " + (-b / (2 * a)));
        } else if (d < 0) {
            System.out.println("Akar imajiner");
        } else {
            System.out.println("X1 = " + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println("X2 = " + (-b - Math.sqrt(d)) / (2 * a));
        }
    }
}
