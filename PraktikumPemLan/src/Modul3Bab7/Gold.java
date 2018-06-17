package Modul3Bab7;
public class Gold extends Member {
    public Gold(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        this.anggota = "Gold";
    }
    @Override
    public double getDiskonLayanan() {
        super.setDiskonLayanan(super.getBiayaLayanan() - (super.getBiayaLayanan() * 0.15));
        return super.getDiskonLayanan();
    }
    @Override
    public double getTotalHarga() {
        super.setTotalHarga(super.getDiskonLayanan() + super.getDiskonProduk());
        return super.getTotalHarga();
    }
}
