package uapsem2;

public class Ruby extends Member {

    public Ruby(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        super.setAnggota("Ruby");
    }

    @Override
    public double getDiskonProduk() {
        super.setDiskonProduk(super.getHargaProduk()- (super.getHargaProduk()* 0.5));
        return super.getDiskonProduk();
    }

    @Override
    public double getDiskonLayanan() {
        super.setDiskonLayanan(super.getBiayaLayanan() - (super.getBiayaLayanan() * 0.5));
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
