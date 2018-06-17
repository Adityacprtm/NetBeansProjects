package Modul3Bab8;
public class Saxophone extends AlatMusikTiup {
    public Saxophone(String bahan, String nadaDasar) {
        super(bahan, nadaDasar);
    }
    @Override
    public String bahan() {
        return getBahan();
    }
    @Override
    public String nama() {
        return "Saxophone";
    }
    @Override
    public String toString() {
        return "NAMA\t\t: " + nama().toUpperCase() + super.toString();
    }
}