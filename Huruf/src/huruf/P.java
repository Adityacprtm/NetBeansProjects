package huruf;

import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("nilai n = ");
        int n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (n % 2 == 1) {
                    if (j == n - (n - 1) || i == n - (n - 1) || i == n / 2 + 1) {
                        System.out.print("P ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j == n - (n - 1) || i == n - (n - 1) || i == n / 2) {
                        System.out.print("P ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
