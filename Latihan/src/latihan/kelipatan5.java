package latihan;

import java.util.Scanner;

public class kelipatan5 {

    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        System.out.print("Masukan angka\t= ");
        int a;
        a = mlebu.nextInt();
        if (a % 5 == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Bukan Kelipatan 5");
        }
    }
}
