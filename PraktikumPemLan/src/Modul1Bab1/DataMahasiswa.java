package Modul1Bab1;
import java.util.Scanner;
public class DataMahasiswa {
    Scanner input = new Scanner(System.in);
    public String nama, nim, jurusan;
    public int jumlahSks;
    public double ip;
    public String[] kodeMatkul = new String[10];
    public String[] matkul = new String[10];
    public int[] sks = new int[10];
    int tempSks = 0, i;
    String a;
    public void inputData() {
        System.out.print("Masukan nama      : ");
        this.nama = input.nextLine();
        System.out.print("Masukan NIM       : ");
        this.nim = input.next();
        System.out.print("Masukan Jurusan   : ");
        this.jurusan = input.next();
        System.out.print("Masukan IP        : ");
        this.ip = input.nextDouble();
    }
    public void ketentuanSks() {
        if (this.ip <= 2.0) {
            jumlahSks = 12;
        } else if (this.ip <= 2.5) {
            jumlahSks = 17;
        } else if (this.ip <= 3.0) {
            jumlahSks = 20;
        } else if (this.ip <= 4.0) {
            jumlahSks = 24;
        }
        System.out.println("Jumlah SKS yang dapat diambil = " + jumlahSks);
    }
    public void inputMatkul() {
        i = 0;
        for (i = 0; i <= jumlahSks; i++) {
            System.out.println("----------------------------------------");
            System.out.print("Masukan Kode Mata Kuliah " + (i + 1) + "   : ");
            this.kodeMatkul[i] = input.next();
            System.out.print("Masukan Nama Mata Kuliah " + (i + 1) + "   : ");
            this.matkul[i] = input.next();
            System.out.print("Masukan SKS Mata Kuliah " + (i + 1) + "    : ");
            this.sks[i] = input.nextInt();
            tempSks = tempSks + this.sks[i];
            System.out.println("Jumlah SKS yang dipilih = " + tempSks);
            System.out.println("----------------------------------------");
            System.out.print("Menambah Matkul lagi y/n  : ");
            a = input.next();
            if (a.equals("y")) {
                if (tempSks > jumlahSks) {
                    System.out.println("Jumlah SKS yang dimasukan melebihi ketentuan");
                    System.out.print("input lagi y/n    : ");
                    a = input.next();
                    if (a.equals("y")) {
                        i = 0;
                        continue;
                    } else {
                        break;
                    }
                }
                continue;
            } else {
                break;
            }
        }
    }
    public void tampilanData() {
        System.out.println("----------------------------------------");
        System.out.println(">> DATA MAHASISWA <<");
        System.out.println("Nama        : " + this.nama);
        System.out.println("NIM         : " + this.nim);
        System.out.println("Jurusan     : " + this.jurusan);
        System.out.println("IP          : " + this.ip);
        System.out.println("----------------------------------------");
        System.out.println("Mata Kuliah yang diambil");
        for (i = 0; kodeMatkul[i] != null; i++) {
            System.out.println("Kode Matkul " + (i + 1) + " : " + kodeMatkul[i]);
            System.out.println("Nama Matkul " + (i + 1) + " : " + matkul[i]);
            System.out.println("Jumlah SKS    : " + sks[i]);
            System.out.println("----------------------------------------");
        }
    }
}
