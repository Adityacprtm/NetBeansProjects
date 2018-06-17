package uapsem2;

public class NonMember extends Salon {

    public NonMember(String nama, String layanan, double biaya, String produk, double hargaProduk) {
        super(nama, layanan, biaya, produk, hargaProduk);
        super.setAnggota("NonMember");
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

    @Override
    public String toString() {
        return super.toString() + "\ndiskonProduk=" + 0 + "\ndiskonLayanan=" + 0 + "\ntotalHarga=" + getTotalHarga();
    }
}
