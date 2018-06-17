package Modul2Bab5;
import java.util.Scanner;
public class MainLabkomdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Labkomdas beli[] = new Labkomdas[10];
        int jml, pilih, count = 0;
        System.out.println("M E N U");
        System.out.println("1. Jaket berbahan A");
        System.out.println("2. Jaket berbahan B");
        System.out.println("3. Jaket berbahan C");
        System.out.println("4. Selesai");
        do {
            beli[count] = new Labkomdas();
            System.out.print("pilihan\t: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Jumlah\t: ");
                    jml = input.nextInt();
                    beli[count++].pembelian(1, jml);
                    break;
                case 2:
                    System.out.print("Jumlah\t: ");
                    jml = input.nextInt();
                    beli[count++].pembelian(2, jml);
                    break;
                case 3:
                    System.out.print("Jumlah\t: ");
                    jml = input.nextInt();
                    beli[count++].pembelian(3, jml);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
            System.out.println("--> SUKSES");
        } while (pilih != 4);
        System.out.println("=============================================================");
        System.out.printf("%-4s%-14s%-9s%-13s%-13s%s\n", "No", "Nama Barang", "Jumlah", "Harga/biji", "Diskon/biji", "Total");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-4d%-14s%-9s%-13s%-13s%s\n", (i + 1), beli[i].getNamaBarang(), beli[i].getJumlah(), beli[i].getHarga(), beli[i].getDiskon(), beli[i].getTotalHarga());
        }
        System.out.println("=============================================================");
        System.out.println("                       155150207111081");
        System.out.println("          >> copyright© by Aditya Chamim Pratama <<");
        System.out.println("=============================================================");
    }
}
