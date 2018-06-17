package Modul3Bab7;
public class Member extends Salon {
    private double diskonProduk;
    private double diskonLayanan;
    private double totalHarga;
    public Member(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        this.diskonProduk = super.getHargaProduk() - (super.getHargaProduk() * 0.1);
    }
    public void setDiskonLayanan(double diskonLayanan) {
        this.diskonLayanan = diskonLayanan;
    }
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    @Override
    public double getDiskonLayanan() {
        return this.diskonLayanan;
    }
    @Override
    public double getDiskonProduk() {
        return this.diskonProduk;
    }
    @Override
    public double getTotalHarga() {
        return this.totalHarga;
    }
}
