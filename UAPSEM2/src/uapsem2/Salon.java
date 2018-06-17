package uapsem2;

public abstract class Salon {

    private String nama;
    private String anggota;
    private String layanan;
    private double biayaLayanan;
    private String produk;
    private double hargaProduk;

    public Salon(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        this.nama = nama;
        this.layanan = layanan;
        this.biayaLayanan = biaya;
        this.produk = produk;
        this.hargaProduk = hargaProduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public double getBiayaLayanan() {
        return biayaLayanan;
    }

    public void setBiayaLayanan(double biayaLayanan) {
        this.biayaLayanan = biayaLayanan;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    @Override
    public String toString() {
        return "nama=" + nama + "\nanggota=" + anggota + "\nlayanan=" + layanan + "\nbiayaLayanan=" + biayaLayanan + "\nproduk=" + produk + "\nhargaProduk=" + hargaProduk;
    }

    public abstract double getDiskonLayanan();

    public abstract double getDiskonProduk();

    public abstract double getTotalHarga();
}
