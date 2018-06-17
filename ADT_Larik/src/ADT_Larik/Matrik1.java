package ADT_Larik;

public class Matrik1 {
// Data

    private int nBaris, nKolom;
    private double[][] itemDt;

    public Matrik1(int nBrs, int nKlm) {
        nBaris = nBrs;
        nKolom = nKlm;
        itemDt = new double[nBaris][nKolom];
    }

    public Matrik1(double[][] dt) {
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

    public Matrik1 tambah(Matrik1 x) {
        Matrik1 mTambah = null;
        if ((this.nBaris == x.getNBaris()) && (this.nKolom == x.getNKolom())) {
            mTambah = new Matrik1(x.getNBaris(), x.getNKolom());
            for (int i = 0; i < this.nBaris; i++) {
                for (int j = 0; j < this.nKolom; j++) {
                    mTambah.setItem(i, j, this.itemDt[i][j] + x.getItem(i, j));
                }
            }
        }
        return mTambah;
    }

    public double[][] toDArray() {
        double[][] toArray = new double[nBaris][nBaris];
        for (int i = 0; i < toArray.length; i++) {
            for (int j = 0; j < toArray.length; j++) {
                toArray[i][j] = this.itemDt[i][j];
            }
            System.out.println();
        }
        return toArray;
    }

    public Matrik1 tranposeMatrik() {
// lenkapi bagian ini
        double[][] mT = new double[nKolom][nBaris];
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) {
                mT[i][j] = itemDt[j][i];
            }
        }
        Matrik1 a = new Matrik1(mT);
        return a;
    }

    public Matrik1 kali(Matrik1 m) {
        Matrik1 mKali = null;
        if ((this.nBaris == m.getNKolom())) {
            mKali = new Matrik1(m.getNKolom(), m.getNKolom());
            int hasil[][] = new int[this.itemDt.length][m.itemDt[0].length];
            for (int i = 0; i < hasil.length; i++) {
                for (int j = 0; j < hasil[0].length; j++) {
                    for (int k = 0; k < this.itemDt[0].length; k++) {
                        hasil[i][j] += this.itemDt[i][k] * m.itemDt[k][j];
                        mKali.setItem(i, j, hasil[i][j]);
                    }
                }
            }
        }
        return mKali;
    }

    public Larik12 getBaris(int idB) {
// lenkapi bagian ini
        Larik12 lBaris = new Larik12(nKolom);
        for (int i = 0; i < nKolom; i++) {
            lBaris.isiItem(i, itemDt[idB - 1][i]);
        }
        return lBaris;
    }

    public Larik12 getKolom(int idK) {
        Larik12 lKolom = new Larik12(nBaris);
        for (int i = 0; i < nBaris; i++) {
            lKolom.isiItem(i, itemDt[i][idK - 1]);
        }
        return lKolom;
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
        Matrik1 A, B, C, D;

        double[][] X = {{1, 2, 3}, {2, 14, 5}, {16, 8, 13}};
        double[][] Y = {{10, 12, 0}, {5, 1, 5}, {3, 1, 10}};

        A = new Matrik1(X);
        B = new Matrik1(Y);

        A.cetak("Matrik A");
        B.cetak("Matrik B");

        C = A.tambah(B);
        C.cetak("Matrik C = A + B");

        Larik12 lb, lk;
        lb = A.getBaris(1);
        lb.cetak("Larik baris ke-1");
        lk = B.getKolom(1);
        lk.cetak("Larik kolom ke-1");

        A.tranposeMatrik().cetak("tranpos A");
        D = A.kali(B);
        D.cetak("Matrik D = A x B");
    }
}
