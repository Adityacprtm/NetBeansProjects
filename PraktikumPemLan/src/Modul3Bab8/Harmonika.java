package Modul3Bab8;
public class Harmonika extends AlatMusikTiup {
    public Harmonika(String bahan, String nadaDasar) {
        super(bahan, nadaDasar);
    }
    @Override
    public String bahan() {
        return getBahan();
    }
    @Override
    public String nama() {
        return "Haronika";
    }
    @Override
    public String toString() {
        return "NAMA\t\t: " + nama().toUpperCase() + super.toString();
    }
}