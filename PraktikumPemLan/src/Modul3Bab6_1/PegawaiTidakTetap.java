package Modul3Bab6_1;
public class PegawaiTidakTetap extends Employee {
    private int lembur;
    public PegawaiTidakTetap(String nama, String idKerja, String jabatan, boolean istri, int anak, int tahun, int bulan, int hari) {
        super(nama, idKerja, jabatan, istri, anak, tahun, bulan, hari);
    }
    @Override
    public double getGaji() {
        double gaji = super.getGaji();
        gaji = gaji + getLembur() * 10000;
        return gaji;
    }
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    public int getLembur() {
        if (lembur > 10) {
            return lembur - 10;
        } else {
            return 0;
        }
    }
}
