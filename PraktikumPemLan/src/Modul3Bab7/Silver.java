package Modul3Bab7;
public class Silver extends Member {
    public Silver(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        this.anggota = "Silver";
    }
    @Override
    public double getDiskonLayanan() {
        super.setDiskonLayanan(super.getBiayaLayanan() - (super.getBiayaLayanan() * 0.1));
        return super.getDiskonLayanan();
    }
    @Override
    public double getTotalHarga() {
        super.setTotalHarga(super.getDiskonLayanan() + super.getDiskonProduk());
        return super.getTotalHarga();
    }
}
