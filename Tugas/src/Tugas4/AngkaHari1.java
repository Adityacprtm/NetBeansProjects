/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.util.Scanner;

/**
 *
 * @author Adityacprtm
 */
public class AngkaHari1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan n = ");
        int n = in.nextInt();
        
        int i = 1, a = 1;
        while (i <= n) {
            if (a > 7) {
                a = 1;
            }
            System.out.print(a + " ");
            i++;
            a++;
        }
    }

}
