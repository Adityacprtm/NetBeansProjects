package fungsi;

import java.util.Scanner;

public class AngkaMinimum {

    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        System.out.print("c = ");
        c = in.nextInt();
        minimum(a, b, c);
    }

    static void minimum(int a, int b, int c) {
        int min = (a < b && a < c) ? a : (b < a && b < c) ? b : c;
        System.out.println(min);
    }
}
