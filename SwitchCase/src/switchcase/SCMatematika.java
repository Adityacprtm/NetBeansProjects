/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author Adityacprtm
 */
public class SCMatematika {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan angka 1 = ");
        int a = masuk.nextInt();
        System.out.print("Masukan angka 2 = ");
        int b = masuk.nextInt();
        System.out.println("\nMenu :");
        System.out.println("1.  Tambah ");
        System.out.println("2.  Kurang ");
        System.out.println("3.  Kali ");
        System.out.println("4.  Bagi");
        System.out.print("Masukan Menu : ");
        int pilihan = masuk.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("\n" + a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println("\n" + a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("\n" + a + " x " + b + " = " + (a * b));
                break;
            case 4:
                System.out.println("\n" + a + " : " + b + " = " + (double) a / b);
                break;
        }
    }
}
