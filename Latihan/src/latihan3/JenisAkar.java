package latihan3;

import java.util.Scanner;

public class JenisAkar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a : ");
        int a = in.nextInt();
        System.out.print("b : ");
        int b = in.nextInt();
        System.out.print("c : ");
        int c = in.nextInt();
        System.out.println("");
        System.out.println(a + "x^2 " + " + " + b + "x " + " + " + c);
        System.out.println("");
        double d = (b * b) - 4 * a * c;
        if (d == 0) {
            System.out.println("Akar kembar");
            System.out.println("X = " + (-b) / (2 * a));
        } else if (d < 0) {
            System.out.println("Akar imajiner");
        } else {
            System.out.println("X1 = " + ((-b) + Math.sqrt(d) / 2 * a));
            System.out.println("X2 = " + ((-b) - Math.sqrt(d) / 2 * a));
        }

    }
}
