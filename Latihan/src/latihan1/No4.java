package latihan1;

import java.util.Scanner;

public class No4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai a = ");
        int a = in.nextInt();
        System.out.print("Nilai b = ");
        int b = in.nextInt();
        System.out.print("Nilai c = ");
        int c = in.nextInt();

        if (a == b && b == c) {
            System.out.println("Segitiga sama sisi");
        } else if (a == b || a == c || b == c) {
            System.out.println("Segitiga sama kaki");
        } else if (((a * a) + (b * b) == (c * c))
                || ((a * a) + (c * c) == (b * b))
                || ((c * c) + (b * b) == (a * a))) {
            System.out.println("Segitiga siku-siku");
        } else {
            System.out.println("Segitiga sembarang");
        }
    }
}
