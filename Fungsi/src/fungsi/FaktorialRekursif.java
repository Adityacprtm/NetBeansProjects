package fungsi;

import java.util.Scanner;

public class FaktorialRekursif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.println(faktorial(n));
    }

    static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * faktorial(n - 1));
        }
    }
}
