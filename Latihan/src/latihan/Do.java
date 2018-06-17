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
public class Do {
    public static void main(String[] args) {
        int a=60;
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan nilai =");
        a=input.nextInt();
        if (a>=60)
        {
            System.out.println("mahasiswa lulus alhamdlilah");   
        }else
        {
            System.out.println("mahasiswa di DO");
        }            
    }
}
