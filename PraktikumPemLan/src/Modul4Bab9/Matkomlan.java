package Modul4Bab9;
public class Matkomlan extends MataKuliah {
    public Matkomlan(Double tugas, Double kuis, Double uts, Double uas) {
        super(tugas, kuis, uts, uas);
    }
    @Override
    public double getNilai() {
        double nilai = (super.getTugas() * 0.2) + (super.getKuis() * 0.4) + (super.getUts() * 0.2) + (super.getUas() * 0.2);
        return nilai;
    }
}
