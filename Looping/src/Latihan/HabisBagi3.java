package Latihan;

import java.util.Scanner;

public class HabisBagi3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();

        if (n % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        for (int i = 1; i <= n; i++) {
            int x = i * 3;
            System.out.print(x + " ");
        }
    }
}
