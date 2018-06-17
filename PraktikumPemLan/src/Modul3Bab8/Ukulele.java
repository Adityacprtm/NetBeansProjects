package Modul3Bab8;
public class Ukulele extends AlatMusikPetik {
    public Ukulele(String bahan, String nadaDasar) {
        super(bahan, nadaDasar);
    }
    @Override
    public String bahan() {
        return getBahan();
    }
    @Override
    public String nama() {
        return "Ukulele";
    }
    @Override
    public String toString() {
        return "NAMA\t\t: " + nama().toUpperCase() + super.toString();
    }
}