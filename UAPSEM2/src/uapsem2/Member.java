package uapsem2;

public class Member extends Salon {

    private double diskonProduk;
    private double diskonLayanan;
    private double totalHarga;

    public Member(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
    }

    public void setDiskonLayanan(double diskonLayanan) {
        this.diskonLayanan = diskonLayanan;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setDiskonProduk(double diskonProduk) {
        this.diskonProduk = diskonProduk;
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
