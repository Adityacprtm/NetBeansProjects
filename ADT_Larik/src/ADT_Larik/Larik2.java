package ADT_Larik;

class Larik2 {
    //data (strukur data)

    private int size;
    private double[] itemDt;

    /**
     * Contructor untuk membuat ADT larik dari suatu array
     *
     * @param A : array bertipe int
     */
    public Larik2(double[] A) {
        this.size = A.length;
        this.itemDt = new double[this.size];
        for (int i = 0; i < this.size; i++) {
            this.itemDt[i] = A[i];
        }
    }

    /**
     * fungsi untu mendapatkan ukuran larik
     *
     * @return size dari larik
     */
    public int getSize() {
        return this.size;
    }

    /**
     * fungsi untuk mendapatkan item ke i dari suatu larik
     *
     * @param i : posisi item
     * @return item larik
     */
    public double getItem(int i) {
        return this.itemDt[i];
    }

    /**
     * fungsi static untuk menyambung dua buah larik l1 dan l2
     *
     * @param l1 : Larik
     * @param l2 : Larik
     * @return Larik
     */
    public static Larik2 sambung(Larik2 l1, Larik2 l2) {
// Lengkapi bagian ini
        double larikGabung[] = new double[l1.getSize() + l2.getSize()];
        for (int i = 0; i < larikGabung.length - l2.getSize(); i++) {
            larikGabung[i] = l1.itemDt[i];
        }
        for (int i = 0; i < larikGabung.length - l1.getSize(); i++) {
            larikGabung[i + l1.getSize()] = l2.itemDt[i];
        }
        Larik2 larik = new Larik2(larikGabung);
        return larik;
    }

    /**
     * procedure untuk isiItem suatu larik
     *
     * @param id : indeks larik
     * @param dt : item data yang akan disisipkan
     */
    public void isiItem(int id, double dt) {
        this.itemDt[id] = dt;
    }

    /**
     * procedure cetak suatu array
     *
     * @param komentar : String
     */
    public void cetak(String komentar) {
        System.out.println(komentar);
        for (int i = 0; i < this.size; i++) {
            System.out.printf("%.2f ", this.itemDt[i]);
        }
        System.out.println();
    }

    /**
     * fungsi untuk mendapatkan nilai terbesar dari suatu larik
     *
     * @return : item tebesar dari larik
     */
    public double findBesar() {
        double besar = this.itemDt[0];
        for (int i = 1; i < this.size; i++) {
            if (besar < this.itemDt[i]) {
                besar = this.itemDt[i];
            }
        }
        return besar;
    }

    /**
     * fungsi untuk mencari posisi suatu data tertentu di array
     *
     * @param dtCari : data yang akan dicari
     * @return posisiData
     */
    public int getPosisi(double dtCari) {
        int pos = -99;
        boolean ketemu = false;
        int i = 0;
        while (!ketemu && i < this.size) {
            if (dtCari == this.itemDt[i]) {
                ketemu = true;
                pos = i;
            }
            i++;
        }
        return pos;
    }

    /**
     * fungsi static untuk mencopy isi suatu larik l
     *
     * @param k : posisi awal
     * @param n : jumlah item yang akan dicopy
     * @param l : larik asal
     * @return Larik hasil copy
     */
    public static Larik2 copyLarik(int k, int n, Larik2 l) {
// lenkapi bagian ini
        double larikCopy[] = new double[n];
        if (n <= l.size - k) {
            for (int i = 0; i < n; i++) {
                larikCopy[i] = l.itemDt[k++];
            }
        }
        Larik2 larik = new Larik2(larikCopy);
        return larik;
    }

    /**
     * fungsi untuk mencari posisi terbesar suatu data suatu posisi awal sampai
     * akhir
     *
     * @param awal : posisi awal
     * @param akhir : posisi akhir
     * @return posisi data terbesar
     */
    public int getPosBesar(int awal, int akhir) {
        int posBesar = -1;
        double itemBesar;
        if (awal <= akhir) {
            posBesar = awal;
            itemBesar = this.getItem(awal);
            for (int i = awal + 1; i < akhir; i++) {
                double nilaiItem = this.getItem(i);
                if (itemBesar < nilaiItem) {
                    itemBesar = nilaiItem;
                    posBesar = i;
                }
            }
        }
        return posBesar;
    }

    /**
     * fungsi untuk mencari posisi data terkecil suatu array mulai dari posisi
     * awal sampai posisi akhir
     *
     * @param awal : posisi awal
     * @param akhir : posisi akhir
     * @return posisi data terkecil
     */
    public int getPosKecil(int awal, int akhir) {
// lenkapi bagian ini
        int posKecil = -1;
        double itemKecil;
        if (awal <= akhir) {
            posKecil = awal;
            itemKecil = this.getItem(awal);
            for (int i = awal + 1; i < akhir; i++) {
                double nilaiItem = this.getItem(i);
                if (itemKecil > nilaiItem) {
                    itemKecil = nilaiItem;
                    posKecil = i;
                }
            }
        }
        return posKecil;
    }

    /**
     * fungsi pengurutan suatu larik lAsal dimana kondisi lAsal akan tetap
     * setelah proses pengurutan
     *
     * @param lAsal : Array asal yang akan diurutkan
     * @param status : 0-> urut dari kecil ke besar 1-> urut dari besar ke kecil
     * @return Array baru hasil pengurutan
     */
    public static Larik2 SelectionSort(Larik2 lAsal, int status) {
        int n = lAsal.getSize();
        Larik2 lhasil = Larik2.copyLarik(0, n, lAsal);
        if (status == 0) {// urutkan data dari kecil ke besar
            for (int i = 0; i < n; i++) {
                int posKecil = lhasil.getPosKecil(i, n);
                double itemKecil = lhasil.getItem(posKecil);
                double itemI = lhasil.getItem(i);
                lhasil.isiItem(i, itemKecil);
                lhasil.isiItem(posKecil, itemI);
            }
        } else { // urutkan data dari besar ke kecil
            for (int i = 0; i < n; i++) {
                int posBesar = lhasil.getPosBesar(i, n);
                double itemBesar = lhasil.getItem(posBesar);
                double itemI = lhasil.getItem(i);
                lhasil.isiItem(i, itemBesar);
                lhasil.isiItem(posBesar, itemI);
            }
        }
        return lhasil;
    }

    public static double LarikKaliLarik(Larik2 l1, Larik2 l2) {
        double hasilKali = 0;
        for (int i = 0; i < l1.size; i++) {
            for (int j = 0; j < l2.size; j++) {
                if (i == j) {
                    hasilKali = hasilKali + l1.itemDt[i] * l2.itemDt[j];
                }
            }
        }
        return hasilKali;
    }
}
