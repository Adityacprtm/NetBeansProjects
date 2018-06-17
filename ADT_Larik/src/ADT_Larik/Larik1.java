package ADT_Larik;

class Larik1 {
//data (strukur data)

    private int size;
    private int[] itemDt;
//method

    public void buatLarik(int n) {
        this.size = n;
        this.itemDt = new int[this.size];
    }

    public Larik1(int n) {
        buatLarik(n);
    }

    public int getSize() {
        return this.size;
    }

    public Larik1(int[] dt) {
        buatLarik(dt.length);
        for (int i = 0; i < dt.length; i++) {
            isiItem(i, dt[i]);
        }
    }

    public void isiItem(int id, int dt) {
        this.itemDt[id] = dt;
    }

    public void cetak(String komentar) {
        System.out.println(komentar);
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.itemDt[i] + " ");
        }
        System.out.println();
    }

    public int findBesar() {
        int besar = this.itemDt[0];
        for (int i = 1; i < this.size; i++) {
            if (besar < this.itemDt[i]) {
                besar = this.itemDt[i];
            }
        }
        return besar;
    }

    /**
     * program ini mencari posisi suatu data tertentu di larik
     */
    public int getPosisi(int dtCari) {
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

    private int getPosMax(int id) {
        int max = this.itemDt[id];
        int posMax = id;
        for (int i = id + 1; i < size; i++) {
            if (max <= this.itemDt[i]) {
                max = this.itemDt[i];
                posMax = i;
            }
        }
        return posMax;
    }

    private int getPosMin(int id) {
        int min = this.itemDt[id];
        int posMin = id;
        for (int i = id + 1; i < size; i++) {
            if (min >= this.itemDt[i]) {
                min = this.itemDt[i];
                posMin = i;
            }
        }
        return posMin;
    }

    public int PencarianBiner(int dtCari, int awal, int akhir) {
        int pos = -99;
        int tengah = (awal + akhir) / 2;
        if (dtCari < this.itemDt[tengah]) {
            return PencarianBiner(dtCari, awal, tengah);
        } else if (dtCari > this.itemDt[tengah]) {
            return PencarianBiner(dtCari, tengah + 1, akhir);
        } else if (dtCari == this.itemDt[tengah]) {
            return tengah;
        } else {
            return pos;
        }
    }

    /**
     * program untuk mencopy isi suatu Larik mulai dari posisi k sebanyak n item
     * hasilnya dikeluarkan sebagai array baru
     */
    public Larik1 copyLarik(int k, int n) {
        Larik1 lHasil = null;
        if (n <= this.size - k) {
            lHasil = new Larik1(n);
            int j = 0;
            for (int i = k; i < k + n; i++) {
                lHasil.isiItem(j++, this.itemDt[i]);
            }
        }
        return lHasil;
    }

    /**
     * pilihan 0 : urutkan dari kecil ke besar lainya : urutkan dari besar ke
     * kecil Algoritma pengurutan ini menggunakan selection sort
     */
    public Larik1 SelectionSort(int pilihan) {
        Larik1 lsort = copyLarik(0, size);
        for (int i = 0; i < lsort.getSize(); i++) {
            int posData;
            if (pilihan == 0) {
                posData = lsort.getPosMin(i);
            } else {
                posData = lsort.getPosMax(i);
            }
            int dt1 = lsort.itemDt[i];
            int dt2 = lsort.itemDt[posData];
            lsort.itemDt[i] = dt2;
            lsort.itemDt[posData] = dt1;
        }
        return lsort;
    }

    public void findPosGenap(int x1, int x2) {
        int genap;
        for (int i = x1; i <= x2; i++) {
            for (int j = 0; j < size; j++) {
                if (itemDt[j] == i) {
                    if (itemDt[j] % 2 == 0) {
                        genap = itemDt[j];
                        System.out.println(genap + " di indeks " + j);
                    }
                }
            }
        }
    }

    private static void BubbleSort(int[] dtArray, int status) {
        int i, j, k, temp;
        for (i = 1; i < dtArray.length - 1; i++) {
            System.out.println("Buble Sort ke - " + i);
            if (status == 0) { //0 = kecil ke besar
                for (j = dtArray.length - 1; j >= i; j--) {
                    if (dtArray[j - 1] > dtArray[j]) {
                        temp = dtArray[j];
                        dtArray[j] = dtArray[j - 1];
                        dtArray[j - 1] = temp;
                    }
                }
            } else { // lainnya = besar ke kecil
                for (j = dtArray.length - 1; j >= i; j--) {
                    if (dtArray[j - 1] < dtArray[j]) {
                        temp = dtArray[j];
                        dtArray[j] = dtArray[j - 1];
                        dtArray[j - 1] = temp;
                    }
                }
            }
            for (k = 0; k < dtArray.length; k++) {
                System.out.print(dtArray[k] + "   ");
            }
            System.out.println();
        }
    }

    public static Larik1 copyLarik1(int k, int n, Larik1 l) {
// lenkapi bagian ini
        int larikCopy[] = new int[n];
        if (n <= l.size - k) {
            for (int i = 0; i < n; i++) {
                larikCopy[i] = l.itemDt[k++];
            }
        }
        Larik1 larik = new Larik1(larikCopy);
        return larik;
    }

    public int getItem(int i) {
        return this.itemDt[i];
    }

    public static Larik1 mergeSort(Larik1 list) {
        if (list.size <= 1) {
            return list;
        }

        // Split the array in half
        int[] first = new int[list.size / 2];
        int[] second = new int[list.size - first.length];

//        System.arraycopy(list, 0, first, 0, first.length);
//        System.arraycopy(list, first.length, second, 0, second.length);
        Larik1 first2 = new Larik1(first);
        Larik1 second2 = new Larik1(second);
        first2 = copyLarik1(0, first.length, list);
        second2 = copyLarik1(first.length, second.length, list);

        // Sort each half
        mergeSort(first2);
        mergeSort(second2);

        // Merge the halves together, overwriting the original array
        merge(first2, second2, list);
        return list;
    }

    private static void merge(Larik1 first, Larik1 second, Larik1 result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;
        result.cetak("result");
        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.size && iSecond < second.size) {
            if (first.getItem(iFirst) < second.getItem(iSecond)) {
                result.isiItem(j, first.getItem(iFirst));
                iFirst++;
            } else {
                result.isiItem(j, second.getItem(iSecond));
                iSecond++;
            }
            j++;
        }
        // copy what's left
//        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
//        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
        Larik1 first2 = copyLarik1(0, first.size, result);
        Larik1 second2 = copyLarik1(first.size, second.size, result);

    }

    public static void main(String[] args) {
        int[] A = {2, 34, 5, 7, 10};
        Larik1 lA = new Larik1(A);
        lA.cetak("Sebelum");
        lA.SelectionSort(0).cetak("Sesudah di sort");
//        int k = lA.PencarianBiner(34, 0, 5);
//        System.out.println(k);
        Larik1 lB = lA.SelectionSort(0);
        int p = lB.PencarianBiner(10, 0, 5);
        System.out.println(p);
        lB.findPosGenap(0, 50);
        BubbleSort(A, 0);
        mergeSort(lA).cetak("Mergesort");
    }
}
