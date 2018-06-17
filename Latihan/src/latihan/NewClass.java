/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author guest-Ccd2uu
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner mobil = new Scanner(System.in);
        System.out.print("Masukan angka 1 = ");
        int a = mobil.nextInt();
        System.out.print("Masukan angka 2 = ");
        int b = mobil.nextInt();
        System.out.print("Masukan angka 3 = ");
        int c = mobil.nextInt();
        
        int max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        int min = (a < b & a < c) ? a : (b < a && b < c) ? b : c;
        double x = (a + b + c) / 3;
        
        System.out.println("Max         = " + max);
        System.out.println("Min         = " + min);
        System.out.println("Rata-rata   = " + x);

    }

}
