/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT_Larik;

/**
 * ADT Matrik
 *
 * @author achmad ridok
 */
public class Matrik2 {

    private int nBaris, nKolom;
    private double[][] itemDt;

    /**
     * constructor untuk membuat suatu matrik
     *
     * @param nBrs : banyaknya baris
     * @param nKlm : banyaknya kolom
     */
    public Matrik2(int nBrs, int nKlm) {
        nBaris = nBrs;
        nKolom = nKlm;
        itemDt = new double[nBaris][nKolom];
    }

    /**
     * constructor untuk membuat matrik dari array 2 dimensi
     *
     * @param A : array dua dimensi
     */
    public Matrik2(double[][] A) {
        this(A.length, A[0].length); // panggil contructor
        this.nBaris = A.length;
        this.nKolom = A[0].length;
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) {
                this.itemDt[i][j] = A[i][j];
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

    /**
     * fungsi tambah antara dua matrik A dan B
     *
     * @param A : Matrik
     * @param B : Matrik
     * @return Matrik hasil
     */
    public static Matrik2 tambah(Matrik2 A, Matrik2 B) {
// tambahkan bagian ini
        Matrik2 mTambah = null;
        if ((A.nBaris == B.getNBaris()) && (A.nKolom == B.getNKolom())) {
            mTambah = new Matrik2(A.getNBaris(), A.getNKolom());
            for (int i = 0; i < A.nBaris; i++) {
                for (int j = 0; j < A.nKolom; j++) {
                    mTambah.setItem(i, j, A.itemDt[i][j] + B.getItem(i, j));
                }
            }
        }
        return mTambah;
    }

    /**
     * fungsi static perkalian antara vektor dengan matrik Syarat : lebar L sama
     * dengan jumlah baris M
     *
     * @param L : Vector (Larik)
     * @param M : Matrik
     * @return Vector (Larik) berdimensi nKolom dari M
     */
    public static Larik12 VektorKaliMatrik(Larik12 L, Matrik2 M) {
        Larik12 lHasil = null;
        Larik12 lKolom = null;
        if (L.getSize() == M.getNBaris()) {
            lHasil = new Larik12(M.getNKolom());
            for (int i = 0; i < M.getNKolom(); i++) {
                lKolom = M.getKolom(i);
                double hasil = Larik12.LarikKaliLarik(L, lKolom);
                System.out.println(hasil);
                lHasil.isiItem(i, hasil);
            }
        }
        return lHasil;
    }

    /**
     * fungsi static tranpos suatu matrik
     *
     * @param A : Matrik
     * @return Matrik tranpos
     */
    public static Matrik2 tranpos(Matrik2 A) {
// lenkapi bagian ini
        Matrik2 mT = new Matrik2(A.getNKolom(), A.getNBaris());
        for (int i = 0; i < A.getNKolom(); i++) {
            for (int j = 0; j < A.getNBaris(); j++) {
                mT.setItem(i, j, A.itemDt[j][i]);
            }
        }
        return mT;
    }

    /**
     * fungsi untuk mendapatkan vektor baris dari matrik
     *
     * @param idBaris : indek baris yang akan diekstrak* @return Larik
     * representasi baris
     */
    public Larik12 getBaris(int idBaris) {
// lenkapi bagian ini
        Larik12 l = new Larik12(this.nKolom);
        for (int i = 0; i < this.nKolom; i++) {
            double itemBaris = this.getItem(idBaris, i);
            l.isiItem(i, itemBaris);
        }
        return l;
    }

    /**
     * fugsi untuk mendapatkan vektor kolom suatu matrik
     *
     * @param idKolom : id kolom yang akan diekstrak
     * @return Larik representasi kolom
     */
    public Larik12 getKolom(int idKolom) {
        Larik12 l = new Larik12(this.nBaris);
        for (int i = 0; i < this.nBaris; i++) {
            double itemKolom = this.getItem(i, idKolom);
            l.isiItem(i, itemKolom);
        }
        return l;
    }

    /**
     * procedure cetak
     *
     * @param kom
     */
    public void cetak(String kom) {
        System.out.println(kom);
        for (int i = 0; i < this.nBaris; i++) {
            for (int j = 0; j < this.nKolom; j++) {
                System.out.printf("%.2f ", this.itemDt[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrik2 A, B, C;
        double[][] data1 = {{1, 2, 3}, {3, 4, 7}};
        double[][] data2 = {{4, 5, 1}, {6, 1, 9}};
        A = new Matrik2(data1);
        B = new Matrik2(data2);
        A.cetak("A");
        B.cetak("B");
        C = Matrik2.tambah(A, B);
        C.cetak("C");
        Matrik2 CT = Matrik2.tranpos(C);
        CT.cetak("Tsanpos");
        Larik12 l1 = C.getBaris(1);
        l1.cetak("Baris ke 1 dari C");
        Larik12 l2 = Matrik2.VektorKaliMatrik(l1, CT);
        l2.cetak("Hasil kali C.L1");
    }
}
