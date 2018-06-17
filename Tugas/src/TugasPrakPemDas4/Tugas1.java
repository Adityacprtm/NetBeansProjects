package TugasPrakPemDas4;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan, BanyakData, jumlah = 0;
        System.out.print("Masukan Banyaknya data : ");
        BanyakData = in.nextInt();
        int input[] = new int[BanyakData];
        do {
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Keluar");
            System.out.print("Masukkan nilai : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < BanyakData; i++) {
                        System.out.print("Data(" + (i + 1) + ") : ");
                        input[i] = in.nextInt();
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < BanyakData; i++) {
                        System.out.println("Data(" + (i + 1) + ") : " + input[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0; i < BanyakData; i++) {
                        jumlah = jumlah + input[i];
                    }
                    double rata = (double) jumlah / BanyakData;
                    System.out.println("Rata-rata : " + rata + "\n");
                    break;
                case 4:
                    jumlah = 0;
                    for (int i = 0; i < BanyakData; i++) {
                        jumlah = jumlah + input[i];
                    }
                    System.out.println("Jumlah : " + jumlah + "\n");
                    break;
                case 5:
                    int maks = 0;
                    for (int i = 0; i < BanyakData; i++) {
                        maks = Math.max(maks, input[i]);
                    }
                    System.out.println("Nilai max : " + maks + "\n");
                    break;
                case 6:
                    int i = 0, mins = input[i];
                    for (i = 0; i < BanyakData; i++) {
                        mins = Math.min(mins, input[i]);
                    }
                    System.out.println("Nilai min : " + mins + "\n");
                    break;
                case 7:
                    System.out.println("Program dihentikan...");
                    break;
            }
        } while (pilihan != 7);
    }
}
