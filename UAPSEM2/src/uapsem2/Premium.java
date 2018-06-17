package uapsem2;

public class Premium extends Member {

    public Premium(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        super.setAnggota("Premium");
    }

    @Override
    public double getDiskonProduk() {
        super.setDiskonProduk(super.getHargaProduk() - (super.getHargaProduk() * 0.25));
        return super.getDiskonLayanan();
    }

    @Override
    public double getDiskonLayanan() {
        super.setDiskonLayanan(super.getBiayaLayanan() - (super.getBiayaLayanan() * 0.35));
        return super.getDiskonLayanan();
    }

    @Override
    public double getTotalHarga() {
        super.setTotalHarga(super.getDiskonLayanan() + super.getDiskonProduk());
        return super.getTotalHarga();
    }
    @Override
    public String toString() {
        return super.toString() + "\ndiskonProduk=" + getDiskonProduk() + "\ndiskonLayanan=" + getDiskonLayanan() + "\ntotalHarga=" + getTotalHarga();
    }
}
