
class Matrik {
// Data

    private int nBaris, nKolom;
    private double[][] itemDt;

    public Matrik(int nBrs, int nKlm) {
        nBaris = nBrs;
        nKolom = nKlm;
        itemDt = new double[nBaris][nKolom];
    }

    public Matrik(double[][] dt) {
        nBaris = dt.length;
        nKolom = dt[0].length;
        this.itemDt = new double[nBaris][nKolom];
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) {
                this.setItem(i, j, dt[i][j]);
            }
        }
    }

    /**
     * Fungsi untuk mendapatakan jumlah baris
     *
     * @return jumlah baris
     */
    public int getNBaris() {
        return nBaris;
    }

    public int getNKolom() {
        return nKolom;
    }

    public double getItem(int idB, int idK) {
        return this.itemDt[idB][idK];
    }

    public void setItem(int idB, int idK, double dt) {
        this.itemDt[idB][idK] = dt;
    }

    public Matrik tambah(Matrik x) {
        Matrik y = null;
        if ((this.nBaris == x.getNBaris()) && (this.nKolom == x.getNKolom())) {
            y = new Matrik(x.getNBaris(), x.getNKolom());
            for (int i = 0; i < this.nBaris; i++) {
                for (int j = 0; j < this.nKolom; j++) {
                    y.setItem(i, j, this.itemDt[i][j] + x.getItem(i, j));
                }
            }
        }
        return y;
    }

    public void cetak(String kom) {
        System.out.println(kom);
        for (int i = 0; i < this.nBaris; i++) {
            for (int j = 0; j < this.nKolom; j++) {
                System.out.print(this.itemDt[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
// implementasi untuk ADT_Matrik
        Matrik A, B, C;
        double[][] X = {{1, 2, 3}, {2, 14, 5}, {16, 8, 13}};
        double[][] Y = {{10, 12, 0}, {5, 1, 5}, {3, 1, 10}};
        A = new Matrik(X);
        B = new Matrik(Y);
        A.cetak("Matrik A");
        B.cetak("Matrik B");
        C = A.tambah(B);
        C.cetak("Matrik C = A + B");
        Larik lb, lk;
////        lb = A.getBaris(1); //D
//        lb.cetak("Larik baris ke-1");
////        lk = A.getKolom(1); //D
//        lk.cetak("Larik kolom ke-1");
    }
}
