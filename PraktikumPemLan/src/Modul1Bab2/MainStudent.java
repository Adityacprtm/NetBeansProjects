package Modul1Bab2;

import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();
//        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor 
//        System.out.println("===================");
//        anna = new Student("anna", "Batu", 18);
//        anna.displayMessage();

        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method 
//        System.out.println("===================");
//        chris.setAddress("Surabaya");
//        chris.setAge(22);
//        chris.displayMessage();
        
        System.out.print("\nMasukan jumlah siswa : ");
        int jml = input.nextInt();
        Student jumlah = new Student();
        Student Mahasiswa[] = new Student[jml];
        for (int i = 0; i < jml; i++) {
            Mahasiswa[i] = new Student();

            System.out.print("Masukan nama : ");
            input.nextLine();
            String nama = input.nextLine();
            Mahasiswa[i].setName(nama);

            System.out.print("Masukan alamat : ");
            String alamat = input.nextLine();
            Mahasiswa[i].setAddress(alamat);

            System.out.print("Masukan umur : ");
            int umur = input.nextInt();
            Mahasiswa[i].setAge(umur);

            System.out.print("Masukan nilai matematika : ");
            int mat = input.nextInt();
            Mahasiswa[i].setMath(mat);

            System.out.print("Masukan nilai bahasa inggris : ");
            int ing = input.nextInt();
            Mahasiswa[i].setEnglish(ing);

            System.out.print("Masukan nilai ipa : ");
            int ipa = input.nextInt();
            Mahasiswa[i].setScience(ipa);
            System.out.println("========================");
            Mahasiswa[i].displayMessage();
            System.out.println("========================");
            
        }
        jumlah.jumlahObyek();

    }
}
