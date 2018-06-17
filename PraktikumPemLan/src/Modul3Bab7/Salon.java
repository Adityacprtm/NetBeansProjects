package Modul3Bab7;
public abstract class Salon {
    private String nama;
    protected String anggota;
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
    public String getAnggota() {
        return anggota;
    }
    public String getLayanan() {
        return layanan;
    }
    public double getBiayaLayanan() {
        return biayaLayanan;
    }
    public String getProduk() {
        return produk;
    }
    public double getHargaProduk() {
        return hargaProduk;
    }
    public abstract double getDiskonLayanan();
    public abstract double getDiskonProduk();
    public abstract double getTotalHarga();
}
