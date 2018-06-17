package UTPSem2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BarangToko {

    private String namaBarang;
    private String jenisBarang;
    private String hargaBarang;
    private String namaProdusen;
    private String tempatProduksi;
    private String kodeBarang;
    private int stokBarang;
    private String tglKadaluarsa;

    public BarangToko(String namabarang, String hargabarang, String kodebarang, int stokbarang) {
        this.namaBarang = namabarang;
        this.hargaBarang = hargabarang;
        this.kodeBarang = kodebarang;
        this.stokBarang = stokbarang;
        jenisBarang(this.kodeBarang);
        tanggalKadaluarsa(this.kodeBarang);
    }

    //SET
    public void setNamaProdusen(String namaprodusen) {
        this.namaProdusen = namaprodusen;
    }

    public void setTempatProduksi(String tempatproduksi) {
        this.tempatProduksi = tempatproduksi;
    }

    //GET
    public String getNamaBarang() {
        return this.namaBarang;
    }

    public String getJenisBarang() {
        return this.jenisBarang;
    }

    public String getHargaBarang() {
        return this.hargaBarang;
    }

    public String getKodeBarang() {
        return this.kodeBarang;
    }

    public String getNamaProdusen() {
        return this.namaProdusen;
    }

    public String getTempatProduksi() {
        return this.tempatProduksi;
    }

    public int getStokBarang() {
        return this.stokBarang;
    }

    public String getTglKadaluarsa() {
        return this.tglKadaluarsa;
    }

    //METHOD
    private void jenisBarang(String kodebarang) {
        String[] kode = kodebarang.split("-");
        if (kode[1].equals("27")) {
            this.jenisBarang = "makanan";
        } else if (kode[1].equals("03")) {
            this.jenisBarang = "minuman";
        } else if (kode[1].equals("96")) {
            this.jenisBarang = "elektronik";
        }
    }

    private void tanggalKadaluarsa(String kodebarang) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String[] tgl = (sdf.format(date)).split("-");
        int tahun = Integer.parseInt(tgl[2]);

        String[] thn = kodebarang.split("-");
        int tahun1 = Integer.parseInt(thn[2]);

        if (tahun1 < tahun) {
            this.tglKadaluarsa = "kadaluarsa";
        } else {
            this.tglKadaluarsa = "belum kadaluarsa";
        }
    }

    public void jualBarang(int jumlah) {
        this.stokBarang -= jumlah;
    }

    public void tambahBarang(int jumlah) {
        this.stokBarang += jumlah;
    }
}
