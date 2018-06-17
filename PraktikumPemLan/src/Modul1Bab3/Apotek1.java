package Modul1Bab3;

public class Apotek1 {

    private String nama, alamat;
    private String[][] obat = new String[10][2];
    private String[][] beli = new String[10][2];
    private int j = 0;
    private double total;

    public Apotek1() {
        for (int i = 0; i < beli.length; i++) {
            beli[i][0] = "kosong";
        }
    }

    public Apotek1(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        for (int i = 0; i < beli.length; i++) {
            beli[i][0] = "kosong";
        }
    }

    void setData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    void setData(String nama) {
        this.nama = nama;
    }

    void setObat(String[][] daftar) {
        for (int i = 0; i < 10; i++) {
            obat[i][0] = daftar[i][0];
            obat[i][1] = daftar[i][1];
        }
    }

    void pilihObat(int pilihan) {
        if (j <= 9) {
            beli[j][0] = obat[pilihan - 1][0];
            beli[j][1] = obat[pilihan - 1][1];
            j++;
        } else {
            System.out.println("Maaf, anda tidak dapat memilih lagi.");
        }
    }

    void lihatObat() {
        System.out.println("Daftar obat tersedia : ");
        System.out.println("No \t Nama Obat \t\t Harga");
        for (int i = 0; i < obat.length; i++) {
            int panjang = (27 - obat[i][0].length());
            System.out.printf("\n %d\t %s %" + panjang + "s ", (i + 1), obat[i][0], obat[i][1]);
        }
        System.out.println("\nMasukkan pilihan anda : ");
    }

    void lihatPasien() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Daftar obat yang di pilih: ");
        diambil();
    }

    void diambil() {
        System.out.println("No\t Nama Obat\t\t Harga");
        double total1 = 0;
        for (int i = 0; i < beli.length; i++) {
            if (beli[i][0] != "kosong") {
                int panjang = (27 - beli[i][0].length());
                System.out.printf("\n %d\t %s %" + panjang + "s ", (i + 1), beli[i][0], beli[i][1]);
                total1 = total1 + Double.parseDouble(beli[i][1]);
            }
        }
        System.out.println("\n====================================================");
        System.out.println("Total harga obat : Rp." + total1);
    }
}
