package LatPrakPemDas5;

import java.util.Scanner;

public class MethodReturnValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, jur1, tgl1, tl1, nim2, nama2, jur2, tgl2, tl2;
        System.out.println("Masukan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.println("Masukan Tempat Lahir Mahasiswa 1: ");
        tl1 = in.nextLine();
        System.out.println("Masukan Tanggal lahir Mahasiswa 1 (DD-MM-YYYY):");
        tgl1 = in.nextLine();
        System.out.println();
        System.out.println("Masukan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        System.out.println("Masukan Tempat Lahir Mahasiswa 2: ");
        tl2 = in.nextLine();
        System.out.println("Masukan Tanggal lahir Mahasiswa 2 (DD-MM-YYYY):");
        tgl2 = in.nextLine();
        System.out.println();
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1, tl1, tgl1));
        System.out.println(showData(nim2, nama2, jur2, tl2, tgl2));
    }

    public static String showData(String nim, String nama, String jurusan, 
            String tl, String tgl) {
        int jumlah, tahun, umur;
        String status;
        jumlah = tgl.length();
        tahun = Integer.parseInt(tgl.substring(6, 10));
        umur = 2015 - tahun;
        status = (umur > 20) ? "adult" : "teen";
        String show = "\nnim : \n" + nim + "\nnama : \n" + nama
                + "\nJurusan : \n" + jurusan + "\nTempat Tanggal Lahir : \n"
                + tl + ", " + tgl + "\nStatus : \n" + status;
        return show;
    }
}
