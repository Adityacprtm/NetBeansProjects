package TugasPrakPemDas1;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("Program penghitung pemakaian listrik sederhana");
        Scanner input = new Scanner(System.in);
        String nama, lurah;
        int c, d, e, f;
        System.out.print("Masukkan Nama\t\t\t: ");
        nama = input.nextLine();
        System.out.print("Kelurahan\t\t\t: ");
        lurah = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter\t: ");
        c = input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter\t: ");
        d = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini\t: ");
        e = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)\t: ");
        f = input.nextInt();
        System.out.println("===================PLN Java===================");
        System.out.println("Nama\t\t\t\t: " + nama);
        System.out.println("Kelurahan\t\t\t: " + lurah);
        int p, q, r, s;
        p = d - c;
        System.out.println("Pemakaian bulan ini\t\t: " + p + " Kwh Meter");
        q = e * p;
        System.out.println("Tarif Listrik\t\t\t: " + "Rp " + q + ",-");
        r = q * f / 100;
        System.out.println("PPJ " + f + "%" + "\t\t\t\t: " + "Rp " + r + ",-");
        s = q + r;
        System.out.println("Total bayar\t\t\t: " + "Rp " + s + ",-");
        System.out.println("==============================================");
    }
}