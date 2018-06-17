
package praktikumpemlan;

public class Boss extends pegawai {

    private double bonus;
    private int tunjangan;
    private int lama_kerja;

    public Boss(String nama, String NIP, double gaji, boolean p, int masuk, int lama_kerja) {
        super(nama, NIP, gaji, p, masuk);
        this.lama_kerja = lama_kerja;
        this.bonus = 10000;
        this.tunjangan = 500;
    }

    public void tambahGaji() {
        super.tambahgaji(bonus + (tunjangan * lama_kerja));
    }
}
