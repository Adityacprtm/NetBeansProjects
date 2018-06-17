package Tugas3;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah harta : ");
        long harta = in.nextLong();

        if (harta == 500) {
            System.out.println("Menyumbang\t= " + 100);
        } else if (harta <= 1000) {
            System.out.println("Menyumbang\t= " + (0.05 * harta));
        } else if (harta > 1000 && harta < 5000) {
            System.out.println("Menyumbang\t= " + (0.08 * harta));
        } else {
            System.out.println("Menyumbang\t= " + (0.1 * harta));
        }
    }
}
