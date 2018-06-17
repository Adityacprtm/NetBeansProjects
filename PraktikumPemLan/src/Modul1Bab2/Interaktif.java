package Modul1Bab2;

import java.util.Scanner;

public class Interaktif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa : ");
        int jml = input.nextInt();
        
        Student[] mahasiswa = new Student[jml];
        for (int i = 0; i < jml; i++) {
            mahasiswa[i] = new Student();
            
            Student jumlah = new Student();
            System.out.print("Masukan nama : ");
            input.nextLine();
            String nama = input.nextLine();
            mahasiswa[i].setName(nama);
            
            System.out.print("Masukan alamat : ");
            String almt = input.nextLine();
            mahasiswa[i].setAddress(almt);
            
            System.out.print("Masukan umur : ");
            int umur = input.nextInt();
            mahasiswa[i].setAge(umur);
            
            System.out.print("Masukan nilai matematika : ");
            int mtk = input.nextInt();
            mahasiswa[i].setMath(mtk);
            
            System.out.print("Masukan nilai ipa : ");
            int ipa = input.nextInt();
            mahasiswa[i].setScience(ipa);
            
            System.out.print("Masukan nilai bahasa inggris : ");
            int bing = input.nextInt();
            mahasiswa[i].setEnglish(bing);
            
            System.out.println("=======================");
            mahasiswa[i].displayMessage();
            System.out.println("=======================");
        }
        Student objek = new Student();
        objek.jumlahObyek();
    }
}
