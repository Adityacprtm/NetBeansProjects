package Modul2Bab5;
public class Labkomdas {
    private final int jaketA = 100000, jaketB = 125000, jaketC = 175000;
    private int harga, hargaDiskon, jumlah, totalHarga;
    private String namaBarang;
    public Labkomdas() {
    }
    public int getHarga() {
        return this.harga;
    }
    public int getHargaDiskon() {
        return this.hargaDiskon;
    }
    public int getJumlah() {
        return this.jumlah;
    }
    public int getTotalHarga() {
        return this.totalHarga;
    }
    public int getDiskon() {
        return this.harga - this.hargaDiskon;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }
    public void pembelian(int i, int jml) {
        this.jumlah = jml;
        if (i == 1) {
            this.harga = this.jaketA;
            this.namaBarang = "Jaket A";
        } else if (i == 2) {
            this.harga = this.jaketB;
            this.namaBarang = "Jaket B";
        } else if (i == 3) {
            this.harga = this.jaketC;
            this.namaBarang = "Jaket C";
        }
        harga();
    }
    private void harga() {
        if (this.jumlah > 100) {
            if (this.harga == 100000 || this.harga == 125000) {
                this.hargaDiskon = this.harga - 5000;
            } else {
                this.hargaDiskon = this.harga - 15000;
            }
        } else {
            this.hargaDiskon = this.harga;
        }
        this.totalHarga = this.hargaDiskon * this.jumlah;
    }
}
