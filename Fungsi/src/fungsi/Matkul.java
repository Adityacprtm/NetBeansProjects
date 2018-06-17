package fungsi;

import java.util.Scanner;

public class Matkul {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama\t: ");
        String nama = in.nextLine();
        System.out.print("NIM\t: ");
        String nim = in.next();

        System.out.println();
        //matkul1,sks1,nlai1
        System.out.print("Matkul1\t: ");
        String matkul1 = in.next();
        System.out.print("SKS\t: ");
        int sks1 = in.nextInt();
        System.out.print("nilai\t: ");
        int nilai1 = in.nextInt();

        System.out.println();
        //matkul2,sks2,nlai2
        System.out.print("Matkul2\t: ");
        String matkul2 = in.next();
        System.out.print("SKS\t: ");
        int sks2 = in.nextInt();
        System.out.print("nilai\t: ");
        int nilai2 = in.nextInt();

        System.out.println();
        //matkul3,sks3,nlai3
        System.out.print("Matkul3\t: ");
        String matkul3 = in.next();
        System.out.print("SKS\t: ");
        int sks3 = in.nextInt();
        System.out.print("nilai\t: ");
        int nilai3 = in.nextInt();

        System.out.println();
        //matkul4,sks4,nlai4
        System.out.print("Matkul4\t: ");
        String matkul4 = in.next();
        System.out.print("SKS\t: ");
        int sks4 = in.nextInt();
        System.out.print("nilai\t: ");
        int nilai4 = in.nextInt();

        System.out.println();
        //finish
        System.out.println("Nama = " + nama);
        System.out.println("NIM  = " + nim);
        System.out.println("Matkul\t\tnilai\t\tSKS\t\thuruf");
        System.out.print(matkul1 + "\t\t" + nilai1 + "\t\t" + sks1 + "\t\t");
        System.out.println(nilaihuruf(nilai1));
        System.out.print(matkul2 + "\t\t" + nilai2 + "\t\t" + sks2 + "\t\t");
        System.out.println(nilaihuruf(nilai2));
        System.out.print(matkul3 + "\t\t" + nilai3 + "\t\t" + sks3 + "\t\t");
        System.out.println(nilaihuruf(nilai3));
        System.out.print(matkul4 + "\t\t" + nilai4 + "\t\t" + sks4 + "\t\t");
        System.out.println(nilaihuruf(nilai4));
        int ipsem = ((bobot(nilai1) * sks1) + (bobot(nilai2) * sks2) + (bobot(nilai3) * sks3) + (bobot(nilai4) * sks4)) / (sks1 + sks2 + sks3 + sks4);
        System.out.println("IP Semester = " + ipsem);
    }

    static int nilaihuruf(int a) {
        if (a > 80 && a < 100) {
            System.out.print("A");
        } else if (a > 70 && a <= 80) {
            System.out.print("B");
        } else if (a > 60 && a <= 70) {
            System.out.print("C");
        } else if (a > 50 && a <= 60) {
            System.out.print("D");
        } else if (a <= 50) {
            System.out.print("E");
        }
        return 1;
    }

    static int bobot(int b) {
        if (b > 80 && b < 100) {
            b = 4;
        } else if (b > 70 && b <= 80) {
            b = 3;
        } else if (b > 60 && b <= 70) {
            b = 2;
        } else if (b > 50 && b <= 60) {
            b = 1;
        } else if (b <= 50) {
            b = 0;
        }
        return b;
    }
}
