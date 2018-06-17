/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Adityacprtm
 */
public class RumusLingkaran {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jari-jari=");
        int r = scan.nextInt();
        final double phi = 3.14;
        double x = (phi * r * r);
        System.out.println("luasnya=" + x);
    }

}
