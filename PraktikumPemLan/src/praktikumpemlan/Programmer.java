package praktikumpemlan;

public class Programmer extends pegawai {

    private double bonus;
    private int lembur;

    public Programmer(String NIP, String nama, double gaji, boolean p, int masuk, int lembur) {
        super(NIP, nama, gaji, p, masuk);
        this.lembur = 100 * lembur;
        this.bonus = 2000;
    }

    public void tambahGaji() {
        super.tambahgaji(bonus + lembur);

    }
}
