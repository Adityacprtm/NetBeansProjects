package Modul3Bab7;
public class Premium extends Member {
    public Premium(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        this.anggota = "Premium";
    }
    @Override
    public double getDiskonLayanan() {
        super.setDiskonLayanan(super.getBiayaLayanan() - (super.getBiayaLayanan() * 0.2));
        return super.getDiskonLayanan();
    }
    @Override
    public double getTotalHarga() {
        super.setTotalHarga(super.getDiskonLayanan() + super.getDiskonProduk());
        return super.getTotalHarga();
    }
}
