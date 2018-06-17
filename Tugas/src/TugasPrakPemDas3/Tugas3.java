package TugasPrakPemDas3;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p, l, t, r;
        int pilihan;
        final double phi = 3.14;
        do {
            System.out.println("Menu :");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 0:
                    System.out.println("Program Dihentikan...");
                    break;
                case 1:
                    System.out.print("Masukan Panjang (cm)\t= ");
                    p = in.nextInt();
                    System.out.print("Masukan Lebar (cm)\t= ");
                    l = in.nextInt();
                    System.out.print("Masukan Tinggi (cm)\t= ");
                    t = in.nextInt();
                    System.out.printf("%s%.2f%s\n\n", "Volume Balok\t\t= ", (p * l * t), " cm3");
                    break;
                case 2:
                    System.out.print("Masukan Jari-Jari (cm)\t= ");
                    r = in.nextInt();
                    System.out.printf("%s%.2f%s\n\n", "Volume Bola\t\t= ", ((float) 4 / 3 * phi * r * r * r), " cm3");
                    break;
                case 3:
                    System.out.print("Masukan Jari-Jari (cm)\t= ");
                    r = in.nextInt();
                    System.out.print("Masukan Tinggi (cm)\t= ");
                    t = in.nextInt();
                    System.out.printf("%s%.2f%s\n\n", "Volume Kerucut\t\t= ", ((float) 1 / 3 * phi * r * r * t), " cm3");
                    break;
                case 4:
                    System.out.print("Masukan Jari-Jari (cm)\t= ");
                    r = in.nextInt();
                    System.out.print("Masukan Tinggi (cm)\t= ");
                    t = in.nextInt();
                    System.out.printf("%s%.2f%s\n\n", "Volume Silinder\t\t= ", (phi * r * r * t), " cm3");
                    break;
                case 5:
                    System.out.print("Masukan Panjang alas (cm)\t= ");
                    p = in.nextInt();
                    System.out.print("Masukan Lebar alas (cm)\t\t= ");
                    l = in.nextInt();
                    System.out.print("Masukan Tinggi (cm)\t\t= ");
                    t = in.nextInt();
                    System.out.printf("%s%.2f%s\n\n", "Volume Limas Segitiga\t\t= ", ((float) 1 / 3 * (0.5 * p * l) * t), " cm3");
                    break;
                default:
                    System.out.println("Pilihan salah\n");
            }
        } while (pilihan != 0);
    }
}
