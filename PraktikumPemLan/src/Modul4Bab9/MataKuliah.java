package Modul4Bab9;
public abstract class MataKuliah {
    private Double tugas, kuis, uts, uas;
    public MataKuliah(Double tugas, Double kuis, Double uts, Double uas) {
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
    }
    public Double getTugas() {
        return tugas;
    }
    public Double getKuis() {
        return kuis;
    }
    public Double getUts() {
        return uts;
    }
    public Double getUas() {
        return uas;
    }
    public abstract double getNilai();
}
