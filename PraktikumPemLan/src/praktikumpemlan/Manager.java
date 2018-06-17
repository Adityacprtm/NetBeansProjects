package praktikumpemlan;

public class Manager extends pegawai {

    private double bonus = 5000;

    public Manager(String NIP, String nama, double gaji, boolean p, int masuk) {
        super(NIP, nama, gaji, p, masuk);
    }

    public void tambahgaji() {
        super.tambahgaji(bonus);
    }
}
