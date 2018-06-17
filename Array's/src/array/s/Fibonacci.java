package array.s;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n : ");
        int n = in.nextInt();
        int angka[] = new int[n];
        int j = 0;
        angka[0] = 0;
        angka[1] = 1;
        for (int i = 2; i < angka.length; i++) {
            angka[i] = angka[i - 1] + angka[i - 2];
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
