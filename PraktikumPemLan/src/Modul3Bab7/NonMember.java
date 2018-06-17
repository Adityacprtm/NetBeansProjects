package Modul3Bab7;
public class NonMember extends Salon {
    public NonMember(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        this.anggota = "Non Member";
    }
    @Override
    public double getDiskonLayanan() {
        return 0;
    }
    @Override
    public double getDiskonProduk() {
        return 0;
    }
    @Override
    public double getTotalHarga() {
        return super.getBiayaLayanan() + super.getHargaProduk();
    }
}
