package fungsi;

import java.util.Scanner;

public class LatihanFungsi {

    public static void main(String[] args) {
        String matkul = null;
        Scanner in = new Scanner(System.in);
        System.out.print("Nama = ");
        String nama = in.nextLine();
        System.out.print("NIM = ");
        String nim = in.next();
        MataKuliah1(matkul);
        MataKuliah2(matkul);
        MataKuliah3(matkul);
        MataKuliah4(matkul);

    }

    static int MataKuliah1(String matkul) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata Kuliah 1 = ");
        String matakul = in.next();
        System.out.print("Jumlah SKS = ");
        int sks = in.nextInt();
        System.out.print("nilai = ");
        int nilai = in.nextInt();
        if (nilai > 80 && nilai <= 100) {
            nilai = 4;
        } else if (nilai > 70 && nilai <= 80) {
            nilai = 3;
        } else if (nilai > 60 && nilai <= 70) {
            nilai = 2;
        } else if (nilai > 50 && nilai <= 60) {
            nilai = 1;
        } else if (nilai >= 0 && nilai <= 50) {
            nilai = 0;
        }
        System.out.println("IP = " + ((nilai * sks) / sks));
        return 0;
    }

    static int MataKuliah2(String matkul) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata Kuliah 2 = ");
        String matakul = in.next();
        System.out.print("Jumlah SKS = ");
        int sks = in.nextInt();
        System.out.print("nilai = ");
        int nilai = in.nextInt();
        if (nilai > 80 && nilai <= 100) {
            nilai = 4;
        } else if (nilai > 70 && nilai <= 80) {
            nilai = 3;
        } else if (nilai > 60 && nilai <= 70) {
            nilai = 2;
        } else if (nilai > 50 && nilai <= 60) {
            nilai = 1;
        } else if (nilai >= 0 && nilai <= 50) {
            nilai = 0;
        }
        System.out.println("IP = " + ((nilai * sks) / sks));
        return 0;
    }

    static int MataKuliah3(String matkul) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata Kuliah 3 = ");
        String matakul = in.next();
        System.out.print("Jumlah SKS = ");
        int sks = in.nextInt();
        System.out.print("nilai = ");
        int nilai = in.nextInt();
        if (nilai > 80 && nilai <= 100) {
            nilai = 4;
        } else if (nilai > 70 && nilai <= 80) {
            nilai = 3;
        } else if (nilai > 60 && nilai <= 70) {
            nilai = 2;
        } else if (nilai > 50 && nilai <= 60) {
            nilai = 1;
        } else if (nilai >= 0 && nilai <= 50) {
            nilai = 0;
        }
        System.out.println("IP = " + ((nilai * sks) / sks));
        return 0;
    }

    static int MataKuliah4(String matkul) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata Kuliah 4 = ");
        String matakul = in.next();
        System.out.print("Jumlah SKS = ");
        int sks = in.nextInt();
        System.out.print("nilai = ");
        int nilai = in.nextInt();
        if (nilai > 80 && nilai <= 100) {
            nilai = 4;
        } else if (nilai > 70 && nilai <= 80) {
            nilai = 3;
        } else if (nilai > 60 && nilai <= 70) {
            nilai = 2;
        } else if (nilai > 50 && nilai <= 60) {
            nilai = 1;
        } else if (nilai >= 0 && nilai <= 50) {
            nilai = 0;
        }
        System.out.println("IP = " + ((nilai * sks) / sks));
        return 0;
    }
}
