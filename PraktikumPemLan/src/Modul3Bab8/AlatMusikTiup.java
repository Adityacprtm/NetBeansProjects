package Modul3Bab8;
public abstract class AlatMusikTiup implements AlatMusik {
    private String bahan;
    private String nadaDasar;
    public AlatMusikTiup(String bahan, String nadaDasar) {
        this.bahan = bahan;
        this.nadaDasar = nadaDasar;
    }
    public String getBahan() {
        return bahan;
    }
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    public String getNadaDasar() {
        return nadaDasar;
    }
    public void setNadaDasar(String nadaDasar) {
        this.nadaDasar = nadaDasar;
    }
    @Override
    public String caraMain() {
        return "Ditiup";
    }
    @Override
    public String[] nadaDasar() {
        String[] x = new String[8];
        int n = 0, a = 0;
        for (int i = 0; i < nada.length; i++) {
            if (nada[i].equalsIgnoreCase(nadaDasar)) {
                a = i;
                while (n < 8) {
                    if (a > 6) {
                        a = 0;
                    }
                    x[n] = nada[a];
                    n++;
                    a++;
                }
            }
        }
        return x;
    }
    private String arrayToString() {
        StringBuilder sb = new StringBuilder();
        for (String str : nadaDasar()) {
            sb.append(str);
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return "\nCARA MAIN\t: " + caraMain().toUpperCase() + "\nBAHAN\t\t: " + bahan.toUpperCase() + "\nNADA DO\t\t: " + nadaDasar.toUpperCase() + "\nTANGGA NADA\t: " + arrayToString();
    }
}