package Modul1Bab2;
import java.util.Scanner;
public class ATM {
    Scanner input = new Scanner(System.in);
    public String nama;
    public int pin, norek;
    public long jumtrf = 0, penarikan = 0, saldo, temp = 0;
    int norek1;
    public ATM(String nama, int pin, int norek, long saldo) {
        this.nama = nama;
        this.pin = pin;
        this.norek = norek;
        this.saldo = saldo;
    }
    public boolean setPIN(int cekPin, int cekNoRek) {
        if (cekPin == this.pin && cekNoRek == this.norek) {
            return true;
        } else {
            return false;
        }
    }
    public void infoSaldo() {
        System.out.println("SALDO ANDA SAAT INI Rp." + saldo);
    }
    public void transferUang(ATM user) {
        System.out.println("== TRANSFER KE BANK LAIN ==");
        System.out.print("Masukan no rekening yang dituju : ");
        norek1 = input.nextInt();
        System.out.print("Masukkan jumlah yang ditransfer : ");
        jumtrf = input.nextLong();
        if (norek1 == user.norek) {
            System.out.println("-> Nomor rekening   = " + user.norek);
            System.out.println("-> a/n              = " + user.nama);
            System.out.println("-> Nominal transfer = " + jumtrf);
            if (jumtrf < saldo) {
                saldo = saldo - jumtrf;
                System.out.println("-> TRANSAKSI BERHASIL");
            } else {
                System.out.println("-> SALDO ANDA TIDAK MENCUKUPI UNTUK MELAKUKAN TRANSAKSI\nTransaksi dibatalkan...");
            }
        } else {
            System.out.println("Nomor rekening tidak terdaftar\nTransaksi dibatalkan...");
        }
    }
    public void penarikanUang() {
        System.out.println("== PENARIKAN UANG ==");
        System.out.print("Masukan jumlah uang : ");
        penarikan = input.nextLong();
        if (penarikan > saldo) {
            System.out.println("-> SALDO ANDA TIDAK MENCUKUPI\nTransaksi dibatalkan...");
        } else {
            saldo = saldo - penarikan;
            temp = penarikan + temp;
            System.out.println("-> TRANSAKSI BERHASIL");
        }
    }
    public void infoMutasi() {
        System.out.println("== INFO MUTASI ==");
        System.out.println("-> Transaksi terakhir ");
        System.out.println("Penarikan uang  : " + penarikan);
        System.out.println("Transfer uang   ");
        System.out.println("Ke rekening     : " + norek1);
        System.out.println("Jumlah transfer : " + jumtrf);
        System.out.println("Saldo akhir     : " + saldo);
    }
}
