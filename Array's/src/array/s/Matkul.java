package array.s;

import java.util.Scanner;

public class Matkul {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama\t: ");
        String nama = in.nextLine();
        System.out.print("NIM\t: ");
        String nim = in.next();

        System.out.println();

        int nilai[] = new int[5];
        int sks[] = new int[5];

        System.out.print("Matkul1\t: ");
        String matkul1 = in.next();
        System.out.print("SKS\t: ");
        sks[1] = in.nextInt();
        System.out.print("nilai\t: ");
        nilai[1] = in.nextInt();

        System.out.println();

        System.out.print("Matkul2\t: ");
        String matkul2 = in.next();
        System.out.print("SKS\t: ");
        sks[2] = in.nextInt();
        System.out.print("nilai\t: ");
        nilai[2] = in.nextInt();

        System.out.println();

        System.out.print("Matkul3\t: ");
        String matkul3 = in.next();
        System.out.print("SKS\t: ");
        sks[3] = in.nextInt();
        System.out.print("nilai\t: ");
        nilai[3] = in.nextInt();

        System.out.println();

        System.out.print("Matkul4\t: ");
        String matkul4 = in.next();
        System.out.print("SKS\t: ");
        sks[4] = in.nextInt();
        System.out.print("nilai\t: ");
        nilai[4] = in.nextInt();

        System.out.println();

        //NILAI HURUF
        int nilaihuruf[] = new int[5];
        nilaihuruf[1] = nilai[1];
        nilaihuruf[2] = nilai[2];
        nilaihuruf[3] = nilai[3];
        nilaihuruf[4] = nilai[4];
        for (int i = 1; i < 5; i++) {
            if (nilaihuruf[i] > 80 && nilaihuruf[i] < 100) {
                String grade = "A";
            } else if (nilaihuruf[i] > 70 && nilaihuruf[i] <= 80) {
                String grade = "B";
            } else if (nilaihuruf[i] > 60 && nilaihuruf[i] <= 70) {
                String grade = "C";
            } else if (nilaihuruf[i] > 50 && nilaihuruf[i] <= 60) {
                String grade = "D";
            } else if (nilaihuruf[i] <= 50) {
                String grade = "D";
            }
        }

        //BOBOT
        int bobot[] = new int[5];
        bobot[1] = nilai[1];
        bobot[2] = nilai[2];
        bobot[3] = nilai[3];
        bobot[4] = nilai[4];
        for (int i = 1; i < 5; i++) {
            if (bobot[i] > 80 && bobot[i] < 100) {
                bobot[i] = 4;
            } else if (bobot[i] > 70 && bobot[i] <= 80) {
                bobot[i] = 3;
            } else if (bobot[i] > 60 && bobot[i] <= 70) {
                bobot[i] = 2;
            } else if (bobot[i] > 50 && bobot[i] <= 60) {
                bobot[i] = 1;
            } else if (bobot[i] <= 50) {
                bobot[i] = 0;
            }
        }

        //FINISHING
        System.out.println("Nama = " + nama);
        System.out.println("NIM  = " + nim);
        System.out.println("Matkul\t\tnilai\t\tSKS\t\thuruf");
        System.out.println(matkul1 + "\t\t" + nilai[1] + "\t\t" + sks[1] + "\t\t" + nilaihuruf[1]);
        System.out.println(matkul2 + "\t\t" + nilai[2] + "\t\t" + sks[2] + "\t\t" + nilaihuruf[2]);
        System.out.println(matkul3 + "\t\t" + nilai[3] + "\t\t" + sks[3] + "\t\t" + nilaihuruf[3]);
        System.out.println(matkul4 + "\t\t" + nilai[4] + "\t\t" + sks[4] + "\t\t" + nilaihuruf[4]);
        double ipsem = ((double) (bobot[1] * sks[1]) + (bobot[2] * sks[2]) + (bobot[3] * sks[3]) + (bobot[4] * sks[4])) / (sks[1] + sks[2] + sks[3] + sks[4]);
        System.out.println("IP Semester = " + ipsem);
    }
}
