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
public class SCKegiatanHari {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("List hari\t= \n-senin\n-selasa\n-rabu\n-kamis\n-jumat\n-sabtu\n\n");
        System.out.print("Masukan hari\t= ");
        String hari = masuk.nextLine();
        switch (hari) {
            case "senin":
                System.out.println("Hari senin :");
                System.out.println("-Mandi\n-Sarapan\n-Kuliah\n-Muleh\n-ngegame\n-BELAJAR");
                break;
            case "selasa":
                System.out.println("Hari selasa :");
                System.out.println("-Mandi\n-Sarapan\n-Main laptop\n-Jalan-jalan\n-Kuliah\n-Muleh\n-BELAJAR");
                break;
            case "rabu":
                System.out.println("Hari rabu :");
                System.out.println("-Mandi\n-Sarapan\n-Kuliah\n-Muleh\n-Jalan-jalan\n-Kuliah\n-Ngerjakan tugas\n-BELAJAR");
                break;
            case "kamis":
                System.out.println("Hari kamis :");
                System.out.println("-Mandi\n-Sarapan\n-Main laptop\n-Jalan-jalan\n-Kuliah\n-Muleh\n-Diner\n-BELAJAR");
                break;
            case "jumat":
                System.out.println("Hari jumat :");
                System.out.println("-Mandi\n-Sarapan\n-Main laptop\n-Kuliah\n-Solat jumat\n-Muleh\n_ngerjakan tugas\n-BELAJAR");
                break;
            case "sabtu":
                System.out.println("Hari sabtu :");
                System.out.println("-Mandi\n-Sarapan\n-Main laptop\n-Jalan-jalan\n-Bersih-bersih\n-Tidur\n_malmingan\n-BELAJAR");
                break;
            case "minggu":
                System.out.println("Hari Minggu :");
                System.out.println("-Mandi\n-Sarapan\n-Main laptop\n-Tidur\n-Makan\n-Tidur\n-Makan\n-tidur\n-Repeat\n-BELAJAR");
                break;
            default:
                System.out.println("Hari salah...\nProgram dihentikan");
                break;
        }
    }
}
