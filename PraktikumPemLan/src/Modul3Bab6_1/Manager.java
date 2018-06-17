package Modul3Bab6_1;
public class Manager extends PegawaiTetap {
    private double tunjanganJabatan;
    public Manager(String nama, String idKerja, String jabatan, boolean istri, int anak, int tahun, int bulan, int hari) {
        super(nama, idKerja, jabatan, istri, anak, tahun, bulan, hari);
    }
    @Override
    public double getGaji() {
        tunjanganJabatan = super.getGaji() + (super.getGaji() * 0.1);
        return tunjanganJabatan;
    }
}
