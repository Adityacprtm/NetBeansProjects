package Modul4Bab9;
public class ASD extends MataKuliah {
    public ASD(Double tugas, Double kuis, Double uts, Double uas) {
        super(tugas, kuis, uts, uas);
    }
    @Override
    public double getNilai() {
        double nilai = (super.getTugas() * 0.2) + (super.getKuis() * 0.2) + (super.getUts() * 0.3) + (super.getUas() * 0.3);
        return nilai;
    }
}
