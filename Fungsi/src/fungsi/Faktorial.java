package fungsi;

import java.util.Scanner;

public class Faktorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("angka = ");
        int a = in.nextInt();
        faktorial(a);
    }

    static void faktorial(int a) {
        int i, f;
        f = 1;
        for (i = a; 1 <= i; i--) {
            f = f * i;
        }
        System.out.println(f);
    }
}
