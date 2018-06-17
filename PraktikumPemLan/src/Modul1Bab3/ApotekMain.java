package Modul1Bab3;
import java.util.Scanner;
public class ApotekMain {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a, jumlah, kdobt, pmbl, i = 0;
        String nama, alamat, nmobt;
        System.out.print("Masukkan jumlah pembeli : ");
        pmbl = in.nextInt();
        Apotek pembeli[] = new Apotek[pmbl];
        for (i = 0; i < pembeli.length; i++) {
            System.out.println("\nMasukkan identitas");
            System.out.print("Masukkan nama : ");
            nama = in.next();
            System.out.print("Masukkan alamat : ");
            alamat = in.next();
            pembeli[i] = new Apotek(nama, alamat);
            do {
                System.out.println("====M E N U==== \n1. Lihat daftar obat \n2. Pilih kode obat \n3. Pilih nama obat \n4. Struk");
                System.out.print("Masukkan pilihan : ");
                a = in.nextInt();
                switch (a) {
                    case 1:
                        pembeli[i].listObat();
                        break;
                    case 2:
                        System.out.print("Ketikan kode obat : ");
                        kdobt = in.nextInt();
                        System.out.print("Jumlah obat : ");
                        jumlah = in.nextInt();
                        pembeli[i].pilihObat(kdobt, jumlah);
                        break;
                    case 3:
                        System.out.print("Ketikan nama obat : ");
                        nmobt = in.next();
                        System.out.print("Jumlah obat : ");
                        jumlah = in.nextInt();
                        pembeli[i].pilihObat(nmobt, jumlah);
                        break;
                    case 4:
                        pembeli[i].displayStruk();
                        break;
                    default:
                        System.out.println("Tidak ada dalam pilihan. mohon ulangi.");
                        break;
                }
            } while (a != 4);
        }
        System.out.println("\n155150207111081");
        System.out.println("\n>> copyright© by Aditya Chamim Pratama <<");
    }
}
