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
public class PenjualanBersih {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        String brg;
        int unit;
        long hpp, hargas;
        System.out.print("Masukan Nama Barang : ");
        brg = masuk.nextLine();
        System.out.print("Masukan Jumlah Unit : ");
        unit = masuk.nextInt();
        hargas = 45000;
        
        switch (brg){
            case "sepatu":
                System.out.println("HPP = "+(hargas*unit));
                System.out.println("Biaya Angkut");
        }
    }
}
