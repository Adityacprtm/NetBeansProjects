package Modul4Bab9;
public class Pemlan extends MataKuliah {
    public Pemlan(Double tugas, Double kuis, Double uts, Double uas) {
        super(tugas, kuis, uts, uas);
    }
    @Override
    public double getNilai() {
        double nilai = (super.getTugas() * 0.3) + (super.getKuis() * 0.15) + (super.getUts() * 0.25) + (super.getUas() * 0.3);
        return nilai;
    }
}
