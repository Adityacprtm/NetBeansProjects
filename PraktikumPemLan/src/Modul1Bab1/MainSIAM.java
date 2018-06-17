package Modul1Bab1;
import java.util.Scanner;
public class MainSIAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        DataMahasiswa[] mahasiswa = new DataMahasiswa[jumlah];
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            mahasiswa[i] = new DataMahasiswa();
            mahasiswa[i].inputData();
            mahasiswa[i].ketentuanSks();
            mahasiswa[i].inputMatkul();
            mahasiswa[i].tampilanData();
            System.out.println("");
        }
        System.out.println("ADITYA CHAMIM PRATAMA\n155150207111081");
        System.out.println(">> copyright© by Aditya Chamim Pratama <<");
    }
}
