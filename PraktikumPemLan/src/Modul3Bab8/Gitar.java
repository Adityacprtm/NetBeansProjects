package Modul3Bab8;
public class Gitar extends AlatMusikPetik {
    public Gitar(String bahan, String nadaDasar) {
        super(bahan, nadaDasar);
    }
    @Override
    public String bahan() {
        return getBahan();
    }
    @Override
    public String nama() {
        return "Gitar";
    }
    @Override
    public String toString() {
        return "NAMA\t\t: " + nama().toUpperCase() + super.toString();
    }
}