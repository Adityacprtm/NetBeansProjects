package praktikumpemlan;

public class OB extends pegawai {

    private double bonus;
    private int jam_lembur;

    public OB(String nama, String NIP, double gaji, boolean p, int masuk, int jam_lembur) {
        super(nama, NIP, gaji, p, masuk);
        this.jam_lembur = jam_lembur;
        this.bonus = 50;
    }

    public void tambahGaji() {
        super.tambahgaji(bonus * jam_lembur);
    }
}
