/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatPrakPemDas1;

/**
 *
 * @author guest-Ccd2uu
 */
public class Output4 {

    public static void main(String[] args) {
        double x = 7654.123456789F;
        System.out.printf("%d %3d %8d\n", 1234, -567, 8910);
        System.out.printf("%d %3d %+8d\n", 1234, -567, 8910);
        System.out.printf("%f %15f %15.3f\n", x, x, x);
        System.out.printf("%1.2f\n", x);
        System.out.printf("%g %100e %15.3f\n", x, x, x);
    }
}
