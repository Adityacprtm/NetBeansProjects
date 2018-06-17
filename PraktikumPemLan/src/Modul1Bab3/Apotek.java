package Modul1Bab3;
import java.util.Scanner;
public class Apotek {
    static Scanner in = new Scanner(System.in);
    int kodeObat[] = new int[]{100, 111, 122, 133, 144, 155, 166, 177, 188, 199},
            kodeDibeli[] = new int[10],
            hargaObat[] = new int[]{1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 5500},
            jumlah[] = new int[10], jumlah1[] = new int[10];
    String namaObat[] = new String[]{"vitamin", "betadin", "paracetamol", "amoxilin", "obh", "panadol", "paramex", "bodrex", "vicks", "fludane"},
            namaDibeli[] = new String[10];
    public String nama, alamat;
    public long total, total1;
    public Apotek() {
    }
    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public void listObat() {
        System.out.println("Daftar obat tersedia : ");
        System.out.println("Kode \t Nama Obat \t Harga");
        for (int i = 0; i < namaObat.length; i++) {
            int spasi = (19 - namaObat[i].length());
            System.out.printf("%d\t %s %" + spasi + "s \n", kodeObat[i], namaObat[i], hargaObat[i]);
        }System.out.println("");
    }
    public void pilihObat(int inKodeObat, int inJumlah) {
        for (int i = 0; i < kodeObat.length; i++) {
            if (inKodeObat == kodeObat[i]) {
                total1 = hargaObat[i] * inJumlah;
                jumlah1[i] = inJumlah;
                kodeDibeli[i] = kodeObat[i];
                System.out.println("-> SUKSES\n");
                break;
            }
        }
    }
    public void pilihObat(String inNamaObat, int inJumlah) {
        for (int i = 0; i < namaObat.length; i++) {
            if (inNamaObat.equals(namaObat[i])) {
                total = hargaObat[i] * inJumlah;
                jumlah[i] = inJumlah;
                namaDibeli[i] = namaObat[i];
                kodeDibeli[i] = kodeObat[i];
                System.out.println("-> SUKSES\n");
                break;
            }
        }
    }
    void displayStruk() {
        System.out.println("=====================S T R U K======================\nNama\t: " + nama + "\nAlamat\t: " + alamat);
        System.out.println("\nDaftar obat yang di pilih: \nKode \t Nama Obat \t Jumlah \tHarga");
        for (int i = 0; i < kodeObat.length; i++) {
            if (kodeDibeli[i] != 0) {
                int spasi = (16 - namaObat[i].length());
                System.out.printf("%d\t %s %" + spasi + "d\t\t%d \n", kodeObat[i], namaObat[i], (jumlah1[i] + jumlah[i]), hargaObat[i]);
            }
        }
        System.out.println("====================================================");
        System.out.println("Total harga obat : Rp." + (total + total1));
        System.out.println("====================================================");
    }
}