package Modul1Bab2;
import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
        int pilihan, i = 0, j = 1;
        boolean login = false;
        Scanner input = new Scanner(System.in);
        ATM user[] = new ATM[3];
        user[1] = new ATM("Aditya", 123456, 987654321, 10000000);
        user[2] = new ATM("Chamim", 654321, 123456789, 5000000);
        System.out.println("=== SELAMAT DATANG ===");
        System.out.print("Masukkan PIN anda     : ");
        int cekPin = input.nextInt();
        System.out.print("Masukkan No Rekening  : ");
        int cekNoRek = input.nextInt();
        for (i = 1; i < user.length; i++) {
            login = user[i].setPIN(cekPin, cekNoRek);
            if (login == true) {
                System.out.println("-> LOGIN BERHASIL\nHai, "+user[i].nama);
                break;
            }
        }
        do {
            if (login == true) {
                System.out.println("\n== MENU ==");
                System.out.println("-> 1. INFO SALDO\n-> 2. TRANSFER\n-> 3. PENARIKAN\n-> 4. INFO MUTASI\n-> 5. KELUAR");
                System.out.print("Pilihan -> ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        user[i].infoSaldo();
                        break;
                    case 2:
                        j++;
                        if(j==3){
                            j=1;
                        }
                        user[i].transferUang(user[j]);
                        break;
                    case 3:
                        user[i].penarikanUang();
                        break;
                    case 4:
                        user[i].infoMutasi();
                        break;
                    case 5:
                        System.out.println("TERIMA KASIH TELAH BER-BANKING BERSAMA KAMI");
                        break;
                    default:
                        System.out.println("Pilihan Menu Tidak Tersedia");
                        break;
                }
            } else {
                System.out.println("-> LOGIN GAGAL");
                break;
            }
        } while (pilihan != 5);
        System.out.println("\n155150207111081\nAditya Chamim Pratama");
        System.out.println("\n>> copyright© by Aditya Chamim Pratama <<");
    }
}
